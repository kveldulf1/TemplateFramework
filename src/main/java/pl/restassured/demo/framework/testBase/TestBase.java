package pl.restassured.demo.framework.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.Logger;
import pl.restassured.demo.framework.drivers.WebDriverManager;
import pl.restassured.demo.framework.utils.LoggerUtil;

import java.time.Duration;

public class TestBase {
    protected WebDriver driver = WebDriverManager.getDriver();
    protected WebDriverWait wait;
    protected Logger log = LoggerUtil.getLogger();

    public TestBase(WebDriver driver) {
        this.driver = driver;
        log.debug("Initializing WebDriver");
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        log.debug("Initializing WebDriverWait");
        PageFactory.initElements(driver, this);
        log.debug("Initializing PageFactory");
    }
}