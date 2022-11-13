package NoteSpotScenarios;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Functions.HelpingFunctions;
import Locators.LocatorsFile;
import TestData.TestData;

public class LoginToApplication extends HelpingFunctions

{
	public static LocatorsFile login=PageFactory.initElements(driver, LocatorsFile.class);
	public static void ApplicationAccessURL() throws InterruptedException, AWTException, IOException

	{
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		//Provide Rise Application URL in launched WebBrowser
		driver.get(envirnment);
		Thread.sleep(2000);
	
	
	}
	
	public static void Login() throws InterruptedException, AWTException, IOException

	{
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		//Enter User Name
		Input("Provide user name",login.UserNameField,TestData.StandardUser);
		Thread.sleep(2000);
		//Enter Password
		Input("Provide Password",login.PasswordField,TestData.PasswordForAll);
		Thread.sleep(2000);
		Click("Click On Login Button",login.LoginButton);
		Thread.sleep(2000);		
   
		//Login Verification
		String HomePageActualText=login.LoginVerification.getText();
		Verify(TestData.HomePageExpectedText, HomePageActualText, "Login is Successful");
	
		  
  
   
   
   
   
   
	}
	
	
	
	
}




