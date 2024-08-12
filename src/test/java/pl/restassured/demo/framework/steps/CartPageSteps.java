package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pl.restassured.demo.framework.Drivers.WebDriverManager;
import pl.restassured.demo.framework.pages.CartPage;


public class CartPageSteps {
    private WebDriver driver;
    private CartPage cartPage;

    public CartPageSteps() {
        this.driver = WebDriverManager.getDriver();
        this.cartPage = new CartPage(driver);
    }

    @Then("I verify if I am redirected to the cart page")
    public void iVerifyIfIAmRedirectedToTheCartPage() {
        cartPage.isCartPageDisplayed();
    }
}