package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadWindow extends ProjectMethods {
	
	public FindLeadWindow() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.NAME,using="firstName")
	WebElement eleMFirstName;
	public FindLeadWindow enterMrgFirstName(String data) {
		type(eleMFirstName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement eleMFindLeadsButton;
	public FindLeadWindow ClickOnMrgFindLeadsButton(String data) {
		click(eleMFindLeadsButton);
		return this;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleMFirstFind;
	public MergeLeadsPage ClickOnMrgFirstFind(){
		click(eleMFirstFind);
		return new MergeLeadsPage();
	}
	 
			

}
