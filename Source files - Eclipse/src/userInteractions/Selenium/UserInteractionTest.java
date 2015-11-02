package userInteractions.Selenium;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UserInteractionTest {
	
	static WebDriver driver;
	
	@BeforeClass
	static public void BeforeMethod(){
		
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
		driver.navigate().to("http://compendiumdev.co.uk/selenium/gui_user_interactions.html");
		
		
	}
	
	@AfterClass
	static public void AfterMethod(){
		driver.close();
		driver.quit();
			
	}
	
	@Test
	public void UserInteractionMethod(){
		WebElement fromElement,toElement;
		Actions actioncb = new Actions(driver);
		fromElement = driver.findElement(By.cssSelector("#draggable1"));
		toElement = driver.findElement(By.cssSelector("#droppable1"));
		actioncb.dragAndDrop(fromElement, toElement).release().perform();
		//actioncb.build();
		//driver.getPageSource().contains("Dropped!");
		assertEquals("Dropped!",toElement.getText());
		
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void UserInteractionMethod1(){
		WebElement fromElement,toElement;
		Actions actioncb = new Actions(driver);
		fromElement = driver.findElement(By.cssSelector("#draggable2"));
		toElement = driver.findElement(By.cssSelector("#droppable1"));
		
		actioncb.dragAndDrop(fromElement, toElement).release().perform();
		//actioncb.build();
		//driver.getPageSource().contains("Get Off Me!");
		assertEquals("Get Off Me!",toElement.getText());
	}
	
	@Test
	public void UserInteractionMethod2(){
		Actions actioncb = new Actions(driver);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		actioncb.keyDown(Keys.CONTROL).sendKeys(Keys.chord("B")).perform();
		//actioncb.build();
		//driver.getPageSource().contains("Bwa! Ha! Ha!");
		
	}	
		
	

}
