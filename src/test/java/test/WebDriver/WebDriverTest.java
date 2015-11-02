package test.WebDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.sql.DriverManager;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverTest {

    static WebDriver driver=null;
    static WebDriverWait wait;

    @BeforeClass
    static public void beforeMethod() {

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("platform", Platform.LINUX);
        //capabilities.setCapability("version", "38.0");
        try {
            driver = new RemoteWebDriver
                    (new URL("http://badari78:11876023-fde1-4e83-b36d-5e923708fedd@ondemand.saucelabs.com:80/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        wait = new WebDriverWait(driver,20);
    }

    @Test
    public void WebDriverMethod(){


        driver.navigate().to("http://www.compendiumdev.co.uk/selenium/basic_html_form.html");
        //driver.get("http://www.compendiumdev.co.uk/selenium/basic_html_form.html");
        wait.until(ExpectedConditions.titleIs("HTML Form Elements "));
    }


    @AfterClass
    static public void afterMethod(){
        driver.close();
        driver.quit();
    }

}
