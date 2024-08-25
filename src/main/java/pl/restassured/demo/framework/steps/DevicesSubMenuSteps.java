package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.pageObjects.DevicesSubMenu;

import static org.junit.Assert.assertTrue;

public class DevicesSubMenuSteps {
    DevicesSubMenu devicesSubMenu = new DevicesSubMenu(WebDriverManager.getDriver());

    @Then("I verify if Submenu is displayed")
    public void iVerifyIfSubmenuIsDisplayed() {
        assertTrue("Submenu wan not displayed", devicesSubMenu.isSubMenuHidden());
    }

    @Then("I verify if url contains {string} text")
    public void iVerifyIfUrlContainsText(String arg0) {
        assertTrue("Url does not contain " + arg0 + " text", WebDriverManager.getDriver().getCurrentUrl().contains(arg0));
    }
}