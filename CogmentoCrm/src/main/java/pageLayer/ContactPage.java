package pageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.DropdownImpl;
import utilityLayer.WebElementImpl;

public class ContactPage extends BaseClass {

	private WebElementImpl webElement = new WebElementImpl();
	private DropdownImpl dropDown = new DropdownImpl();

	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactLink;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createButton;

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(name = "value")
	private WebElement email;

	@FindBy(name = "status")
	private WebElement status;

	@FindBys(@FindBy(xpath = "//div[@name='status']/child::span"))
	private List<WebElement> statusList;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	public ContactPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void createNewContact(String FirstName, String LastName) {

		webElement.click(contactLink);

		webElement.click(createButton);

		webElement.sendKeys(firstName, FirstName);

		webElement.sendKeys(lastName, LastName);

		webElement.click(saveButton);
	}

	public void createNewContact(String FirstName, String LastName, String Email) {

		webElement.click(contactLink);

		webElement.click(createButton);

		webElement.sendKeys(firstName, FirstName);

		webElement.sendKeys(lastName, LastName);

		webElement.sendKeys(email, Email);

		webElement.click(saveButton);

	}

	public void createNewContact(String FirstName, String LastName, String Email, String Status) {

		webElement.click(contactLink);

		webElement.click(createButton);

		webElement.sendKeys(firstName, FirstName);

		webElement.sendKeys(lastName, LastName);

		webElement.sendKeys(email, Email);

		webElement.click(status);

		dropDown.selectValue(statusList, Status);

		webElement.click(saveButton);

	}

	public void createNewContact(String FirstName, String LastName, String Email, String Status, String Address) {

		webElement.click(contactLink);

		webElement.click(createButton);

		webElement.sendKeys(firstName, FirstName);

		webElement.sendKeys(lastName, LastName);

		webElement.sendKeys(email, Email);

		webElement.click(status);

		dropDown.selectValue(statusList, Status);

		webElement.sendKeys(address, Address);

		webElement.click(saveButton);
	}

}
