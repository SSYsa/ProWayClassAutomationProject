Feature: Login válido no Saucedemo

  Scenario: Login com usuário padrão
    Given que estou na página de login
    When eu faço login com username "standard_user" e password "secret_sauce"
    Then devo ser redirecionado para a página de produtos
