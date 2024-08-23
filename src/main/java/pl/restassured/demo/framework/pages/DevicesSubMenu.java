package pl.restassured.demo.framework.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevicesSubMenu extends BasePage {

    @FindBy(css = "div[class*='menu-dropdown-submenu']")
    private WebElement subMenuDropdown;

    private Logger log = LogManager.getLogger(DevicesSubMenu.class);

    public DevicesSubMenu(WebDriver driver) {
        super(driver);
    }

    public boolean isSubMenuHidden() {
        boolean isSuccessful = false;
        try {
           subMenuDropdown.getAttribute("class").contains("hidden");
            isSuccessful = true;
        } catch (Exception e) {
            log.error("Submenu is hidden.");
        }
        if (isSuccessful) {
            log.info("Submenu is not hidden.");
        }
        return subMenuDropdown.getAttribute("class").contains("hidden");
    }
}