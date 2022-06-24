package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser;
import POJO.Browser1;

public class Table 
{
	public static void main(String[] args)
	{
		
		

		
		WebDriver driver=Browser1.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		WebElement stock=driver.findElement(By.xpath("//table//tbody//tr[14]//td[4]"));
		String name=stock.getText();
		System.out.println(name);
	
	    WebElement data=driver.findElement(By.xpath("//table//tbody//tr[1]"));///////for specific row of all values
	    String value=data.getText();
	    System.out.println(value);
	   
	       WebElement heading=driver.findElement(By.xpath("//table//thead//tr"));///////for all column heading
		   String head=heading.getText();
		    System.out.println(head);
		    
		    List<WebElement> column=driver.findElements(By.xpath("//table//thead//tr//th"));
			int columnsize=column.size();
		   System.out.println(columnsize);
		
		
		    List<WebElement> currentprice=driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
			   for(int i=0;i<currentprice.size();i++)
			   {
				   WebElement price=currentprice.get(i);
				   String currentvalue=price.getText();
				   System.out.println(currentvalue);
		   }
	}

}
