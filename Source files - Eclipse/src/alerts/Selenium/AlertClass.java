package alerts.Selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertClass {
	
	static WebDriver driver;
	
	@BeforeClass
	static public void BeforeMethod(){
		
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
		driver.navigate().to("http://compendiumdev.co.uk/selenium/alerts.html");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	static public void AfterMethod(){
		driver.close();
		driver.quit();
	}
	/*
	
	@Test
	public void AlertMethod1(){
		
		WebElement element1;
		element1 = driver.findElement(By.cssSelector("#alertexamples"));
		element1.click();
		String text = driver.switchTo().alert().getText();
		assertEquals(text,"I am an alert box!");
		driver.switchTo().alert().accept();
		//driver.navigate().refresh();
				
	}
	
	@Test
	public void AlertMethod2(){
		WebElement element1;
		element1 = driver.findElement(By.cssSelector("#confirmexample"));
		element1.click();
		driver.switchTo().alert().accept();
		assertEquals(driver.findElement(By.cssSelector("#confirmreturn")).getText(),"true");
		
				
	} */
	
	@Test
	public void AlertMethod3(){
		//promptexample
		driver.findElement(By.cssSelector("#promptexample")).click();
		driver.switchTo().alert().sendKeys("abcdefgh");
		driver.switchTo().alert().accept();
		assertEquals(driver.findElement(By.cssSelector("#promptreturn")).getText(),"abcdefgh");
		
		
	} 
	

	

}
