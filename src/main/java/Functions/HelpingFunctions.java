package Functions;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import TestData.TestData;



public class HelpingFunctions  {
	
	protected static WebDriver driver;
	protected static ExtentReports extent;
	protected static ExtentTest test;
	protected static ExtentHtmlReporter htmlReporter;
	protected static String envirnment=TestData.URL;
	

				
				
			public static void Input(String message, WebElement key,String value){
					try 
					{
						key.clear();
						key.sendKeys(value);
					}	
		 
					catch (NoSuchElementException e) {
						System.err.println("NoSuchElementException: " + e.getMessage());
					}	
				}

			public static void RefreshPage() throws InterruptedException{
					Thread.sleep(2000);
					driver.navigate().refresh();
					Thread.sleep(6000);

			}
	
	
	
			public static void Click(String abc, WebElement key)
			{
					try {
						
						JavascriptExecutor js = (JavascriptExecutor)driver;
						js.executeScript("arguments[0].click();", key);
						
					}
					catch (IndexOutOfBoundsException e) {
						System.err.println("IndexOutOfBoundsException: " + e.getMessage());
					}	
					 
					catch (NoSuchElementException b) {
						System.err.println("NoSuchElementException: " + b.getMessage());
					}	
			}
			
			public static void Verify(String expected, String actual, String mesage){
				try 
				{
					SoftAssert assertion =new SoftAssert();
					assertion.assertEquals(expected, actual, mesage);
					assertion.assertAll();
				}
				catch (IndexOutOfBoundsException e) {
					System.err.println("IndexOutOfBoundsException: " + e.getMessage());
				}	
			}
			
		
}
