package NoteSpotScenarios;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Functions.HelpingFunctions;


public class ExecutionFile extends HelpingFunctions{
	
	static String Suite="ExecutionExtentReport.html";


	@BeforeTest
	public void Startup() throws InterruptedException, AWTException, IOException
	{
		
		StartBrowser.StartupBrowser(Suite);
				
	} 
	

	@Test(priority=0)
	public  void WebsiteAccess() throws InterruptedException, AWTException, IOException
	{
		LoginToApplication.ApplicationAccessURL();
				 	
	}

	@Test(priority=1)
	public  void Login() throws InterruptedException, AWTException, IOException
	{
		LoginToApplication.Login();
		
				 	
	}
	
	@Test(priority=2)
	public  void SelectRandomItems() throws InterruptedException, AWTException, IOException
	{
		SelectItems.SelectThreeItems();
		
				 	
	}
	
	@Test(priority=3)
	public  void CheckItemsInCart() throws InterruptedException, AWTException, IOException
	{
		
        CeheckItemsInCart.CheckItemsInCart();	
		
				 	
	}
	

	
	@AfterMethod
	public void getResult(ITestResult result ) throws IOException, InterruptedException{
	
		if(result.getStatus()==ITestResult.SUCCESS){
			test.log(Status.PASS, result.getMethod().getDescription());
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case is Passed", ExtentColor.GREEN));
			test.log(Status.PASS, " Please see attached screenshot");
 			extent.flush();
			}

		
		if(result.getStatus()==ITestResult.FAILURE){

		 	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
	 		test.fail(result.getThrowable());
	 		extent.flush();
	 		}
			 			
		
		if(result.getStatus()==ITestResult.SKIP){
			System.out.print("Test cases is skipped");
			 test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case is SKIPPED", ExtentColor.YELLOW));
			 test.skip(result.getThrowable());
		    }				 		
		
	 }
	
	 @AfterTest
	 public void teardown()
	 {
	  	
	  	driver.close();
	 }

}
