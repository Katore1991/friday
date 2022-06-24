
package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser1;

public class WebTables1 
{
   public static void main(String[] args) 
   {
	WebDriver driver=Browser1.openBrowser("https://demo.guru99.com/test/web-table-element.php");
	WebElement rows= driver.findElement(By.xpath("//table//tbody/tr[3]"));
    String name = rows.getText();
    System.out.println(name);
    
    
       List<WebElement> table1=driver.findElements(By.xpath("//table//tbody//tr[5]//td[4]"));
       for(int i=0;i<table1.size();i++)
	   {
		   WebElement price=table1.get(i);
		   String value=price.getText();
		   System.out.println(value);
        }

          WebElement row=driver.findElement(By.xpath("//table//tbody//tr[8]//td[4]"));
          String name2=row.getText();
          System.out.println(name2);
   
          WebElement list=driver.findElement(By.xpath("//table//tbody//tr[6]"));  
          String value2=  list.getText();
          System.out.println(value2);
          
         List<WebElement> column4=driver.findElements(By.xpath("//table//tbody//tr//td[5]"));
        for(int i=0;i<column4.size();i++)
        {
        	WebElement values= column4.get(i);
          String names=values.getText();
          System.out.println(names);
       }
   
       WebElement columnName=driver.findElement(By.xpath("//table//thead//tr"));
       String column5=columnName.getText();
       System.out.println(column5);
   
   
      List< WebElement> val=driver.findElements(By.xpath("//table//tbody//tr[2]//td[3]"));
       for(int i=0;i<val.size();i++)
       {
    	   WebElement price=val.get(i);
    	   String nam=price.getText();
    	   System.out.println(nam);
    	   }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
   }
}
