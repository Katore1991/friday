package Test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaSignUpPage;
import Utility.Parameterization;
@Listeners(TestListeners.class)
public class ZerodhaSignUpTest extends BaseTest
{
	//WebDriver driver;

	@BeforeMethod
	   public void Browser()
	   {
		   driver=Browser.openBrowser();
		}
	   @Test
	public void validsignupclick() throws EncryptedDocumentException, IOException 
	   {
		  ZerodhaSignUpPage signUpCreateAcc=new ZerodhaSignUpPage(driver);
		  signUpCreateAcc.clickSignUp();
		  ArrayList<String> list=new ArrayList<String> (driver.getWindowHandles());
	     list.get(0);
	   
	     driver.switchTo().window(list.get(1));
	   
	    String name=Parameterization.getData(6,1);
	    signUpCreateAcc.entermonumber(name);
	    signUpCreateAcc.clickOnContinue();
	   
	   }
}
