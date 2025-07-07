package pageLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class PimPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimLink;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addEmployee;

	@FindBy(name = "firstName")
	private WebElement firstName;

	@FindBy(name = "middleName")
	private WebElement middleName;

	@FindBy(name = "lastName")
	private WebElement lastName;

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement addEmployeeErrorMessage;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButtonOnAddEmployeePage;

	@FindBy(xpath = "//label[text()='Nationality']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']")
	private WebElement country;

	@FindBys(@FindBy(xpath = "//label[text()='Nationality']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-option']/child::span"))
	private List<WebElement> listCountry;

	@FindBys(@FindBy(xpath = "//div[@class='oxd-radio-wrapper']/child::label"))
	private List<WebElement> listgender;

	@FindBy(xpath = "//label[text()='Blood Type']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']")
	private WebElement bloodType;

	@FindBys(@FindBy(xpath = "//label[text()='Blood Type']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-option']/child::span"))
	private List<WebElement> listbloodType;

	@FindBy(xpath = "(//button[text()=' Save '])[1]")
	private WebElement saveButtonOnUpdateEmployeePage;

	@FindBy(xpath = "(//button[text()=' Save '])[2]")
	private WebElement saveButtonOnUpdateBloodEmployeePage;

	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement employeeList;

	@FindBy(xpath = "//label[text()='Employee Id']/parent::div/following-sibling::div/descendant::input")
	private WebElement employeeId;

	@FindBy(xpath = "//label[text()='Employee Name']/parent::div/following-sibling::div/descendant::input")
	private WebElement employeeName;

	@FindBy(xpath = "//label[text()='Employment Status']/parent::div/following-sibling::div/descendant::div[1]")
	private WebElement employeeStatus;

	@FindBys(@FindBy(xpath = "//label[text()='Employment Status']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-option']"))
	private List<WebElement> listEmployeeStatus;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchButton;

	@FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/child::span")
	private WebElement resultMessage;

	@FindBy(xpath = "")
	private WebElement deleteEmployeeCheckbox;

	@FindBy(xpath = "")
	private WebElement deleteSelectedButton;

	@FindBy(xpath = "")
	private WebElement yesDeleteButton;

	public PimPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// create associated method for each and every Object Repository without
	// entering test data and to perform actions class methods from Utility Layer
	// Package

	public String createEmployee(String firstName) {

		this.pimLink.click();
		this.addEmployee.click();

		this.firstName.sendKeys(firstName);
		this.saveButtonOnAddEmployeePage.click();
		return this.addEmployeeErrorMessage.getText();
	}

	public String createEmployee(String firstName, String lastName) {

		this.pimLink.click();
		this.addEmployee.click();

		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.saveButtonOnAddEmployeePage.click();

		return this.addEmployeeErrorMessage.getText();

	}

	public void createEmployee(String firstName, String middleName, String lastName) {
        
	}

	// -------------------------------------------------------------------------------------
	public void updateEmployee(String country) {

		this.country.click();

		for (WebElement wb : listCountry) {
			String actualCountry = wb.getText();

			if (actualCountry.equalsIgnoreCase("INDIA")) {
				wb.click();
			}
		}

		this.saveButtonOnUpdateEmployeePage.click();

	}

	public void updateEmployee(String country, String gender) {

	}

	public void updateEmployee(String country, String gender, String bloodType) {

	}

	// -------------------------------------------------------------------------------------
	public String searchEmployee(String employeeId) throws InterruptedException {

		this.employeeList.click();

		Thread.sleep(3000);

		this.employeeId.sendKeys(employeeId);

		Thread.sleep(3000);

		this.searchButton.click();

		Thread.sleep(3000);
		return this.resultMessage.getText();

	}

	public void searchEmployee(String employeeId, String employeeName) {

	}

	public void searchEmployee(String employeeId, String employeeName, String EmployeeStatus) {

	}

	// -------------------------------------------------------------------------------------
	public void deleteEmployee(String employeeId) {
//		searchEmployee(employeeId);
		// select delete checkbox
	}

	public void deleteEmployee(String employeeId, String employeeName) {
		searchEmployee(employeeId, employeeName);
	}

	public void deleteEmployee(String employeeId, String employeeName, String EmployeeStatus) {
		searchEmployee(employeeId, employeeName, EmployeeStatus);
	}

}
