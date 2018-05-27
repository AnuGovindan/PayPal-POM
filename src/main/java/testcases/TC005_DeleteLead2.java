package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead2 extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete the existing Lead";
		testNodes="Leads";
		category="smoke";
		authors="Anu";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String password,String phNumber,String verify) {
		 new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickOnPhoneTab()
		.enterPhoneNumber(phNumber)
		.clickOnFindLeadsButton()
		.clickOnFirstFind()
		.clickOnDelete()
		.clickFindLead()
		.enterLeadId()
		.clickOnFindLeadsButton()		
	    .verifyErrorMessage(verify);
		 driver.close();
	}
}
