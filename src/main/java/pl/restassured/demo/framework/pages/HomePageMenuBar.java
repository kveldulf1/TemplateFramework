package pl.restassured.demo.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class HomePageMenuBar extends BasePage {

    private WebDriverWait wait;

    public HomePageMenuBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li[class*=\"menu-dropdown\"]>button")
    private List<WebElement> menuButtonsList;

    public HomePageMenuBar clickDevicesButton() throws InterruptedException {
        Thread.sleep(2000);
        menuButtonsList.get(0).click();
        return this;
    }
}
