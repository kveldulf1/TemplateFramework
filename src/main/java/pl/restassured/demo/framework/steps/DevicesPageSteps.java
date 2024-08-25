package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.When;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.pageObjects.DevicesPage;

public class DevicesPageSteps {

    DevicesPage devicesPage = new DevicesPage(WebDriverManager.getDriver());

    @When("I select the first product from the list")
    public void iSelectTheFirstProductFromTheList() {
        devicesPage.clickOnTheFirstProduct();
    }
}