package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.pageObjects.HomePageMenuBar;
import pl.restassured.demo.framework.testBase.TestBase;

public class HomePageMenuBarSteps extends TestBase {
//    private WebDriver driver;
    private HomePageMenuBar homePageMenuBar;

    public HomePageMenuBarSteps() {
        super(WebDriverManager.getDriver());
        this.homePageMenuBar = new HomePageMenuBar(driver);
    }

    @When("I click on the Devices button from the home page menu bar")
    public void iClickOnTheDevicesButtonFromTheHomePageMenuBar() {
        homePageMenuBar.clickDevicesButton();
    }

    @When("I move mouse over the Devices button from the home page menu bar")
    public void iMoveMouseOverTheDevicesButtonFromTheHomePageMenuBar() {
        homePageMenuBar.moveMouseToDevicesButton();
    }

    @And("I click on Smartphones button from the home page menu bar")
    public void iClickOnSmartphonesButtonFromTheHomePageMenuBar() {
        homePageMenuBar.clickSmartphonesButton();
    }
}