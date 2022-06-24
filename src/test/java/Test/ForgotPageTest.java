package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;

import POJO.Browser;
import POM.ZerodhaForgotPage;
import POM.ZerodhaLoginPage;
import Utility.Parameterization;
import Utility.Report;
@Listeners(TestListeners.class)
public class ForgotPageTest extends BaseTest
{
    ExtentReports reports;
    ExtentTest test;
@BeforeTest
public void extentReports()
{
	reports= Report.createReport();
}

@BeforeMethod
   public void Browser()
   {
	   driver=Browser.openBrowser();
	}
   
   @Test
   public void LoginValidCredentialTes() throws EncryptedDocumentException, IOException
   {
	   test=reports.createTest("LoginValidCredentialTes");
	 ZerodhaLoginPage Login= new ZerodhaLoginPage(driver);
	 String userName=Parameterization.getData(1,0);
     String password=Parameterization.getData(1,1);
     Login.enterUserId(userName);
     Login.enterPassword(password);
     Login.clickOnLogin();
   }
    @Test
    public void forgotPasswordTest() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	test=reports.createTest("forgotPasswordTest");
   	 ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
     zerodhaLoginPage.clickOnForgotPassword();
     
     Thread.sleep(3000);
     
     ZerodhaForgotPage zerodhaForgotPage= new ZerodhaForgotPage(driver);
	 String userName=Parameterization.getData(3,1);
     String pan=Parameterization.getData(4,1);
     String Email=Parameterization.getData(5,1);
     zerodhaForgotPage.enterUserId(userName);
     zerodhaForgotPage.enterPan(pan);
     zerodhaForgotPage.enteremail(Email);
    // zerodhaForgotPage.clickBack();
    } 
    //@Test
    @AfterMethod
    public void closeBrowser(ITestResult result)
    {
    	
     if(result.getStatus()==ITestResult.FAILURE)
  {
	test.log(Status.FAIL,result.getName());  
  }
     else if(result.getStatus()==ITestResult.SUCCESS)
     {
    	test.log(Status.PASS,result.getName()); 
     }
     else
     {
    	 test.log(Status.SKIP,result.getName());
     }
  }
@AfterTest
    public void flushResult()
   {
	reports.flush();
    }
}

