package starter.StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;

import static org.junit.Assert.*; //fungsi assert

public class LoginStepDefinition {

    LoginPage loginPage;
    InventoryPage inventoryPage;
    @Given("I am already on log in page")
    public void iamAlreadyOnLoginPage(){
        loginPage.open();
    }
    @When("I input username {string}")
    public void iInputUsername(String username) {
        loginPage.InputUsername(username);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) {
        loginPage.InputPassword(password);
    }
    @And("I click login button")
    public void IClickLoginButton(){
        loginPage.clickButton();
    }

    @Then("I redirected to inventory page")
    public void IRedirectedToInventoryPage(){
        assertEquals("https://www.saucedemo.com/inventory.html",inventoryPage.getUrl());
        assertEquals("PRODUCTS",inventoryPage.getHeaderTitle());
    }

    @Given("User already login")
    public void UserAlreadyLogin(){
        loginPage.open();
        loginPage.InputUsername("standard_user");
        loginPage.InputPassword("secret_sauce");
        loginPage.clickButton();
    }


}
