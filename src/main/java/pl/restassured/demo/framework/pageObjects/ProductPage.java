package pl.restassured.demo.framework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pl.restassured.demo.framework.utils.Context;
import pl.restassured.demo.framework.testBase.TestBase;

import java.util.List;

public class ProductPage extends TestBase {

    @FindBy(css = "button[data-qa='PRD_AddToBasket']")
    private List<WebElement> addToCartButtonList;

    @FindBy(xpath = "//body/div[@id='app']/div[@id='osAppInnerContainer']/main[1]/section[1]/section[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement upfrontPrice;

    @FindBy(css = "div[data-qa='PRD_TotalUpfront']>div>div")
    private List<WebElement> upfrontPriceList;

    @FindBy(xpath = "//body/div[@id='app']/div[@id='osAppInnerContainer']/main[1]/section[1]/section[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement monthlyPrice;

    private Context context;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton() {
        boolean isSuccessful = false;
        try {
            wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonList.get(1)));
            addToCartButtonList.get(1).click();
            isSuccessful = true;
        } catch (Exception e) {
            log.error("Add to cart button not found.");
        }
        if (isSuccessful) {
            log.info("Add to cart button clicked.");
        }
    }

    public String getTotalUpfrontPrice(){
        boolean isSuccessful = false;
        try {
            wait.until(driver -> upfrontPriceList.size() == 2);
            upfrontPriceList.get(1).getText();
            isSuccessful = true;
        } catch (Exception e) {
            log.error("Upfront price value not fetched.");
        }
        if (isSuccessful) {
            log.info("Upfront price fetched = " + upfrontPriceList.get(1).getText());
        }
        return upfrontPriceList.get(1).getText();
    }

    public String getMonthlyPrice() {
        boolean isSuccessful = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(monthlyPrice));
            monthlyPrice.getText();
            isSuccessful = true;
        } catch (Exception e) {
            log.error("Monthly price value not fetched.");
        }
        if (isSuccessful) {
            log.info("Monthly price fetched = " + monthlyPrice.getText());
        }
        return monthlyPrice.getText();
    }
}