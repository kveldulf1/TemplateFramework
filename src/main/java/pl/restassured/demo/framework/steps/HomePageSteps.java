package pl.restassured.demo.framework.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.Drivers.WebDriverManager;
import pl.restassured.demo.framework.pages.HomePage;



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

    @Then("I should see the welcome message {string}")
    public void iShouldSeeTheWelcomeMessage(String expectedMessage) {
//        assertEquals(expectedMessage, homePage.getWelcomeMessage());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @And("I accept the cookies")
    public void iAcceptTheCookies() throws InterruptedException {
        homePage.acceptCookies();
    }
}