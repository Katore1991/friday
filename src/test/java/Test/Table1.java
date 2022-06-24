package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser;
import POJO.Browser1;

public class Table1 
{
	
	public static void main(String[] args)
	{   

	  double max=0;
	   WebDriver driver=Browser1.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> column=driver.findElements(By.xpath("//table//thead//tr//th"));
		int columnsize=column.size();
	   System.out.println(columnsize);

	   List<WebElement> rowsize=driver.findElements(By.xpath("//table//tbody//tr"));
		int rows=rowsize.size();
	   System.out.println(rows);


      List<WebElement> currentprice=driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
	   for(int i=0;i<currentprice.size();i++)
	   {
		   WebElement price=currentprice.get(i);
		   String currentvalue=price.getText();
		   System.out.println(currentvalue);
   }
//	
//	     if(column.size()>3)/////////////////maximum value from specific column
//	   {
		      double min=0;
		      List<WebElement> currentPrise=driver.findElements(By.xpath("//table//tbody//td[4]"));
		       int size=currentprice.size();
		        //double value=0;
				for(int i=0;i<currentPrise.size();i++)
		      {
		    	  
		        WebElement price=currentprice.get(i);
			   String currentvalue=price.getText();
			   double  value=Double.parseDouble(currentvalue);
			   if(value < min)
		       { 
				  
			      min=value;
		       }
	
		      }
                System.out.println(min);
	          }

	      }










