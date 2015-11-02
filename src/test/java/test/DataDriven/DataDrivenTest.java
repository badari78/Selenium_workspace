package test.DataDriven;

import au.com.bytecode.opencsv.CSVReader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.util.*;

/**
 * Created by Shravya on 3/10/2015.
 */
public class DataDrivenTest {

    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeClass
    static public void beforeMethod(){

        System.setProperty("webdriver.firefox.profile","default");
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.navigate().to("http://www.gmail.com");

    }

    @AfterClass
    static public void afterMethod(){

        driver.close();
        driver.quit();
    }

    @Test
    public void dataDrivenMethod() throws Exception{

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleIs("Gmail"));
        CSVReader reader = new CSVReader(new FileReader("/Development/Sellenium/login.csv"));
        List list1 = new ArrayList();
        list1 = reader.readAll();
        for(Object obj : list1){
            System.out.println(list1);
        }



    }
}
