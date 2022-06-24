package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent
{
	@FindBy(xpath="//input[@id=\"pin\"]")private WebElement pin;
	   @FindBy(xpath=" //button[@type=\"submit\"]")private WebElement submit;;
	   @FindBy(xpath="//a[@class=\"text-light forgot-link\"] ")private WebElement forgot;
	   @FindBy(xpath=" //a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;

	   public Fluent(WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	   public void enterPin(String pinNumber,WebDriver driver)
	   {
		  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver); 
		 wait.withTimeout(Duration.ofMillis(5000));
		 wait.pollingEvery(Duration.ofMillis(5000));
		 wait.ignoring(Exception.class);
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

