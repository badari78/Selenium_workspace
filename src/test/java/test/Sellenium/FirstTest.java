package test.Sellenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static junit.framework.Assert.assertTrue;

public class FirstTest {

    @Test
    public void driverTest(){
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().contains("Selenium Simplified"));

    }

    @Test
    public void FireFoxdriverTest(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().contains("Selenium Simplified"));
        driver.close();

    }

}
