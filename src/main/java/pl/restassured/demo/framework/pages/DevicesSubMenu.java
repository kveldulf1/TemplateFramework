package pl.restassured.demo.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevicesSubMenu extends BasePage {

    @FindBy(css = "div[class*=\"menu-dropdown-submenu\"]")
    private WebElement subMenu;

    public DevicesSubMenu(WebDriver driver) {
        super(driver);
    }

    public boolean isSubMenuHidden() {
        return subMenu.getAttribute("class").contains("hidden");
    }
}