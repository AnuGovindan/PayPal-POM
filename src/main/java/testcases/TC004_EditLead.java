package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit the existing Lead";
		testNodes="Leads";
		category="smoke";
		authors="Anu";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String password,String firstName, String companyName, String verify) {
		 new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickOnFindLeadsButton()
		.clickOnFirstFind()
		.clickOnEditButton()
		.enterCompanyName(companyName)
		.clickUpdateButton()
		.verifyCompanyName(verify);
		 driver.close();
	}

}
