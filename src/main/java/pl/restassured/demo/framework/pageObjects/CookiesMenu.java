package pl.restassured.demo.framework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pl.restassured.demo.framework.testBase.TestBase;

public class CookiesMenu extends TestBase {
    @FindBy(id = "didomi-notice-agree-button")
    private WebElement acceptCookiesButton;

    public CookiesMenu(WebDriver driver) {
        super(driver);
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
