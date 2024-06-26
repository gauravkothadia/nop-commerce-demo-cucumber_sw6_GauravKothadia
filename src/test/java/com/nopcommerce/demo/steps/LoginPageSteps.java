package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(), errorMessage);
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals(new LoginPage().getTextFromLogoutLink(), "Log out");
    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogoutLink();
    }

    @Then("I should be able to logout successfully")
    public void iShouldBeAbleToLogoutSuccessfully() {
        String expectedMessage = "Log in";
        String actualMessage = new HomePage().getLoginLinkText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
