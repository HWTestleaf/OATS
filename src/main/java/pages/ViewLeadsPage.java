package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods {
	
	public EditLeadsPage clickEditLead() {
		
		WebElement eleEdit	 = locateElement("xpath", "(//a[contains(text() , 'Edit')])");
		click(eleEdit);
		return new EditLeadsPage();
		
		
		
		
		
	}

}