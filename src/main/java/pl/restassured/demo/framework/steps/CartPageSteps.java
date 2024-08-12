package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.Drivers.WebDriverManager;
import pl.restassured.demo.framework.pages.CartPage;

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
}
