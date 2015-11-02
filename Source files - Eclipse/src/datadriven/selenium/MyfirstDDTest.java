package datadriven.selenium;

import java.io.FileReader;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVReader;

public class MyfirstDDTest {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	@BeforeClass
	static public void beforeMethod(){
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void firstDDMethod() throws IOException{
		String temp1=null,temp2=null;
		
		wait = new WebDriverWait(driver,10);
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.gmail.com");
		
		
		
		String path = "D://Badari/Learning/dd1.csv";
		CSVReader reader = new CSVReader(new FileReader(path));
		String[] data;
		
		while((data = reader.readNext())!=null){
			 temp1 = data[0]; 
			 temp2 = data[1];
			 
		}
		
		System.out.println(temp1);
		System.out.println(temp2);
		
		
	}
}
