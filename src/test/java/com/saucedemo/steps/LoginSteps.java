package com.saucedemo.steps;

import com.microsoft.playwright.*;
import com.saucedemo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginSteps {
    static Playwright playwright;
    static Browser browser;
    BrowserContext context;
    Page page;
    LoginPage loginPage;

    @Given("que estou na página de login")
    public void abrir_pagina_login() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
        loginPage = new LoginPage(page);
        loginPage.navigate();
    }

    @When("eu faço login com username {string} e password {string}")
    public void realizar_login(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("devo ser redirecionado para a página de produtos")
    public void verificar_login() {
        Assertions.assertEquals(true, loginPage.isLoggedIn());
        context.close();
        browser.close();
        playwright.close();
    }


}
