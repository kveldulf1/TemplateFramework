package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.pages.CartPage;
import pl.restassured.demo.framework.di.Context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CartPageSteps {

    private WebDriver driver;
    private CartPage cartPage;
    private Context context;

    public CartPageSteps(Context context) {
        this.driver = WebDriverManager.getDriver();
        this.cartPage = new CartPage(driver);
        this.context = context;
    }

    @Then("I verify if I am redirected to the basket page")
    public void iVerifyIfIAmRedirectedToTheBasketPage() {
        assertTrue("Proceed to checkout button is not displayed", cartPage.isCartPageDisplayed());
    }

    @And("I verify if the start price value is the same as the one noted")
    public void iVerifyIfTheStartPriceValueIsTheSameAsTheOneNoted() {
        assertTrue("Upfront prices are not equals. Upfront price on cart page is " + cartPage.getUpfrontPrice() +
                " and upfront price on product page is " + context.getContext("upfrontPriceProductPage"),
                cartPage.getUpfrontPrice().equals(context.getContext("upfrontPriceProductPage")));
    }

    @And("I verify if the total price value is the same as the one noted")
    public void iVerifyIfTheTotalPriceValueIsTheSameAsTheOneNoted() {
        assertTrue("Monthly prices are not equals. Monthly price on cart page is " + cartPage.getMonthlyPrice() +
                " and monthly price on product page is " + context.getContext("monthlyPriceProductPage"),
                cartPage.getMonthlyPrice().equals(context.getContext("monthlyPriceProductPage")));
    }
}
