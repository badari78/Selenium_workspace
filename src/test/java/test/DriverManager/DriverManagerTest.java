package test.DriverManager;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class DriverManagerTest {


    @Test
    public void createFirefoxDriver(){
        WebDriver driver = DriverManager.get();
        driver.get("http://compendiumdev.co.uk/selenium/basic_web_page.html");
        assertThat(driver.getTitle(),is("Basic Web Page Title"));



    }

}
