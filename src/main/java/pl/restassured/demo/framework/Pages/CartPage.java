package pl.restassured.demo.framework.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    @FindBy(css = "h1[class*='basketHeaderText']")
    private WebElement cartHeader;

    @FindBy(css = "span[data-qa='BKT_TotalupFront']")
    private WebElement upfrontPrice;

    @FindBy(css = "span[data-qa='BKT_TotalMonthly']")
    private WebElement monthlyPrice;

    private Logger log = LogManager.getLogger(CartPage.class);

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
        log.info("Upfront price fetched.");
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
    return monthlyPrice.getText();
    }
}
