package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = Logger.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    //computer menu link
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersMenu;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link: "+loginLink.toString());
    }

    public String getLoginLinkText() {
        log.info("Getting login link text: "+loginLink.toString());
        return getTextFromElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link: "+registerLink.toString());
    }
    public void clickOnComputersMenuLink(){
        clickOnElement(computersMenu);
        log.info("Click on computers menu link " + computersMenu.toString());
    }
}