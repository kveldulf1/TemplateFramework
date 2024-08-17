package pl.restassured.demo.framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(css = "button[data-qa='PRD_AddToBasket']")
    private List<WebElement> addToCartButtonList;

    @FindBy(xpath = "//body/div[@id='app']/div[@id='osAppInnerContainer']/main[1]/section[1]/section[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement upfrontPrice;

    @FindBy(css = "div[data-qa='PRD_TotalUpfront']>div>div")
    private List<WebElement> upfrontPriceList;

    @FindBy(xpath = "//body/div[@id='app']/div[@id='osAppInnerContainer']/main[1]/section[1]/section[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement monthlyPrice;


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButtonUsingJS() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonList.get(1)));
        addToCartButtonList.get(1).click();
    }

    public String getTotalUpfrontPrice() {
        wait.until(driver -> upfrontPriceList.size() == 2);
        return upfrontPriceList.get(1).getText();
//        wait.until(ExpectedConditions.visibilityOf(upfrontPrice));
//        return upfrontPrice.getText();
    }
    public String getMonthlyPrice() {
        wait.until(ExpectedConditions.visibilityOf(monthlyPrice));
        return monthlyPrice.getText();
    }
}