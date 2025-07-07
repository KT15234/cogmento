package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.WebElementImpl;

public class LoginPage extends BaseClass {

	private WebElementImpl webElement = new WebElementImpl();

	// POM with Page Factory
	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginButton;

	// initialize OR using PageFactory.initElements()
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// create Associated methods without entering test data and without performing
	// actions
	public void loginFunctionality(String Username, String Password) {
		webElement.sendKeys(username, Username);

		webElement.sendKeys(password, Password);

		webElement.click(loginButton);
	}

}
