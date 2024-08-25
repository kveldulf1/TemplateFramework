package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.pageObjects.HomePageMenuBar;

public class HomePageMenuBarSteps {
    HomePageMenuBar homePageMenuBar = new HomePageMenuBar(WebDriverManager.getDriver());

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