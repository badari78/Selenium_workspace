package windows.selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class WindowsManageClass {
	
	static WebDriver driver;
	
	@BeforeClass
	static public void beforeMethod(){
	/*	driver.close();
				driver.quit();
	*/	
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/bounce.html");
		
	}
	
	@Test
	public void manageMethod(){
				
		driver.manage().window().setSize(new Dimension(500,500));
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(500,500));
		driver.manage().window().setPosition(new Point(70,80));
	}
	

}
