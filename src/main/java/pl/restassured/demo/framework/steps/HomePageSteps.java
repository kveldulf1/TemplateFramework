package pl.restassured.demo.framework.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.pageObjects.HomePage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class HomePageSteps {
    private WebDriver driver;
    private HomePage homePage;

    public HomePageSteps() {
        this.driver = WebDriverManager.getDriver();
        this.homePage = new HomePage(driver);
    }

    @Given("I am on the home page")
    public void iOpenTheHomePage() {
        homePage.navigateToHomePage();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @And("I accept the cookies")
    public void iAcceptTheCookies() {
        homePage.acceptCookies();
    }

    @Then("I verify if browser is opened")
    public void iVerifyIfBrowserIsOpened() {
        assertNotNull("WebDriver instance is null", driver);
        assertFalse("Browser did not navigate to any page", driver.getCurrentUrl().isEmpty());
    }
}