package pl.restassured.demo.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(id = "didomi-notice-agree-button")
    private WebElement acceptCookiesButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage navigateToHomePage() {
        driver.get("http://t-mobile.pl");
        return this;
    }

    public HomePageMenuBar acceptCookies() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(acceptCookiesButton));
        acceptCookiesButton.click();
        return new HomePageMenuBar(driver);
    }
}