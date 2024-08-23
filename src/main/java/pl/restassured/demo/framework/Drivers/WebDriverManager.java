package pl.restassured.demo.framework.Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {
    private static WebDriver driver;

    public WebDriverManager() {
        // private constructor to prevent instantiation (this is a singleton class)
    }

    public static WebDriver getDriver() {
        if (driver == null) {
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
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}