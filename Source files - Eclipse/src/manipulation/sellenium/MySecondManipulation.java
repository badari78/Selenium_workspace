package manipulation.sellenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;



public class MySecondManipulation {
	
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
	
	/*
	@Test
	public void submitForm(){
	driver.findElement(By.cssSelector("input[value='submit']")).click();;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	assertThat(driver.getTitle(), is("Processed Form Details"));
	driver.navigate().back();
	
	}
	
	@Test
	public void SubmitComments(){
		//driver.navigate().back();
		driver.findElement(By.cssSelector("[name='comments']")).click();
		driver.findElement(By.cssSelector("[name='comments']")).clear();
		driver.findElement(By.cssSelector("[name='comments']")).sendKeys("abcdefghijklmnop");
		driver.findElement(By.cssSelector("input[value='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertThat(driver.getTitle(), is("Processed Form Details"));
		assertThat(driver.findElement(By.cssSelector("#_valuecomments")).getText(), is("abcdefghijklmnop"));
		driver.navigate().back();
	}
	
	@Test
	public void RadioButtonMethod(){
		//driver.navigate().to("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[value='rd1']")).click();
		driver.findElement(By.cssSelector("input[value='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertThat(driver.findElement(By.cssSelector("#_valueradioval")).getText(), is("rd1"));
		driver.navigate().back();
		
	}
	
	
	@ Test
	public void DropDownListMethod(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("option[value='dd5']")).click();
		driver.findElement(By.cssSelector("input[value='submit']")).click();
		assertThat(driver.findElement(By.cssSelector("#_valuedropdown")).getText(),is("dd5"));
		
	}*/
	
	@ Test
	public void MultipleSelectMethod(){
		//WebElement element;
		
		driver.findElement(By.cssSelector("option[value='ms1']")).click();
		driver.findElement(By.cssSelector("option[value='ms2']")).click();
		driver.findElement(By.cssSelector("option[value='ms3']")).click();
		driver.findElement(By.cssSelector("option[value='ms4']")).click();
		driver.findElement(By.cssSelector("input[value='submit']")).click();
		
		/* <option value="ms1"> Selection Item 1 </option>
		<option value="ms2"> Selection Item 2 </option>
		<option value="ms3"> Selection Item 3 </option> */
		
		assertThat(driver.findElement(By.cssSelector("#_valuemultipleselect0")).getText(),is("ms1"));
		assertThat(driver.findElement(By.cssSelector("#_valuemultipleselect1")).getText(),is("ms2"));
		assertThat(driver.findElement(By.cssSelector("#_valuemultipleselect2")).getText(),is("ms3"));
		
		
	}
	
	
	
}

