package pl.restassured.demo.framework.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pl.restassured.demo.framework.drivers.WebDriverManager;

import java.time.Duration;

public class TestBase {
    protected WebDriver driver = WebDriverManager.getDriver();
    protected WebDriverWait wait;
    protected Logger log = LogManager.getLogger(TestBase.class);

    public TestBase(WebDriver driver) {
        this.driver = driver;
        log.info("Initializing WebDriver");
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        log.info("Initializing WebDriverWait");
        PageFactory.initElements(driver, this);
    }
}