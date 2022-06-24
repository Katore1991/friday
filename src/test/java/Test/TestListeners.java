package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.screenshot2;

public class TestListeners extends BaseTest implements ITestListener
{
	
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName()+" Test has started");
		
	}
    public void onTestFailure(ITestResult result) 
    {
    	try
    	{
    	   screenshot2.TakeScreenShot(driver,result.getName());
    	}
    	catch(IOException e)
    	{
    	  e.printStackTrace();
    }
   }
    public void OnTestSuccess(ITestResult result)
    {
    	System.out.println(result.getName()+ "Test success");
    }

    public void OnTestSkipped(ITestResult result)
    {
    	System.out.println(result.getName()+ "Test skipped");
    }
}

