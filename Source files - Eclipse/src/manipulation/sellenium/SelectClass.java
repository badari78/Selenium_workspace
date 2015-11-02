package manipulation.sellenium;

import java.util.concurrent.TimeUnit;


import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class SelectClass {
	static WebDriver driver;
	
	@ BeforeClass
	static public void BeforeMethod(){
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
		//driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		driver.navigate().to("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		
	}
	
	@ AfterClass
	static public void AfterMethod(){
		driver.close();
		driver.quit();
		
	}
	
	
	@Test
	
	public void submitForm(){
	//WebElement element1;	
	//element1 = driver.findElement(By.cssSelector("input[value='submit']"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Select select_element = new Select(element1);
	Select select_element = new Select(driver.findElement(By.cssSelector("input[value='submit']")));
	//select_element.
	
	//assertThat(driver.getTitle(), is("Processed Form Details"));
	//driver.navigate().back();
	
	}
}
