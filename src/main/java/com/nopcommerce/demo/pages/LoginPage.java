package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = Logger.getLogger(LoginPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    //logout link
    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logoutLink;

    //logout link
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting the Welcome text " + welcomeText.toString());
        return message;
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter email ID " + emailField.toString() + "  data: " + email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password " + passwordField.toString() + "  data: " + password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on Login link " + loginButton.toString());
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        log.info("Getting the error Message " + errorMessage.toString());
        return message;
    }

    public String getTextFromLogoutLink() {
        String logoutText = getTextFromElement(logoutLink);
        log.info("Get text from logout link " + logoutLink.toString());
        return logoutText;
    }

    public void clickOnLogoutLink() {
        clickOnElement(logoutLink);
        log.info("Click on logout button " + logoutLink.toString());
    }

    public String getTextFromLoginLink() {
        String loginText = getTextFromElement(loginLink);
        log.info("Get text from login link " + loginLink.toString());
        return loginText;
    }
}