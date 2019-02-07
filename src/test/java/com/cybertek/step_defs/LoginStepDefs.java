package com.cybertek.step_defs;

import com.cybertek.pages.LandingPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

import sun.rmi.runtime.Log;

public class LoginStepDefs {

    @Given("manager is on the landing page")
    public void manager_is_on_the_landing_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @When("manager click onBriteErpDemo button")
    public void manager_click_onBriteErpDemo_button() {
        LandingPage landingPage=new LandingPage();
        landingPage.briteErpDemoButton.click();

    }

    @Then("the title should be Login | Website localhost")
    public void the_title_should_be_Login_Website_localhost() {
        Assert.assertEquals("Login | Website localhost",Driver.getDriver().getTitle());

    }

    @Then("the database should be {string}")
    public void the_database_should_be(String exceptedTest) {
        LoginPage loginPage=new LoginPage();
        Assert.assertEquals(exceptedTest,loginPage.databaseText.getAttribute("value"));
    }

    @When("the manager enters valid address")
    public void the_manager_enters_valid_address() {
        LoginPage loginPage=new LoginPage();
        loginPage.emailInput.sendKeys(ConfigReader.getProperty("manager"));
    }

    @When("the manager enters valid password")
    public void the_manager_enters_valid_password() {
        LoginPage loginPage=new LoginPage();
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("managerpass"));
    }

    @When("the manager clicks Log in button")
    public void the_manager_clicks_Log_in_button() {
        LoginPage loginPage=new LoginPage();
        loginPage.loginButton.click();
    }

    @Then("the title should be Odoo")
    public void the_title_should_be_Odoo() {
        Assert.assertEquals("Odoo",Driver.getDriver().getTitle());

    }


}
