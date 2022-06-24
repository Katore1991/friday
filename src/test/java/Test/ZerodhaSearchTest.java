package Test;




import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;

import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import POM.ZerodhaSharePage;
import Utility.Parameterization;
import Utility.screenshot2;

@Listeners(TestListeners.class)
public class ZerodhaSearchTest  extends BaseTest
{

	//WebDriver driver;

@BeforeMethod
    public void Browser()
{
	  driver=Browser.openBrowser(); 

}
@Test
     public void ZerodhaLoginPageWithPinPage() throws EncryptedDocumentException, IOException, InterruptedException
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
    	 // zerodhaPinPage.clickOnContinue();
    	  
    	  ZerodhaSharePage zerodhaSharePage=new ZerodhaSharePage(driver);
    	  String share=Parameterization.getData(3,1);
    	  System.out.println(share);
    	  Thread.sleep(3000);
         zerodhaSharePage.enterSearch(share);
          Thread.sleep(3000);
          zerodhaSharePage.clickOngraph(driver);
//          zerodhaSharePage.clickOnBuy(driver);
//          Thread.sleep(3000);
//         zerodhaSharePage.clickOnIntraday();
//         Thread.sleep(3000);
//         //zerodhaSharePage.ClickOnLongTerm();
//         // Thread.sleep(3000);
//         zerodhaSharePage.clickOnmarket();
//         Thread.sleep(3000);
//          //zerodhaSharePage.clickOnLimit();
//         //Thread.sleep(3000);
//        // zerodhaSharePage.clickOnSl();
//         //Thread.sleep(3000);
//         //zerodhaSharePage.clickOnSlm();
//         //Thread.sleep(2000);        
//         zerodhaSharePage.clickOnsubmit();
//         Thread.sleep(2000);
//          
//          screenshot2.TakeScreenShot(driver, userName);
//          
     }

}














