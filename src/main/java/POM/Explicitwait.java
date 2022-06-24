package POM;

import java.time.Duration;
  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait
{
	
	@FindBy(xpath="//input[@id=\"pin\"]")private WebElement pin;
	   @FindBy(xpath=" //button[@type=\"submit\"]")private WebElement submit;;
	   @FindBy(xpath="//a[@class=\"text-light forgot-link\"] ")private WebElement forgot;
	   @FindBy(xpath=" //a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;

	   public Explicitwait(WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	   public void enterPin(String pinNumber,WebDriver driver)
	   {
		   
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(2000));
		 wait.until(ExpectedConditions.visibilityOf(pin));
		 pin.sendKeys(pinNumber);
	   }
	 
	     public void enterPin(String pinNumber)
	   {
		pin.sendKeys(pinNumber);
	     }

	   public void clickOnContinue()
	   {
		   submit.click();
		  
	   }
	    public void clickOnForgot()
	    {
	    	forgot.click();
	    }
	     public void clickOnSignUp()
	   {

	     signup.click();

	    }	
	}



