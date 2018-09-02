package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage clickFindLead(String data) {
		WebElement eleLink4	 = locateElement("xpath", "(//input[@name ='firstName'])[3]");
		type(eleLink4, data);
		return this;
	}
	
	public FindLeadsPage clickFindLeadbutton() throws InterruptedException {
		WebElement eleLink5 = locateElement("xpath", "(//button[contains(text() , 'Find Leads')])");
		click(eleLink5);
        Thread.sleep(1000);
		return this;
	}
	
public ViewLeadsPage clickFirstentry() throws InterruptedException {
		WebElement eleLink6	 = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(eleLink6);
		return new ViewLeadsPage();
	}
	
}
