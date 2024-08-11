package pl.restassured.demo.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageMenuBar extends BasePage {
    public HomePageMenuBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@class='logout']")
    private WebElement signOutButton;

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickSignOutButton() {
        signOutButton.click();
    }

    public boolean isSignInButtonVisible() {
        return signInButton.isDisplayed();
    }

    public boolean isSignOutButtonVisible() {
        return signOutButton.isDisplayed();
    }
}
