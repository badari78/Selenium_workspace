package test.Cookies;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Shravya on 23/09/2015.
 */
public class cookieClass {

    static WebDriver driver;
    WebDriverWait wait;

    @AfterClass
    public void afterMethod(){

        driver = new FirefoxDriver();
        driver.navigate().to("http://www.compendiumdev.co.uk/selenium/search.php");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleIs("Selenium Simplified Search Engine"));
        Cookie acookie = driver.manage().getCookieNamed("seleniumSimplifiedSearchNumVisits");
        System.out.println(acookie.getValue());

    }

    @Test
    public void cookieMethod(){


    }
}
