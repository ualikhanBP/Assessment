package NoteSpotScenarios;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Functions.HelpingFunctions;
import Locators.LocatorsFile;
import TestData.TestData;

public class SelectItems extends HelpingFunctions

{
	public static LocatorsFile ItemsSelect=PageFactory.initElements(driver, LocatorsFile.class);
	public static void SelectThreeItems() throws InterruptedException, AWTException, IOException

	{
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		
		Click("Select Item 1",ItemsSelect.Item1);
		Thread.sleep(2000);		

		Click("Select Item 2",ItemsSelect.Item2);
		Thread.sleep(2000);		

		Click("Select Item 3",ItemsSelect.Item3);
		Thread.sleep(2000);		
		
		String ItemsActualCount=ItemsSelect.ItemCount.getText();
		Verify(TestData.ItemsExpectedCount, ItemsActualCount, "Three Random Items Selected Successfully");
	
	}
}