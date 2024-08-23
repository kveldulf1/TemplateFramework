package pl.restassured.demo.framework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy(id = "didomi-notice-agree-button")
    private WebElement acceptCookiesButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage navigateToHomePage() {
        boolean isSuccessful = false;
        try {
            driver.get("http://t-mobile.pl");
            isSuccessful = true;
        } catch (WebDriverException e) {
            log.error("Navigation to home page failed.");
        }
        if (isSuccessful) {
            log.info("Opened the home page.");
        }
        return this;
    }

    public HomePageMenuBar acceptCookies() {
        boolean isSuccessful = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(acceptCookiesButton));
            acceptCookiesButton.click();
            isSuccessful = true;
        } catch (WebDriverException e) {
            log.error("Accepting cookies failed.");
        }
        if (isSuccessful) {
            log.info("Accepted cookies.");
        }
        return new HomePageMenuBar(driver);
    }
}