package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    private static final Logger log = Logger.getLogger(DesktopsPage.class);

    //product
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement product;

    //desktops Text
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;

    public void clickOnProductName(){
        clickOnElement(product);
        log.info("Click on product name " + product.toString());
    }

    public String getTextFromMenuPageTitle(){
        String name = getTextFromElement(desktopsText);
        log.info("Get title text for desktops page " + desktopsText.toString());
        return name;
    }
}
