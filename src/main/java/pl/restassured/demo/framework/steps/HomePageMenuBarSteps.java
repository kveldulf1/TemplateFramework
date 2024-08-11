package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.Drivers.WebDriverManager;
import pl.restassured.demo.framework.pages.HomePageMenuBar;

public class HomePageMenuBarSteps {
    private WebDriver driver;
    private HomePageMenuBar homePageMenuBar;

    public HomePageMenuBarSteps() {
        this.driver = WebDriverManager.getDriver();
        this.homePageMenuBar = new HomePageMenuBar(driver);
    }

    @When("I click on the Devices button from the home page menu bar")
    public void iClickOnTheDevicesButtonFromTheHomePageMenuBar() throws InterruptedException {

        homePageMenuBar.clickDevicesButton();
    }

    @When("I move mouse over the Devices button from the home page menu bar")
    public void iMoveMouseOverTheDevicesButtonFromTheHomePageMenuBar() {
        homePageMenuBar.moveMouseToDevicesButton();
    }
}