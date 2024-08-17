package pl.restassured.demo.framework.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
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
        driver.get("http://t-mobile123.pl");
        log.info("Navigated to the T-Mobile homepage");
        log.error("Navigation failed");
        return this;
    }

    public HomePageMenuBar acceptCookies() {
        wait.until(ExpectedConditions.visibilityOf(acceptCookiesButton));
        acceptCookiesButton.click();
        return new HomePageMenuBar(driver);
    }
}