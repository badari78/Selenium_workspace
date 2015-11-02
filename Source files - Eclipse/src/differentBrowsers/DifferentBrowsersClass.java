package differentBrowsers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DifferentBrowsersClass {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	@BeforeClass
	static public void beforeMethod(){
		System.setProperty("webdriver.chrome.driver","D://Badari/Learning/Drivers/Chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/");
		
	}
	
	@Test
	public void mainMethod(){
		wait = new WebDriverWait(driver, 10, 10);
		wait.until(ExpectedConditions.titleIs("Selenium Simplified - a book and ebook on Automated Web Testing with Java and Selenium RC"));
	}
	
	@AfterClass
	static public void afterMethod(){
		driver.close();
		driver.quit();
	
	}
	
}
