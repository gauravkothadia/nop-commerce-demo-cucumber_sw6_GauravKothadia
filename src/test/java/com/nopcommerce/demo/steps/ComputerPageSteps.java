package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("I click on {string} tab")
    public void iClickOnTab(String computerLink) {
        new HomePage().clickOnComputersMenuLink();
    }

    @Then("I should be navigated to computer page displaying heading as {string}")
    public void iShouldBeNavigatedToComputerPageDisplayingHeadingAs(String computerHeading) {
        Assert.assertEquals(new ComputerPage().getTextFromMenuPageTitle(), computerHeading);
    }

    @And("I click on {string} link")
    public void iClickOnLink(String desktopLink) {
        new ComputerPage().clickOnDesktopsLink();
    }

    @Then("I should be navigated to Desktop page displaying heading as {string}")
    public void iShouldBeNavigatedToDesktopPageDisplayingHeadingAs(String desktopHeading) {
        Assert.assertEquals(new DesktopsPage().getTextFromMenuPageTitle(), desktopHeading);
    }
}
