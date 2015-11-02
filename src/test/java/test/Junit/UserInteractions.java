package test.Junit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


/**
 * Created by Shravya on 13/09/2015.
 */
public class UserInteractions {
    static WebDriver driver;

    @BeforeClass
    static public void BeforeMethod(){

        System.setProperty("webdriver.firefox.profile","default");
        driver = new FirefoxDriver();
        driver.navigate().to("http://compendiumdev.co.uk/selenium/gui_user_interactions.html");
    }

    @AfterClass
    static public void AfterMethod(){

        driver.close();
        driver.quit();
    }

    @Test
    public void ActionsMethod(){
        WebElement fromElement,toElement;
        fromElement = driver.findElement(By.cssSelector("#draggable1"));
        toElement = driver.findElement(By.cssSelector("#droppable1"));

        Actions actioncb1 = new Actions(driver);
        actioncb1.dragAndDrop(fromElement,toElement).perform();
        actioncb1.build();

        //actioncb1.click(driver.findElement(By.cssSelector("input[value='cb1']"))).perform();
        actioncb1.build();
        //new Actions(driver)


    }

}
