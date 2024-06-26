package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BuildYourOwnComputerPageSteps {

    @And("I select the processor as {string}")
    public void iSelectTheProcessorAs(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFromDropdown(processor);
    }

    @And("I select the RAM as {string}")
    public void iSelectTheRAMAs(String ram) {
        new BuildYourOwnComputerPage().selectRamFromDropdown(ram);
    }

    @And("I select the HDD as {string}")
    public void iSelectTheHDDAs(String hdd) {
        new BuildYourOwnComputerPage().clickOnHdd(hdd);
    }

    @And("I select the OS as {string}")
    public void iSelectTheOSAs(String os) {
        new BuildYourOwnComputerPage().clickOnOs(os);
    }

    @And("I select the software as {string}")
    public void iSelectTheSoftwareAs(String software) {
        new BuildYourOwnComputerPage().clickOnSoftwareCheckbox(software);
    }

    @And("I click on Add to card button")
    public void iClickOnAddToCardButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("I should see successful message as {string}")
    public void iShouldSeeSuccessfulMessageAs(String productAddedMessage) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getTextFromProductAddSuccessMessage(),productAddedMessage);
    }

    @And("I click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnProductName();
    }
}
