package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage 
{
   @FindBy(xpath="//a[@class=\"text-light\"]")private WebElement signUp;
 @FindBy(xpath="//input[@id=\"user_mobile\"]")private WebElement monumber;
 @FindBy(xpath="//button[@id=\"open_account_proceed_form\"]")private WebElement submit;


 public ZerodhaSignUpPage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);  
 }

   public void clickSignUp()
 {
	signUp.click();
   }
public void entermonumber(String mobile)
{
	monumber.sendKeys(mobile);
}
 public void clickOnContinue()
 {
	   submit.click();
	  
 }


  }	











