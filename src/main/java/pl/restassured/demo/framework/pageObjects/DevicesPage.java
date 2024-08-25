package pl.restassured.demo.framework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pl.restassured.demo.framework.testBase.TestBase;

public class DevicesPage extends TestBase {

    @FindBy(css = "div[data-qa='LST_ProductCard5']")
    private WebElement firstProductButton;

    public DevicesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnTheFirstProduct() {
        boolean isSuccessful = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(firstProductButton));
            firstProductButton.click();
            isSuccessful = true;
        } catch (Exception e) {
            log.error("Failed to click on the first product button not found.");
        }
        if (isSuccessful) {
            log.info("First product button clicked.");
        }
    }
}