package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSharePage 
{
   @FindBy(xpath="//input[@icon=\"search\"]")private WebElement Search;
   @FindBy(xpath="(//span[@class=\"symbol\"])[2]")private WebElement TataMotors;
   @FindBy(xpath="//span[@class=\"icon icon-trending-up\"]")private WebElement graph;
	
//   @FindBy(xpath="//button[@data-balloon=\"Buy\"]")private WebElement Buy;
//   @FindBy(xpath="(//label[@class=\"su-radio-label\"])[7]")private WebElement Intraday;
//   @FindBy(xpath="(//label[@class=\"su-radio-label\"])[8]")private WebElement LongTerm;
//   @FindBy(xpath="(//label[@class=\"su-radio-label\"])[9]")private WebElement Market;
//   @FindBy(xpath="(//label[@class=\"su-radio-label\"])[10]")private WebElement Limit;
//   @FindBy(xpath="(//label[@class=\"su-radio-label\"])[11]")private WebElement Sl;
//   @FindBy(xpath="(//label[@class=\"su-radio-label\"])[12]")private WebElement Slm;
//   @FindBy(xpath="(//label[@class=\"su-switch-control\"])")private WebElement Move;
//   @FindBy(xpath="//button[@type=\"submit\"]")private WebElement Buy1;
//	
	public ZerodhaSharePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterSearch(String Share)
	{
		Search.click();
		Search.sendKeys(Share);
	}
	public void clickOngraph(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(TataMotors).perform();
		action.moveToElement(graph);
		action.click();
		action.perform();
	}
	
//	public void clickOnIntraday() throws InterruptedException
//	{
//		
//		Intraday.click();
//	}
//	public void ClickOnLongTerm()
//	{
//		LongTerm.click();
//	}
//	public void clickOnmarket()
//	{
//	Market.click();	
//	}
//	public void clickOnLimit()
//	{
//		Limit.click();
//	}
//	public void clickOnSl()
//	{
//		Sl.click();
//	}
//	public void clickOnSlm()
//	{
//		Slm.click();
//	}
//	
//	public void clickOnsubmit()
//	{
//	
//
//		Buy1.click();
//	}
	
	//public void clickOnGraph()
	////{
		//graph.click();
	
	
}
