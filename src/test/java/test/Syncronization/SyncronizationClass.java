package test.Syncronization;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * Created by Shravya on 21/09/2015.
 */
public class SyncronizationClass {
    static WebDriver driver;

    @BeforeClass
    static public void beforeMethod(){
     driver = new FirefoxDriver();
    driver.navigate().to("http://www.compendiumdev.co.uk/selenium/basic_ajax.html");

    }

    @AfterClass
    static public void afterMethod(){
        //driver.close();
        //driver.quit();

    }

    @Test
    public void syncMethod(){

        WebElement comboElement1,comboElement2;

        comboElement1 = driver.findElement(By.cssSelector("#combo1"));
        comboElement1.findElement(By.cssSelector("option[value='3'")).click();




    }
}
