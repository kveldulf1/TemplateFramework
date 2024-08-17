package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.Drivers.WebDriverManager;
import pl.restassured.demo.framework.Pages.DevicesSubMenu;

import static org.junit.Assert.assertTrue;

public class DevicesSubMenuSteps {
    private WebDriver driver;
    private DevicesSubMenu devicesSubMenu;

    public DevicesSubMenuSteps() {
        this.driver = WebDriverManager.getDriver();
        this.devicesSubMenu = new DevicesSubMenu(driver);
    }

    @Then("I verify if Submenu is displayed")
    public void iVerifyIfSubmenuIsDisplayed() {
        assertTrue("Submenu wan not displayed", devicesSubMenu.isSubMenuHidden());
    }

    @Then("I verify if url contains {string} text")
    public void iVerifyIfUrlContainsText(String arg0) {
        assertTrue("Url does not contain " + arg0 + " text", driver.getCurrentUrl().contains(arg0));
    }
}