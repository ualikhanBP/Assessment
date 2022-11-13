package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class LocatorsFile 
	{
		//all locators
		
		@FindBy(id="user-name") public WebElement UserNameField;
		@FindBy(id="password") public WebElement PasswordField;
		@FindBy(id="login-button") public WebElement LoginButton;
		@FindBy(id="add-to-cart-sauce-labs-backpack") public WebElement Item1;
		@FindBy(id="add-to-cart-sauce-labs-bike-light") public WebElement Item2;
		@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt") public WebElement Item3;
		@FindBy(xpath="//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]") public WebElement CheckCart;
		@FindBy(xpath="//span[contains(text(),'Products')]") public WebElement LoginVerification;
		
		@FindBy(xpath="//span[contains(text(),'3')]") public WebElement ItemCount;
		
		
		
		
		
		
	
		
		

}
