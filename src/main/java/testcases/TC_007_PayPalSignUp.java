package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PayPalSignUpPage;
import wdMethods.ProjectMethods;

public class TC_007_PayPalSignUp extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC007_PayPalSignUp";
		testDescription="Sign Up into PayPal";
		testNodes="SignUp";
		category="Smoke";
		authors="Anu";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void PayPalSignUp(String country,String email,String password,String confirmPassword) {
		
		new PayPalSignUpPage()
		.clickSignUpButton()
		.verifyandClickShopperRadiobutton()
		.clickNextButton()
		.selectValueFromCountryDropDown(country)
		.enterEmailId(email)
		.enterPassword(password)
		.reEnterPassword(confirmPassword)
		.clickConfirmButton()
		.closeBrowser();
	}

}
