package pl.restassured.demo.framework.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private static final Logger log = LogManager.getLogger(HomePage.class);
    @FindBy(id = "didomi-notice-agree-button")
    private WebElement acceptCookiesButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage navigateToHomePage() {
        try {
            driver.get("http://t-mobile123.pl");
        } catch (WebDriverException e) {
            log.error("NAVIGATION FAILED");
        }
        return this;
    }

    public HomePageMenuBar acceptCookies() {
        wait.until(ExpectedConditions.visibilityOf(acceptCookiesButton));
        acceptCookiesButton.click();
        return new HomePageMenuBar(driver);
    }
}