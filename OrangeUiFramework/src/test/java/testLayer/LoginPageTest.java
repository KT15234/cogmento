package testLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	@BeforeTest
	public void setUp() {
		initialiazation("chrome");
	}

	@Test
	public void validateLoginFunctionality() {
		LoginPage loginPage = new LoginPage();

		loginPage.loginFunctionality("Admin", "admin123");
	}

}
