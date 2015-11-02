package test.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Shravya on 28/10/2015.
 */
public class DriverManager {

    public static WebDriver get(){
        return  new FirefoxDriver();
    }
}
