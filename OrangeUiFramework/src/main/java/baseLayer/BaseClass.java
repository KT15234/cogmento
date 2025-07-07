package baseLayer;

import java.time.Duration;

import utilityLayer.DriverFactory;
import utilityLayer.WebDriverImpl;

public class BaseClass extends DriverFactory {

	public void initialiazation(String driverName) {
		setDriver(driverName);

		WebDriverImpl webdriver = new WebDriverImpl();
		webdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		webdriver.implicitlyWait(Duration.ofSeconds(30));
		webdriver.pageLoadTimeOut(Duration.ofSeconds(30));
		webdriver.maximize();
	}

}
