package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {
	
	String firstId;
	public FindLeadsPage() {		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH, using="(//input[@name='firstName'])[3]")
	WebElement eleFirstNameinFindLead;
	
	public FindLeadsPage enterFirstName(String data) {
		type(eleFirstNameinFindLead, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	WebElement elePhoneTab;
	
	public FindLeadsPage clickOnPhoneTab(){
		click(elePhoneTab);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Email")
	WebElement eleEmailTab;
	
	public FindLeadsPage clickOnEmailTab(){
		click(eleEmailTab);
		return this;
	}
	
	@FindBy(how=How.NAME,using="phoneCountryCode")
	WebElement elePhoneCountryCode;
	
	public FindLeadsPage enterPhoneCountryCode(String data) {
		type(elePhoneCountryCode, data);
		return this;
	}
	
	@FindBy(how=How.NAME,using="phoneNumber")
	WebElement elePhoneNumber;
	
	public FindLeadsPage enterPhoneNumber(String data) {
		type(elePhoneNumber, data);
		return this;
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	WebElement eleEmailId;
	
	public FindLeadsPage enterEmailAddress(String data) {
		type(eleEmailId, data);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	WebElement eleFindLeadButton;
	
	public FindLeadsPage clickOnFindLeadsButton(){
		click(eleFindLeadButton);
		return this;
	}

	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstFind;
	
	public ViewLeadPage clickOnFirstFind(){
		click(eleFirstFind);
		return new ViewLeadPage();
	}
	

	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstId;
	
	public FindLeadsPage getValueofFirstId(){
		firstId = getText(eleFirstId);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='id']")
	WebElement eleLeadId;
	
	public FindLeadsPage enterLeadId(){
		type(eleLeadId, firstId);
		return this;
	}
	
	
	@FindBy(how=How.XPATH, using="//div[@class='x-paging-info']")
	WebElement eleVerifyErrorMessage;
	
	public FindLeadsPage verifyErrorMessage(String expectedText){
		verifyExactText(eleVerifyErrorMessage, expectedText);
		return this;
	}

	
	
}
