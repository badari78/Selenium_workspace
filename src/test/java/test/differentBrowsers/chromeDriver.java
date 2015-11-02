package test.differentBrowsers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Shravya on 2/10/2015.
 */
public class chromeDriver {

    static WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    static public void beforeMethod(){

        System.setProperty("webdriver.chrome.driver","/Development/Selenium jar/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-extensions");
        options.addArguments("disable-plugins");

        driver = new ChromeDriver(options);


    }

    @Test
    public void testMethod(){

        driver.navigate().to("http://www.compendiumdev.co.uk/selenium/basic_html_form.html");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.titleIs("HTML Form Elements"));
    }

    @AfterClass
    static public void afterMethod(){

        driver.close();
        driver.quit();
    }
}
