package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PaypalLoginPage extends ProjectMethods{
	
	public PaypalLoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using="country")
	WebElement eleCountryDropDown;
	
	public PaypalLoginPage selectValueFromCountryDropDown(String data) {		
		selectDropDownUsingText(eleCountryDropDown,data);	
		return this;
	}
	
	@FindBy(how=How.ID, using="email")
	WebElement eleEmail;
	
	public PaypalLoginPage enterEmailId(String data) {		
		type(eleEmail, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="password")
	WebElement elePassword;
	
	public PaypalLoginPage enterPassword(String data) {		
		type(elePassword, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="confirmPassword")
	WebElement eleConfirmPassword;
	
	public PaypalLoginPage reEnterPassword(String data) {		
		type(eleConfirmPassword, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="_eventId_personal")
	WebElement eleConfirmButton;
	
	public PaypalLoginPage clickConfirmButton() {		
		click(eleConfirmButton);
		return this;
	}
	
	
	
	
	
	
	
	

}
