package pl.restassured.demo.framework.steps;

import io.cucumber.java.en.And;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.pageObjects.CookiesMenu;

public class CookiesBarSteps {
    private final CookiesMenu cookiesMenu = new CookiesMenu(WebDriverManager.getDriver());

    @And("I accept the cookies")
    public void iAcceptTheCookies() {
        cookiesMenu.acceptCookies();
    }
}
