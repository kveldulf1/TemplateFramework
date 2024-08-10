package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.restassured.demo.framework.pages.HomePage;

import static org.junit.Assert.assertEquals;

public class HomePageSteps {
    private WebDriver driver = new ChromeDriver();
    private HomePage homePage = new HomePage(driver);

    @When("I open the home page")
    public void iOpenTheHomePage() {
        driver.get("http://example.com");
    }

    @Then("I should see the welcome message {string}")
    public void iShouldSeeTheWelcomeMessage(String expectedMessage) {
        assertEquals(expectedMessage, homePage.getWelcomeMessage());
        driver.quit();
    }
}