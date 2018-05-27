package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PayPalSignUpPage extends ProjectMethods {
	
	public PayPalSignUpPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using="signup-button")
	WebElement eleSignUpButton;
	
	public PayPalSignUpNextPage clickSignUpButton() {		
		click(eleSignUpButton);
		return new PayPalSignUpNextPage();		
	}

}
