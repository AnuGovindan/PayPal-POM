package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PayPalSignUpNextPage extends ProjectMethods {
	
	public PayPalSignUpNextPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using="radio-personal")
	WebElement eleShopperradioButton;
	
	public PayPalSignUpNextPage verifyandClickShopperRadiobutton() {		
		boolean verifySelected = verifySelected(eleShopperradioButton);
		if(!verifySelected)
		{
			click(eleShopperradioButton);
		}
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	WebElement eleNextButton;
	
	public PaypalLoginPage clickNextButton() {		
		click(eleNextButton);
		return new PaypalLoginPage();
	}
	
	
	
	
	
	
	
	
	

}
