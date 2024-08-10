package pl.restassured.demo.framework.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "welcomeMessage")
    private WebElement welcomeMessage;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }
}