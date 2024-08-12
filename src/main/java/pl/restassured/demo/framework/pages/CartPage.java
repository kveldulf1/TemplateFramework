package pl.restassured.demo.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    @FindBy(css = "h1[class*='basketHeaderText']")
    private WebElement cartHeader;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCartPageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(cartHeader));
        return cartHeader.isDisplayed();
    }
}
