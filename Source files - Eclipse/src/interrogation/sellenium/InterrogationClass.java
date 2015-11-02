package interrogation.sellenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;

public class InterrogationClass {
	
	static WebDriver driver;
	
	@BeforeClass
	static public void BeforeClass(){
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
	
	}
	
	@AfterClass
	static public void AfterClass(){
		driver.close();
	}
	
	@Test
	public void InterrogationMethod(){
		String title = "Basic Web Page Title";
		String web_page = "http://www.compendiumdev.co.uk/selenium/basic_web_page.html";
		
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/basic_web_page.html");
		Assert.assertEquals("Title", driver.getTitle(),title);
		System.out.println(driver.getCurrentUrl());
		
		Assert.assertEquals("web_page_url", driver.getCurrentUrl(),web_page);
		Assert.assertEquals("page_source", driver.getPageSource().contains("A paragraph of text"));
				
		
	}

}
