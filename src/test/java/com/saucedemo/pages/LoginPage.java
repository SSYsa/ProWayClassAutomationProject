package com.saucedemo.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigate() {
        page.navigate("https://www.saucedemo.com/");
    }

    public void enterUsername(String username) {
        // XPath for <input id="user-name">
        page.locator("xpath=//input[@id='user-name']").fill(username);
    }

    public void enterPassword(String password) {
        // XPath for <input id="password">
        page.locator("xpath=//input[@id='password']").fill(password);
    }

    public void clickLogin() {
        // XPath for <input id="login-button">
        page.locator("xpath=//input[@id='login-button']").click();
    }

    public boolean isLoggedIn() {
        // Checks that the current URL contains "inventory.html"
        return page.url().contains("inventory.html");
    }
}
