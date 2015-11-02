package cookies.selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CookieExample {
	
	static WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	static public void beforeMethod(){
		System.setProperty("webdriver.firefox.profile","default");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.compendiumdev.co.uk/selenium/search.php");
		
	}
	
	@Test
	public void getCookieMethod(){
		wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.titleIs("Selenium Simplified Search Engine"));
		//String cookie = driver.manage().getCookieNamed("seleniumSimplifiedSearchNumVisits").getValue();
		Cookie aCookie = driver.manage().getCookieNamed("seleniumSimplifiedSearchNumVisits");
		Cookie nCookie = new Cookie(aCookie.getName(),String.valueOf(42),
									aCookie.getDomain(),aCookie.getPath(),aCookie.getExpiry(),aCookie.isSecure());
		driver.manage().deleteCookie(aCookie);
		driver.manage().addCookie(nCookie);
		
	}
	
	@AfterClass
	static public void afterMethod(){
		driver.close();
		driver.quit();
	}

}
