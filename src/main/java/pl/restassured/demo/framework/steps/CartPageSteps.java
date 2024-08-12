package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.Drivers.WebDriverManager;
import pl.restassured.demo.framework.pages.CartPage;
import pl.restassured.demo.framework.pages.ProductPage;

import static org.junit.Assert.assertTrue;

public class CartPageSteps {
    private WebDriver driver;
    private CartPage cartPage;

    public CartPageSteps() {
        this.driver = WebDriverManager.getDriver();
        this.cartPage = new CartPage(driver);
    }

    @Then("I verify if I am redirected to the basket page")
    public void iVerifyIfIAmRedirectedToTheBasketPage() {
        assertTrue("Proceed to checkout button is not displayed", cartPage.isCartPageDisplayed());
    }

    @And("I verify if the start price value is the same as the one noted")
    public void iVerifyIfTheStartPriceValueIsTheSameAsTheOneNoted() {
        String cartPageUpfrontPrice = cartPage.getUpfrontPrice();
        String productPageUpfrontPrice = new ProductPage(driver).getTotalUpfrontPrice();
        assertTrue("Upfront price is not the same", cartPageUpfrontPrice.equals(productPageUpfrontPrice));
//        cartPage.getMonthlyPrice();
    }
}
