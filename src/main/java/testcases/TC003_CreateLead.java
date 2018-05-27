package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a fresh Lead";
		testNodes="Leads";
		category="sanity";
		authors="Anu";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password,String companyName, String firstName, String lastName, String verify) {
		 new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadButton()
		.verifyFirstName(verify);	
driver.close();
	}
	
}
