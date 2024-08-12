package pl.restassured.demo.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductPage extends BasePage {

    @FindBy(css = "button[data-qa='PRD_AddToBasket']")
    private WebElement addToCartButton;

//    @FindBy(xpath = "//body/div[@id='app']/div[@id='osAppInnerContainer']/main[1]/section[1]/section[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
//    private WebElement upfrontPrice;

    @FindBy(xpath = "//body/div[@id='app']/div[@id='osAppInnerContainer']/main[1]/section[1]/section[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement upfrontPrice;

    @FindBy(css = "div[data-qa='PRD_TotalUpfront']>div>div")
    private List<WebElement> upfrontPriceList;

    public ProductPage(WebDriver driver) {
        super(driver);

    }

    public void clickAddToCartButtonUsingJS() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCartButton);
    }

    public String getTotalUpfrontPrice() {
        wait.until(ExpectedConditions.visibilityOf(upfrontPriceList.get(1)));
        return upfrontPriceList.get(1).getText();
    }
}