package pl.restassured.demo.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class HomePageMenuBar extends BasePage {
    public HomePageMenuBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li[class*=\"menu-dropdown\"]>button")
    private List<WebElement> menuButtonsList;

    @FindBy(css = "a[data-ga-ea*=\"/Bez abonamentu/Smartfony\"]")
    private WebElement smartphonesButton;

    public HomePageMenuBar moveMouseToDevicesButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(menuButtonsList.get(0)).perform();
        return this;
    }

    public HomePageMenuBar clickDevicesButton() {
        menuButtonsList.get(0).click();
        return this;
    }

    public void clickSmartphonesButton() {
        smartphonesButton.click();
    }
}