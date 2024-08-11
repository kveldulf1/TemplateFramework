package pl.restassured.demo.framework.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePageMenuBar navigateToHomePage() {
        driver.get("http://t-mobile.pl");
        return new HomePageMenuBar(driver);
    }
}