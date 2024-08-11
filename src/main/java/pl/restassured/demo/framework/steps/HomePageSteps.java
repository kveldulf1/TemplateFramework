package pl.restassured.demo.framework.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pl.restassured.demo.framework.pages.HomePage;



public class HomePageSteps {
    private WebDriver driver;
    private HomePage homePage;

    public HomePageSteps() {
        // Set the path to the chromedriver executable
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        // Create ChromeOptions instance and add arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--disable-search-engine-choice-screen");

        // Initialize ChromeDriver with options
        this.driver = new ChromeDriver(options);
        this.homePage = new HomePage(driver);

        // Add shutdown hook to quit the driver when the JVM shuts down
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (driver != null) {
                driver.quit();
            }
        }));


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