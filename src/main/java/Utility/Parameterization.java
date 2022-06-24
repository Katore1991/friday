package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


      public class Parameterization 
  {
	   public static String getData(int row,int cell) throws EncryptedDocumentException, IOException 
	   {
		   
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Automation\\src\\Velocity\\KiteZerodha\\src\\test\\resources\\Zerodha.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
	  
	   }
  }  

