package pl.restassured.demo.framework.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DevicesPage extends BasePage {

    @FindBy(css = "div[data-qa='LST_ProductCard0']")
    private WebElement firstProductButton;

    private Logger log = LogManager.getLogger(DevicesPage.class);

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