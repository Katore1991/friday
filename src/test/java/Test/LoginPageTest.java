package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parameterization;
import Utility.screenshot2;
@Listeners(TestListeners.class)
public class LoginPageTest extends BaseTest
{
	

   @BeforeMethod
   public void browser()
   {
	  driver=Browser.openBrowser(); 
   }
   @Test
   public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException
   {
	   ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
      String userName=Parameterization.getData(1,0);
      String password=Parameterization.getData(1,1);
      zerodhaLoginPage.enterUserId(userName);
      zerodhaLoginPage.enterPassword(password);
    //zerodhaLoginPage.clickOnLogin();
    }
     @Test//(dependsOnMethods={"clickOnLoginWithoutDataTest"})
   public void forgotPasswordLinkTest()
{
    	 ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
         zerodhaLoginPage.clickOnForgotPassword();
     }
     @Test
     public void signupLinkTest() throws IOException
     {

    	 ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
          zerodhaLoginPage.clickOnSignUp();
     //screenshot2.TakeScreenShot(driver,null);
   
     }
     
}