package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    private static final Logger log = Logger.getLogger(ComputerPage.class);

    //computer Text
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText;

    //desktop link
    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopsLink;



    public String getTextFromMenuPageTitle(){
        String name = getTextFromElement(computersText);
        log.info("Get title text for computers page " + computersText.toString());
        return name;
    }

    public void clickOnDesktopsLink(){
        clickOnElement(desktopsLink);
        log.info("Click on desktops link " + desktopsLink.toString());
    }
}
