package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate Lead";
		testNodes="Leads";
		category="smoke";
		authors="Anu";
		browserName="chrome";
		dataSheetName="TC006";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String password,String email,String verify) {
		 new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickOnEmailTab()
		.enterEmailAddress(email)
		.clickOnFindLeadsButton()
		.clickOnFirstFind()
		.clickOnDuplicateLead()
		.getPageTitle()
		.clickOnCreateLeadButton()
		.verifyFirstName(verify);
	}
		
}
