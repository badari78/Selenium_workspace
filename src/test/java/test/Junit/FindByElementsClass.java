package test.Junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;

/**
 * Created by Shravya on 28/08/2015.
 */
public class FindByElementsClass {

    public static WebDriver driver;

    @BeforeClass
    public static void BeforeClass(){
        driver = new FirefoxDriver();

    }

    @AfterClass
    public static void AfterClass(){
        driver.close();
        driver.quit();
    }

    @Test
    public void FindByElementsMethod(){

        //List <WebElement> elements = new ArrayList<WebElement>();
        driver.navigate().to("http://www.compendiumdev.co.uk/selenium/find_by_playground.php");
        List <WebElement> elements_div;
        List <WebElement> elements_a;

        elements_div = driver.findElements(By.tagName("div"));
        System.out.println(elements_div.size());

        elements_a = driver.findElements(By.tagName("a"));
        System.out.println(elements_a.size());
    }
}
