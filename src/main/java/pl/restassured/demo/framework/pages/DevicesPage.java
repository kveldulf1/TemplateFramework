package pl.restassured.demo.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DevicesPage extends BasePage {
    public DevicesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div[data-qa=\"LST_ProductCard0\"]")
    private WebElement firstProductButton;

    public void clickOnTheFirstProduct() {
        wait.until(ExpectedConditions.visibilityOf(firstProductButton));
        firstProductButton.click();
    }
}