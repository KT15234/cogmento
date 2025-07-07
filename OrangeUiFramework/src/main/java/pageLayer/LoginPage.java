package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginButton;

	public LoginPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void loginFunctionality(String username, String password)
	{
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.loginButton.click();
	}
	
}
