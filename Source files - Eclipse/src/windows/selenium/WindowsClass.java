package windows.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;



public class WindowsClass {
	static WebDriver driver;
	
	
	@BeforeClass
	static public void BeforeMethod(){
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/frames");
		
	}

	
@AfterClass
	static public void AfterMethod(){
		driver.close();
		driver.quit();
		
	}

	@Test		
	public void WindowsMethod(){
		 
		String parentHandle = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.switchTo().frame("content");
		driver.findElement(By.partialLinkText("EvilTester")).click();
		Set<String>handleList = driver.getWindowHandles();
		String newhandle = null;
		
		for(String list1 : handleList){
			if (list1 != parentHandle)
						   newhandle = list1;
			
		}
		
		driver.switchTo().window(newhandle);
		assertThat(driver.getTitle(), is("Home | EvilTester.com"));
		
		driver.switchTo().window(parentHandle);
		assertThat(driver.getTitle(), is("Frameset Example Title (Example 6)"));
		
		
	}

}
