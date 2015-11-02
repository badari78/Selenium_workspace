package test.WebDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by Shravya on 20/10/2015.
 */
public class GridWebDriver {

    static WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    static public void beforeMethod(){
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("platform", Platform.MAC);

        try{
        driver = new RemoteWebDriver(
                 new URL("http://localhost:4444/wd/hub"),
                    capabilities);
        }catch(MalformedURLException e){

            e.printStackTrace();
        }

       /*driver = new FirefoxDriver();
       driver.navigate().to();
*/
    }

    @Test
    public void gridMethod(){
        driver.navigate().to("http://www.compendiumdev.co.uk/selenium/");
        wait = new WebDriverWait(driver,10);
        System.out.println(driver.getTitle());
        wait.until(ExpectedConditions.titleIs("Selenium Simplified - a book and ebook on Automated Web Testing with Java and Selenium RC"));
        assertThat(driver.getTitle(),is("Selenium Simplified - a book and ebook on Automated Web Testing with Java and Selenium RC"));

    }

    @AfterClass
    static public void afterMethod(){
        driver.quit();
        driver.close();
    }


}
