package Test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parameterization;

public class PinPageTest 
{
	WebDriver driver;

@BeforeMethod
public void launchBrowser()
{
	  driver=Browser.openBrowser();
}
@Test
public void loginToZerodhaWithPinTest() throws InterruptedException, EncryptedDocumentException, IOException
{
	   ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
   String userName=Parameterization.getData(0,1);
   String password=Parameterization.getData(1,1);
   zerodhaLoginPage.enterUserId(userName);
   zerodhaLoginPage.enterPassword(password);
   zerodhaLoginPage.clickOnLogin();
   Thread.sleep(3000);
   
   ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
   String pin=Parameterization.getData(2,1);
   zerodhaPinPage.enterPin(pin);
  zerodhaPinPage.clickOnContinue();
}
}


