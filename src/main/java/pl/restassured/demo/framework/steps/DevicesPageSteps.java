package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.pageObjects.DevicesPage;

public class DevicesPageSteps {
    private WebDriver driver;
    private DevicesPage devicesPage;

    public DevicesPageSteps() {
        this.driver = WebDriverManager.getDriver();
        this.devicesPage = new DevicesPage(driver);
    }

    @When("I select the first product from the list")
    public void iSelectTheFirstProductFromTheList() {
        devicesPage.clickOnTheFirstProduct();
    }
}