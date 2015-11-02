package test.Junit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;



public class SecondManipulationTest {

    static WebDriver driver;


    @ BeforeClass
    static public void BeforeMethod(){
        System.setProperty("webdriver.firefox.profile","default");
        driver = new FirefoxDriver();
        //driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
        driver.navigate().to("http://compendiumdev.co.uk/selenium/basic_html_form.html");

    }

    @ AfterClass
    static public void AfterMethod(){
        driver.close();
        driver.quit();

    }

    @Test
    public void submitForm(){
        driver.findElement(By.cssSelector("input[value='submit']")).click();;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        assertThat(driver.getTitle(), is("Processed Form Details"));
        driver.navigate().back();

    }

    @Test
    public void SubmitComments(){
        //driver.navigate().back();
        driver.findElement(By.cssSelector("[name='comments']")).click();
        driver.findElement(By.cssSelector("[name='comments']")).clear();
        driver.findElement(By.cssSelector("[name='comments']")).sendKeys("abcdefghijklmnop");
        driver.findElement(By.cssSelector("input[value='submit']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertThat(driver.getTitle(), is("Processed Form Details"));
        assertThat(driver.findElement(By.cssSelector("#_valuecomments")).getText(), is("abcdefghijklmnop"));
    }

    @Test
    public void RadioButtonMethod() {
        //driver.navigate().to("http://compendiumdev.co.uk/selenium/basic_html_form.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[value='rd1']")).click();
        driver.findElement(By.cssSelector("input[value='submit']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertThat(driver.findElement(By.cssSelector("#_valueradioval")).getText(), is("rd1"));
        driver.navigate().back();

    }

    @Test
    public void clickCheckbox(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[value='cb1']")).click();
        driver.findElement(By.cssSelector("input[value='cb3']")).click();
        driver.findElement(By.cssSelector("input[value='submit']")).click();
        assertThat(driver.findElement(By.cssSelector("#_valuecheckboxes0")).getText(), is("cb1"));
        driver.navigate().back();
    }

}