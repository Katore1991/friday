package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage 
{
	   
	     @FindBy(xpath="//input[@placeholder=\"User ID\"]")private WebElement userID;
	     @FindBy(xpath="//input[@placeholder=\"PAN\"]")private WebElement PAN;
	     @FindBy(xpath="//input[@placeholder=\"E-mail (as on account)\"]")private WebElement Email;
	     @FindBy(xpath="//button[@type=\"submit\"]")private WebElement forgot;
	     @FindBy(xpath="//a[@class=\"text-xsmall text-light reset-account-button\"]")private WebElement Back;

	     public ZerodhaForgotPage(WebDriver driver)
	     {
	     PageFactory.initElements(driver,this);
	     }
        
         public void enterUserId(String user)
       {
    	 userID.sendKeys(user);  
       }
      public void enterPan(String pan)
      {
    	  PAN.sendKeys(pan);
      }
      public void enteremail(String email)
      {
    	Email.sendKeys(email);
      }
      public void clickforgot()
      {
    	 forgot.click(); 
      }
      public void clickBack()
      {
    	Back.click();  
      }
     }
