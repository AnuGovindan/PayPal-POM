package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirstName;
	
	public ViewLeadPage verifyFirstName(String data) {
	verifyExactText(eleVerifyFirstName, data);
		return this;				
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleVerifyCompanyName;
	
	public ViewLeadPage verifyCompanyName(String data) {
	verifyPartialText(eleVerifyCompanyName, data);
		return this;				
	}
	@FindBy(how=How.LINK_TEXT,using="Edit")
	WebElement eleEditButton;
	public EditLeadPage clickOnEditButton()
	{
		click(eleEditButton);
		return new EditLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	WebElement eDeleteButton;
	
	public MyLeadsPage clickOnDelete(){
		click(eDeleteButton);
		return new MyLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	WebElement eDuplicateLeadButton;
	
	public DuplicateLeadPage clickOnDuplicateLead(){
		click(eDuplicateLeadButton);
		return new DuplicateLeadPage();
	}
	
	
}
