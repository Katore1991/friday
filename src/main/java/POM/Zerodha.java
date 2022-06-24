package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha
{
		
     
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement password;
      @FindBy(xpath="//button[@type=\"submit\"]")private WebElement login;
      @FindBy(xpath="//input[@id=\"pin\"]")private WebElement pin;
      @FindBy(xpath="//button[@type=\"submit\"]")private WebElement submit;
      @FindBy(xpath="//input[@type=\"text\"]")private WebElement search;
      @FindBy(xpath="(//span[@class=\\\"symbol\\\"])[2]")private WebElement share;
      @FindBy(xpath="(//button[@class=\"button-blue\"])[1]")private WebElement buy;
      @FindBy(xpath="(//label[@class=\"su-radio-label\"])[7]")private WebElement intraday;
      @FindBy(xpath="(//label[@class=\"su-radio-label\"])[9]")private WebElement market;
      @FindBy(xpath="//button[@type=\"submit\"]")private WebElement Buy;
      @FindBy(xpath="//a[@class=\"router-link-exact-active router-link-active\"]")private WebElement holdings;
      

          public Zerodha(WebDriver driver)
	     {
	     PageFactory.initElements(driver,this);
	     }

    public void enterpassword(String pass)
    {
    	password.sendKeys(pass);
    }

    public void clickOnLogin()
    {
    	login.click();
    }
    public void enterpin(String pins)
    {
    	pin.sendKeys(pins);
    }

    public void clickOnSubmit()
    {
    	submit.sendKeys();
    }


    public void clickOnSearch(String Tata)
    {
    	search.click();
    	share.sendKeys(Tata);
    }

    public void clickOnBuy(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(share).perform();
		action.moveToElement(Buy);
		action.click();
		action.perform();
	}
   public void clickOnIntraday()
   {
	   intraday.click();
   }

    public void clickOnMarket()
{
	market.click();
}

   public void clickOnBuy()
{
	buy.click();
}
public void clickOnHoldings()
{
	holdings.click();
}
}
