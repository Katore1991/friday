package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 
{
    
	
	public static WebDriver openBrowser(String url)
	{
		///ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chrome\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get(url);
	     driver.manage().window().maximize();
	     return driver;
	
}
}
