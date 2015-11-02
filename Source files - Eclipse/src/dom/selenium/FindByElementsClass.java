package dom.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class FindByElementsClass {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void BeforeClass(){
		//try{
		//System.setProperty("webdriver.firefox.profile","default");
		
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/find_by_playground.php");
			//}catch(exception e){
			
			//}
	}
	
	@AfterClass
	public static void AfterClass(){
		driver.close();
		driver.quit();
	}
	
	@Test
	
	public void Navigation(){
		
		List<WebElement> element1;
		element1 = driver.findElements(By.tagName("div"));
		Assert.assertEquals("19",element1.size());
		
	}
		
	
	@Test
	public void Navigation2(){
		List<WebElement> element1;
		//element1 = driver.findElements(ByPartialLink("jump to para"));
		element1 = driver.findElements(By.partialLinkText("jump to para"));
		Assert.assertEquals(25,element1.size());
		
		
	}
	

}
