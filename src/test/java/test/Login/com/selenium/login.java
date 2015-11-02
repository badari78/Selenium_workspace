package test.Login.com.selenium;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class login {
    static WebDriver driver;
    static WebDriverWait wait;
    WebElement elementEmail;

    @BeforeClass
    static public void beforeMethod(){
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


    }

    @Test
     public void loginMethod(){
        //wait = new WebDriverWait(driver,10);
        driver.navigate().to("http://www.gmail.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("#gmail-sign-in")).click();
        String title = driver.getTitle();
        if (title == "Gmail - Free Storage and Email from Google"){
            WebElement element1;
            element1 = driver.findElement(By.cssSelector("#gmail-sign-in"));
            element1.click();
        }

        elementEmail = driver.findElement(By.cssSelector("#Email"));
        elementEmail.sendKeys("badari.kg@gmail.com");
        driver.findElement(By.cssSelector("#next")).click();
        WebElement elementPwd = driver.findElement(By.cssSelector("#Passwd"));
        elementPwd.click();
        elementPwd.sendKeys("Tamanna@1");
        WebElement checkBox = driver.findElement(By.cssSelector("#PersistentCookie"));
        if(checkBox.isEnabled()){
            checkBox.click();
        }

        driver.findElement(By.cssSelector("#signIn")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        //click on compose button
        driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();

        //click on to to text box
        WebElement toButton = driver.findElement(By.cssSelector("textarea[name='to']"));
        toButton.click();
        toButton.sendKeys("badari.kg@gmail.com");

        //click on subject text box
        WebElement subjButton = driver.findElement(By.cssSelector("input[name='subjectbox']"));
        subjButton.click();
        subjButton.sendKeys("Hello how are you");

        //click to enter contents



        //click on submit button
        WebElement sendButton = driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji aoO T-I-atl L3']"));
        sendButton.click();



    }


/*
    @AfterClass
    static public void afterMethod(){
        driver.close();
        driver.quit();

    }
*/
}
