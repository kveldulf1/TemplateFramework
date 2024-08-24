package pl.restassured.demo.framework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pl.restassured.demo.framework.testBase.TestBase;

public class CartPage extends TestBase {

    @FindBy(css = "h1[class*='basketHeaderText']")
    private WebElement cartHeader;

    @FindBy(css = "span[data-qa='BKT_TotalupFront']")
    private WebElement upfrontPrice;

    @FindBy(css = "span[data-qa='BKT_TotalMonthly']")
    private WebElement monthlyPrice;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCartPageDisplayed() {
        boolean isSuccessful = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(cartHeader));
            isSuccessful = true;
        } catch (Exception e) {
            log.error("Cart page is not displayed.");
        }
        if (isSuccessful) {
            log.info("Cart page is displayed.");
        }
        return cartHeader.isDisplayed();
    }

    public String getUpfrontPrice() {
    boolean isSuccessful = false;
    try {
        wait.until(ExpectedConditions.visibilityOf(upfrontPrice));
        isSuccessful = true;
    } catch (Exception e) {
        log.error("Upfront price value not fetched.");
    }
    if (isSuccessful) {
        log.info("Upfront price fetched: " + upfrontPrice.getText());
    }
    return upfrontPrice.getText().concat(" zł");
    }


    public String getMonthlyPrice() {
        boolean isSuccessful = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(monthlyPrice));
            isSuccessful = true;
        } catch (Exception e) {
            log.error("Monthly price value not fetched.");
        }
        if (isSuccessful) {
            log.info("Monthly price fetched.");
        }
    return monthlyPrice.getText().concat(" zł");
    }
}
