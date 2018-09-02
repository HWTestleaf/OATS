package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class EditLeadsPage extends ProjectMethods {
	public EditLeadsPage updatecompany(String Cname) {
	WebElement eleUpdatedCompname= locateElement("id", "updateLeadForm_companyName");
	type(eleUpdatedCompname, Cname);
	return this;
}
	
	public EditLeadsPage clickupdatebutton() {
		
		WebElement eleUpdate = locateElement("xpath", "((//input[@class = 'smallSubmit'])[1])");
		click(eleUpdate);
		return this;
	}
}