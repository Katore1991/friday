package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class ZerodhaPage 
{
	WebDriver driver;
 
    @BeforeMethod
    public void Browser()
{
    	driver=POJO.Browser.openBrowser();
	
}
    
}