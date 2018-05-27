package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {
	
	public MergeLeadsPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/fieldlookup.gif']")
	WebElement eleFromLeadIcon;
	
	public FindLeadWindow clickOnFromLeadIcon(){
		click(eleFromLeadIcon);
		return new FindLeadWindow();
	}
}
