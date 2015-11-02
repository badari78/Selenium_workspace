package navigate.sellenium;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateExamples {
	
	static WebDriver driver;
	String title1 = "Selenium Simplified - a book and ebook on Automated Web Testing with Java and Selenium RC";
	String title2 = "Selenium Simplified Search Engine";
	String title3 = "HTML Form Elements";
	String title4 = "Basic Web Page Title";
	String Refreshtitle = "Refreshed Page on";

   @BeforeClass
	static public void BeforeClass(){
	   System.setProperty("webdriver.firefox.profile", "default");
	   driver = new FirefoxDriver();
	   System.setProperty("webdriver.firefox.profile", "default");
	   
	}
	
   @Test
   public void CheckTitle(){
	  
	  driver.navigate().to(("http://compendiumdev.co.uk/selenium"));
	  Assert.assertEquals("Title1",driver.getTitle(),title1);
	  System.out.println(driver.getTitle());
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.navigate().to(("http://compendiumdev.co.uk/selenium/search.php"));
	  Assert.assertEquals("Title2",driver.getTitle(),title2);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.navigate().to(("http://compendiumdev.co.uk/selenium/basic_html_form.html"));
	  Assert.assertEquals("Title3",driver.getTitle(),title3);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.navigate().to(("http://compendiumdev.co.uk/selenium/basic_web_page.html"));
	  Assert.assertEquals("Title4",driver.getTitle(),title4);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
   }
   
   @Test
  public void ForwardBackNav(){
	   
	   	 driver.navigate().to(("http://compendiumdev.co.uk/selenium/basic_web_page.html"));
	      driver.navigate().back();
		  Assert.assertEquals("Title3",driver.getTitle(),title3);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  driver.navigate().back();
		  Assert.assertEquals("Title2",driver.getTitle(),title2);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		  driver.navigate().forward();
		  Assert.assertEquals("Title3",driver.getTitle(),title3);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

   }
   
   @ Test
   public void NavigateRefresh(){
		  driver.navigate().to("http://compendiumdev.co.uk/selenium/refresh.php");
		  driver.navigate().refresh();
		  System.out.println(driver.getTitle());
		  Assert.assertEquals("Refresh Title", driver.getTitle().startsWith(Refreshtitle));
		  driver.navigate().refresh();
		  System.out.println(driver.getTitle());
		  Assert.assertEquals("Refresh Title", driver.getTitle().startsWith(Refreshtitle));
		  
	  }
   
   
   @AfterClass
   static public void AfterClass(){
	   driver.close();
	   
   }
}
