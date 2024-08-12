package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.Drivers.WebDriverManager;
import pl.restassured.demo.framework.pages.ProductPage;

public class ProductPageSteps {
    private WebDriver driver;
    private ProductPage productPage;

    public ProductPageSteps() {
        this.driver = WebDriverManager.getDriver();
        this.productPage = new ProductPage(driver);
    }

    @When("I click on the Add to cart button")
    public void iClickOnTheAddToCartButton() {
        productPage.clickAddToCartButtonUsingJS();
    }

    @When("I note the start price value")
    public void iNoteTheStartPriceValue() {
        productPage.getTotalUpfrontPrice();
    }

    @And("I note the monthly price value")
    public void iNoteTheMonthlyPriceValue() {
        productPage.getMonthlyPrice();
    }
}