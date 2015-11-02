package test.Junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Shravya on 10/09/2015.
 */
public class ManipulationExercise {

    static WebDriver driver;
    @AfterClass
    public void AfterMethod(){

        driver = new FirefoxDriver();
        driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
    }

    @BeforeClass
    public void BeforeMethod(){
    driver.close();
    driver.quit();
    }

    @Test
    public void ManipulationMethod(){

    }
}
