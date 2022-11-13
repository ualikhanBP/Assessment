package NoteSpotScenarios;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Functions.HelpingFunctions;
import Locators.LocatorsFile;

public class CeheckItemsInCart extends HelpingFunctions

{
	public static LocatorsFile ItemsInCart=PageFactory.initElements(driver, LocatorsFile.class);
	public static void CheckItemsInCart() throws InterruptedException, AWTException, IOException

	{
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		
		Click("Select Item 1",ItemsInCart.CheckCart);
		Thread.sleep(2000);		

				
		
	
	}
}