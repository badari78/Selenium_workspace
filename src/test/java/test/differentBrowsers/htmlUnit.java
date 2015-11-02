package test.differentBrowsers;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by Shravya on 30/09/2015.
 */

public class htmlUnit {

    @Test
    public void htmlUnitMethod(){

        /*driver.setJavascriptEnabled(true);
        HtmlUnitDriver driver = new HtmlUnitDriver();*/

        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.setJavascriptEnabled(true);
        driver.navigate().to("http://www.google.com");
    }

}
