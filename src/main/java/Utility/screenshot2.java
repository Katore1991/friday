package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser;

public class screenshot2
{
	public static void TakeScreenShot(WebDriver driver,String name) throws IOException
	{     
		String d =screenshot2.date();
	   // WebDriver driver=Browser.openBrowser();
	     File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Public\\Screenshot\\"+ name + d+".jpg");
		FileHandler.copy(Source,destination);
		
      }


        public static String date()
        {
        	DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyy-MMM-dd HH-mn-ss");
        	LocalDateTime currentTime=LocalDateTime.now();
           String d =dtf.format(currentTime);
            return d;
        
        //String date=DateTimeFormatter.ofPattern("yyy-MMM-dd HH-mn-ss").format(LocalDateTime.now());
       //return date;
        
        }

}
