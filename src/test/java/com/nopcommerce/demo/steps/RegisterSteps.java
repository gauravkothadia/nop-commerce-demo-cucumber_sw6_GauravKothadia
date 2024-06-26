package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }


    @Then("I should be able to navigate to Register page showing {string} text")
    public void i_should_be_able_to_navigate_to_register_page_showing_text(String registerText) {
        Assert.assertEquals(new RegisterPage().getTextOfRegister(), registerText);
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should be able to see error messages at mandatory fields")
    public void iShouldBeAbleToSeeErrorMessagesAtMandatoryFields() {
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(new RegisterPage().getTextOfFirstName(), "First name is required.");
        sf.assertEquals(new RegisterPage().getTextOfLastName(),"Last name is required.");
        sf.assertEquals(new RegisterPage().getTextOfEmail(), "Email is required.");
        sf.assertEquals(new RegisterPage().getTextOfPassword(),"Password is required.");
        sf.assertEquals(new RegisterPage().getTextOfConfirmPassword(),"Password is required.");
        sf.assertAll();
    }

    @And("I select gender as {string}")
    public void iSelectGenderAs(String gender) {
        new RegisterPage().clickOnGenderFemale();
    }

    @And("I enter first name as {string}")
    public void iEnterFirstNameAs(String fName) {
        new RegisterPage().enterValueToFirstNameField(fName);
    }

    @And("I enter last name as {string}")
    public void iEnterLastNameAs(String lName) {
        new RegisterPage().enterValueToLastNameField(lName);
    }

    @And("I select day as {string}")
    public void iSelectDayAs(String day) {
        new RegisterPage().selectDay(day);
    }

    @And("I select month as {string}")
    public void iSelectMonthAs(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("I select year as {string}")
    public void iSelectYearAs(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("I enter password as {string}")
    public void iEnterPasswordAs(String password) {
        new RegisterPage().enterValueToPasswordField(password);
    }

    @And("I enter confirm password as {string}")
    public void iEnterConfirmPasswordAs(String confirmPwd) {
        new RegisterPage().enterValueToConfirmPasswordField(confirmPwd);
    }

    @Then("I should be registered successfully with message {string}")
    public void iShouldBeRegisteredSuccessfullyWithMessage(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getValueOfRegistrationSuccessMessage(), "Your registration completed");
    }

    @And("I enter new email {string}")
    public void iEnterNewEmail(String email) {
        new RegisterPage().enterValueToEmailField(email);
    }
}
