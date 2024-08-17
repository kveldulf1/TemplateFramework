package pl.restassured.demo.framework.Pages;

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


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCartPageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(cartHeader));
        return cartHeader.isDisplayed();
    }

    public String getUpfrontPrice() {
    wait.until(ExpectedConditions.visibilityOf(upfrontPrice));
    return upfrontPrice.getText();
    }

    public String getMonthlyPrice() {
    wait.until(ExpectedConditions.visibilityOf(monthlyPrice));
    return monthlyPrice.getText();
    }
}
