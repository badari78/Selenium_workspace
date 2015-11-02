package frames.Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesExample {
	
	static WebDriver driver;
	
	
	@BeforeClass
	static public void BeforeMethod(){
		System.setProperty("webdriver.firefox.profile", "default");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/frames");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	static public void AfterMethod(){
		driver.close();
		driver.quit();
		
	}
	
	@Test
	public void FrameMethod(){
		//driver.switchTo().frame(driver.findElement(By.cssSelector("[name='content']")));
		//driver.switchTo().frame("content").findElement(By.partialLinkText("green")).click();
		driver.switchTo().frame("content");
		driver.findElement(By.cssSelector("a[href='green.hml')")).click();
		
	/*	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().frame("content").findElement(By.partialLinkText("Back to original page")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	*/
		
	}

}
