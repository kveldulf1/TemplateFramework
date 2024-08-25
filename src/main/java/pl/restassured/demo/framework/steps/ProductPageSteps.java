package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.pageObjects.ProductPage;
import pl.restassured.demo.framework.di.Context;

public class ProductPageSteps {

    // WebDriver initalization is needed for Context to work,
    // Context works only between test steps in the same scenario, logic needs to be implemented here, not in the page object

    private WebDriver driver = WebDriverManager.getDriver();
    private ProductPage productPage;
    private Context context;

    public ProductPageSteps(Context context) {
        this.productPage = new ProductPage(driver);
        this.context = context;
    }

    @When("I click on the Add to cart button")
    public void iClickOnTheAddToCartButton() {
        productPage.clickAddToCartButton();
    }

    @When("I note the start price value")
    public void iNoteTheStartPriceValue() {
        context.setContext("upfrontPriceProductPage", productPage.getTotalUpfrontPrice());
    }

    @And("I note the monthly price value")
    public void iNoteTheMonthlyPriceValue() {
        context.setContext("monthlyPriceProductPage", productPage.getMonthlyPrice());
    }
}