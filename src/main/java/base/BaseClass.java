package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;

public class BaseClass {

    public static WebDriver driver;

    public static Logger log =
            LogManager.getLogger(BaseClass.class);

    ConfigReader config = new ConfigReader();

    @BeforeMethod
    public void setup() {

        log.info("===== Test Execution Started =====");

        driver = new ChromeDriver();

        log.info("Chrome Browser Launched");

        driver.manage().window().maximize();

        log.info("Browser Maximized");

        driver.get(config.getUrl());

        log.info("Navigated to URL: " + config.getUrl());
    }

    @AfterMethod
    public void tearDown() {

        log.info("Closing Browser");

        driver.quit();

        log.info("===== Test Execution Completed =====");
    }
}