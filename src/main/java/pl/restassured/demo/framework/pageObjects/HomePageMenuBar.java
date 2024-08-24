package pl.restassured.demo.framework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pl.restassured.demo.framework.testBase.TestBase;

import java.util.List;

public class HomePageMenuBar extends TestBase {
    public HomePageMenuBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li[class*='menu-dropdown']>button")
    private List<WebElement> menuButtonsList;

    @FindBy(css = "a[data-ga-ea*='/Bez abonamentu/Smartfony']")
    private WebElement smartphonesButton;

    public HomePageMenuBar moveMouseToDevicesButton() {
        boolean isSuccessful = false;
        try {
            wait.until(webDriver -> menuButtonsList.get(0).isDisplayed());
            Actions actions = new Actions(driver);
            actions.moveToElement(menuButtonsList.get(0)).perform();
            isSuccessful = true;
        } catch (Exception e) {
            log.error("Devices button not found.");
        }
        if (isSuccessful) {
            log.info("Devices button found and moved the mouse pointer over it.");
        }
        return this;
    }

    public HomePageMenuBar clickDevicesButton() {
        boolean isSuccessful = false;
        try {
            wait.until(webDriver -> menuButtonsList.get(0).isDisplayed());
            menuButtonsList.get(0).click();
            isSuccessful = true;
        } catch (Exception e) {
            log.error("Devices button not found.");
        }
        if (isSuccessful) {
            log.info("Devices button clicked.");
        }
        return this;
    }

    public void clickSmartphonesButton() {
        boolean isSuccessful = false;
        try {
            wait.until(webDriver -> smartphonesButton.isDisplayed());
            smartphonesButton.click();
            isSuccessful = true;
        } catch (Exception e) {
            log.error("Smartphones button not found.");
        }
        if (isSuccessful) {
            log.info("Smartphones button clicked.");
        }
    }
}