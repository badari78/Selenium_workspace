package dom.selenium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ElementClass {
	
	public static WebDriver driver;
	WebElement element;
	
	@BeforeClass
	public static void BeforeClass(){
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/find_by_playground.php");
				
	}
	
	@AfterClass
	public static void AfterClass(){
		driver.close();
		driver.quit();
		
	}
	
	@Test
	public void ElementManipulationID(){
		element = driver.findElement(By.id("p1"));
		System.out.println(element.getText());
		//Assert.assertThat(element.getText(),is("This is a paragraph text"));
		//Assert.assertThat(element.getText(),is("This is a paragraph text"));
		Assert.assertEquals("This is a paragraph text",element.getText());
			
	}
	
	@Test
	public void ElementManipulationByLink(){
		WebElement linkpara = driver.findElement(By.linkText("jump to para 0"));
		Assert.assertEquals("a26", linkpara.getAttribute("id"));
	}
	
	

}
