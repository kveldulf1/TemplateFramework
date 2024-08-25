package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.pageObjects.HomePage;

import static org.junit.Assert.*;

public class HomePageSteps  {
    HomePage homePage = new HomePage(WebDriverManager.getDriver());

    @Given("I am on the home page")
    public void iOpenTheHomePage() {
        homePage.navigateToHomePage();
    }

    @And("I accept the cookies")
    public void iAcceptTheCookies() {
        homePage.acceptCookies();
    }

    @Then("I verify if browser is opened")
    public void iVerifyIfBrowserIsOpened() {
        assertNotNull("WebDriver instance is null", WebDriverManager.getDriver());
        assertFalse("Browser did not navigate to any page", WebDriverManager.getDriver().getCurrentUrl().isEmpty());
    }
}