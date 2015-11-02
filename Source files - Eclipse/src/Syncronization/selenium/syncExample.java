package Syncronization.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class syncExample {
	
	static WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	static public void beforeMethod(){
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/basic_ajax.html");
	}
	
	@Test
	public void testMethod(){
		
		wait = new WebDriverWait(driver,10);
		WebElement categoryElement = driver.findElement(By.cssSelector("#combo1"));
		categoryElement.findElement(By.cssSelector("option[value='3']")).click();
		
		wait.until(
				ExpectedConditions.presenceOfElementLocated(
						By.cssSelector("option[value='23']")));
				
	
	//	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("option[value='23']")));
	
		
		WebElement languateElement = driver.findElement(By.id("combo2"));
		languateElement.findElement(By.cssSelector("option[value='23']")).click();
		
		WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
		submitButton.click();
		
		wait.until(ExpectedConditions.titleIs("Processed Form Details"));
		assertThat(driver.findElement(By.cssSelector("#_valuelanguage_id")).getText(),is("23"));
		
	}
	
	@AfterClass
	static public void afterMethod(){
		driver.close();
		driver.quit();
		
	}
	
	

}
