package pl.restassured.demo.framework.drivers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {
    private static WebDriver driver;
    private static final Logger log = LogManager.getLogger(WebDriverManager.class);


    public WebDriverManager() {
        // private constructor to prevent instantiation (this is a singleton class)
    }

    public static synchronized WebDriver getDriver() {
        log.info("getDriver() called");
        if (driver == null) {
            log.info("Creating new WebDriver instance");

            // Set the path to the chromedriver executable
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

            // Create ChromeOptions instance and add arguments
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized", "--disable-search-engine-choice-screen");

            // Initialize ChromeDriver with options
            driver = new ChromeDriver(options);

            // Add shutdown hook to quit the driver when the JVM shuts down
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                if (driver != null) {
                    driver.quit();
                }
            }));
        }
        return driver;
    }

    public static void quitDriver() {
        log.info("quitDriver() called");
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}