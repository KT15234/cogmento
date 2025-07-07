package testLayer;

import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.ContactPage;

public class ContactPageTest extends BaseClass {
	private ContactPage contactPage;

	@Test
	public void validateNewContactFunctionality() {
		contactPage = new ContactPage();

		contactPage.createNewContact("Rahul", "Patil", "rahul@citi.com", "On Hold", "Mumbai");

	}

}
