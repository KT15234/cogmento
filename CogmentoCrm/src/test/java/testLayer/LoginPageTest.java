package testLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.LoginPage;
import utilityLayer.WebDriverImpl;

public class LoginPageTest extends BaseClass {
	private LoginPage loginPage;

	@Parameters({ "driverName" })
	@BeforeTest
	public void setUp(String driverName) {
		initialization(driverName);
	}

	@Test
	public void validateLoginFunctionality() {

		loginPage = new LoginPage();

		loginPage.loginFunctionality("prafulp1010@gmail.com", "Pr@ful0812");
	}

	@AfterTest
	public void tearDown() {
		new WebDriverImpl().quit();
	}
}
