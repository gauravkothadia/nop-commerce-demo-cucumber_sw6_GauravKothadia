package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = Logger.getLogger(RegisterPage.class);
    //Register Text
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    //Register Button
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    //First name
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstName;

    //Last name
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastName;

    //Email Id
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement email;

    //Password
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement password;

    //Confirm Password
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPassword;

    //Gender female
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderFemale;

    //first name field
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    //last name field
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    //last name field
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayDropdown;

    //last name field
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthDropdown;

    //last name field
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearDropdown;

    //email field
    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;

    //password field
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    //confirm password field
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    //confirm password field
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationSuccessMessage;

    public String getTextOfRegister(){
        String registerTxt = getTextFromElement(registerText);
        log.info("Get text from welcome text " + registerText.toString()+" as "+registerTxt);
        return registerTxt;
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
        log.info("Click on register button " + registerButton.toString());
    }
    public String getTextOfFirstName(){
        String name = getTextFromElement(firstName);
        log.info("Get text from first name error message " + firstName.toString()+" as "+name);
        return name;

    }
    public String getTextOfLastName(){
        String name = getTextFromElement(lastName);
        log.info("Get text from last name " + lastName.toString()+" as "+name);
        return name;
    }
    public String getTextOfEmail(){
        String name = getTextFromElement(email);
        log.info("Get text from email id error message " + email.toString()+" as "+name);
        return name;
    }
    public String getTextOfPassword(){
        String name = getTextFromElement(password);
        log.info("Get text from password error message " + password.toString()+" as "+name);
        return name;
    }
    public String getTextOfConfirmPassword(){
        String name = getTextFromElement(confirmPassword);
        log.info("Get text from confirm password error message " + confirmPassword.toString());
        return name;
    }
    public void clickOnGenderFemale(){
        clickOnElement(genderFemale);
        log.info("Click on gender female " + genderFemale.toString());
    }
    public void enterValueToFirstNameField(String firstName){
        sendTextToElement(firstNameField, firstName);
        log.info("Enter first name "+ firstName + "to first name field " + firstNameField.toString());
    }
    public void enterValueToLastNameField(String lastName){
        sendTextToElement(lastNameField, lastName);
        log.info("Enter last name "+ password + "to last name field " + lastNameField.toString());
    }
    public void selectDay(String day){
        selectByVisibleTextFromDropDown(dayDropdown, day);
        log.info("Enter day "+ day +"from dropdown list" + dayDropdown.toString());
    }

    public void selectMonth(String month){
        selectByVisibleTextFromDropDown(monthDropdown, month);
        log.info("Enter month "+ month +"from dropdown list" + monthDropdown.toString());
    }

    public void selectYear(String year){
        selectByVisibleTextFromDropDown(yearDropdown, year);
        log.info("Enter year "+ year +"from dropdown list" + yearDropdown.toString());
    }


    public void enterValueToEmailField(String email){
        sendTextToElement(emailField, getRandomString(5)+email);
        log.info("Enter email "+ password + "to email field " + emailField.toString());
    }
    public void enterValueToPasswordField(String password){
        sendTextToElement(passwordField, password);
        log.info("Enter password "+ password + "to password field " + passwordField.toString());
    }
    public void enterValueToConfirmPasswordField(String confirmPassword){
        sendTextToElement(confirmPasswordField, confirmPassword);
        log.info("Enter confirm password "+ password + "to password field " + confirmPasswordField.toString());
    }
    public String getValueOfRegistrationSuccessMessage(){
        String name = getTextFromElement(registrationSuccessMessage);
        log.info("Get text from registration success message " + confirmPasswordField.toString());
        return name;
    }
}
