package manipulation.sellenium;
import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class MyFirstManipulation {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void BeforeMethod(){
		
		System.setProperty("webdriver.firefox.profile", "default");
		driver = new FirefoxDriver();
		driver.get("http://www.compendiumdev.co.uk/selenium/basic_ajax.html");
	
	}
	
	@AfterClass
	public static void AfterMethod(){
		driver.close();
		driver.quit();
				
	}
	
	@Test
	public void ManipulationMethod(){
		//WebElement element1;
		//<option value="3">Server</option>
		driver.findElement(By.cssSelector("option[value='3']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//<option value="23">Java</option>
		driver.findElement(By.cssSelector("option[value='23']")).click();
		
		//<input type="submit" value="Code In It" name="submitbutton">
		driver.findElement(By.cssSelector("[name=submitbutton]")).click();
		driver.findElement(By.cssSelector("#_valuelanguage_id"));
		//Assert.assertEquals("23", driver.findElement(By.cssSelector("#_valuelanguage_id")));
		assertThat(driver.findElement(By.cssSelector("#_valuelanguage_id")).getText(), is("23"));
		
		
	}
	
	

}
