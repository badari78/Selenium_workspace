package css.selector;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class TestCSSSelector {

	static WebDriver driver;
	
	@BeforeClass
	public static void BeforeClass(){
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
		driver.get("http://www.compendiumdev.co.uk/selenium/find_by_playground.php");
	}
	
	@AfterClass
	public static void AfterClass(){
		driver.close();
		driver.quit();
	}
	
	@Test
	public void IDMethod(){
		WebElement element1;
		element1 = driver.findElement(By.id("p31")); 
		assertEquals(element1.getAttribute("name"),"pName31");
		
		element1 = driver.findElement(By.cssSelector("#p31"));
		assertEquals(element1.getAttribute("name"),"pName31");
			
	}
	
	
	@Test
	public void NameMethod(){
		WebElement element1;
		element1 = driver.findElement(By.name("ulName1")); 
		assertEquals(element1.getAttribute("id"),"ul1");
		
		element1 = driver.findElement(By.cssSelector("[name='ulName1']"));
		assertEquals(element1.getAttribute("id"),"ul1");
		
	}
	
	
	@Test
	public void ClassNameMethod(){
		WebElement element1;
		element1 = driver.findElement(By.className("specialDiv")); 
		assertEquals(element1.getAttribute("id"),"div1");
		
		element1 = driver.findElement(By.cssSelector(".specialDiv"));
		assertEquals(element1.getAttribute("id"),"div1");
	}
	
	@Test
	public void TagName(){
		WebElement element1;
		element1 = driver.findElement(By.tagName("li")); 
		//Assert.assertEquals(element1.getAttribute("name"),"pName31");
		assertEquals(element1.getAttribute("name"),"liName1");
	}
	
	
}
