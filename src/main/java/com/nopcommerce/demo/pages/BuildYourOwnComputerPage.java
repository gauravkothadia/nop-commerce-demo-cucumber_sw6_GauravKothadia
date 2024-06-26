package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = Logger.getLogger(BuildYourOwnComputerPage.class);

    //processor
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;

    //RAM
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;

    //HDD 320 GB
    @CacheLookup
    @FindBy(xpath = "//label[contains(normalize-space(),'320 GB')]/preceding-sibling::input")
    WebElement hdd320GB;

    //HDD 400 GB
    @CacheLookup
    @FindBy(xpath = "//label[contains(normalize-space(),'400 GB')]/preceding-sibling::input")
    WebElement hdd400GB;

    //OS Vista Home
    @CacheLookup
    @FindBy(xpath = "//label[contains(normalize-space(),'Vista Home')]/preceding-sibling::input")
    WebElement osVistaHome;

    //OS Vista Premium
    @CacheLookup
    @FindBy(xpath = "//label[contains(normalize-space(),'Vista Premium')]/preceding-sibling::input")
    WebElement osVistaPremium;

    //software MS Office
    @CacheLookup
    @FindBy(xpath = "//label[contains(normalize-space(),'Microsoft Office')]/preceding-sibling::input")
    WebElement softwareCheckboxMSOffice;

    //software Acrobat Reader
    @CacheLookup
    @FindBy(xpath = "//label[contains(normalize-space(),'Acrobat Reader')]/preceding-sibling::input")
    WebElement softwareCheckboxAcrobatReader;

    //software Total Commander
    @CacheLookup
    @FindBy(xpath = "//label[contains(normalize-space(),'Total Commander')]/preceding-sibling::input")
    WebElement softwareCheckboxTotalCommander;

    //Add to cart
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    //Add to cart
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddSuccessMessage;


    public void selectProcessorFromDropdown(String valueOfProcessor) {
        selectByVisibleTextFromDropDown(processor, valueOfProcessor);
        log.info("Get value of processor: " + valueOfProcessor + "from dropdown " + processor.toString());
    }

    public void selectRamFromDropdown(String valueOfRam) {
        selectByVisibleTextFromDropDown(ram, valueOfRam);
        log.info("Get value of ram: " + valueOfRam + "from dropdown " + ram.toString());
    }

    public void clickOnHdd(String hddInfo) {
        switch (hddInfo.split("\\[")[0].trim()) {
            case "320 GB": {
                clickOnElement(waitForElementWithFluentWait(hdd320GB,10,2));
                log.info("Click on HDD " + hddInfo + " " + hdd320GB.toString());
                break;
            }
            case "400 GB": {
                clickOnElement(waitForElementWithFluentWait(hdd400GB,10,2));
                log.info("Click on HDD " + hddInfo + " " + hdd400GB.toString());
                break;
            }
            default: {
                log.error("HDD is not in catalogue " + hddInfo);
            }
        }
    }

    public void clickOnOs(String osInfo) {
        switch (osInfo.split("\\[")[0].trim()) {
            case "Vista Home": {
                clickOnElement(waitForElementWithFluentWait(osVistaHome,10,2));
                log.info("Click on OS " + osInfo + " " + osVistaHome.toString());
                break;
            }
            case "Vista Premium": {
                clickOnElement(waitForElementWithFluentWait(osVistaPremium,10,2));
                log.info("Click on OS " + osInfo + " " + osVistaPremium.toString());
                break;
            }
            default: {
                log.error("OS is not in catalogue " + osInfo);
            }
        }
    }

    public void clickOnSoftwareCheckbox(String software) {
        switch (software.split("\\[")[0].trim()) {
            case "Microsoft Office": {
                if (!softwareCheckboxMSOffice.isSelected()) {
                    clickOnElement(waitForElementWithFluentWait(softwareCheckboxMSOffice,10,2));
                }
                log.info("software " + software + " is selected " + softwareCheckboxMSOffice.toString());
                break;
            }
            case "Acrobat Reader": {
                if (softwareCheckboxMSOffice.isSelected()) { //-------to untick default tick when page is loaded-----
                    clickOnElement(waitForElementWithFluentWait(softwareCheckboxMSOffice,10,2));
                }
                if (!softwareCheckboxAcrobatReader.isSelected()) {
                    clickOnElement(waitForElementWithFluentWait(softwareCheckboxAcrobatReader,10,2));
                }
                log.info("software " + software + " is selected " + softwareCheckboxAcrobatReader.toString());
                break;
            }
            case "Total Commander": {
                if (softwareCheckboxMSOffice.isSelected()) { //-------to untick default tick when page is loaded-----
                    clickOnElement(waitForElementWithFluentWait(softwareCheckboxMSOffice,10,2));
                }
                if (!softwareCheckboxTotalCommander.isSelected()) {
                    clickOnElement(waitForElementWithFluentWait(softwareCheckboxTotalCommander,10,2));
                }
                log.info("software " + software + " is selected " + softwareCheckboxTotalCommander.toString());
                break;
            }
            default: {
                log.error("Software is not in catalogue " + software);
            }
        }
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Click on add to cart button " + addToCart.toString());
    }

    public String getTextFromProductAddSuccessMessage() {
        String name = getTextFromElement(productAddSuccessMessage);
        log.info("Get text from product added success message " + productAddSuccessMessage.toString());
        return name;
    }
}