package baseLayer;

import java.time.Duration;

import utilityLayer.DriverFactory;
import utilityLayer.PropertyReader;
import utilityLayer.WebDriverImpl;

public class BaseClass extends DriverFactory {

	public void initialization(String driverName) {
		setDriver(driverName);

		WebDriverImpl webDriver = new WebDriverImpl();

		webDriver.maximize();

		webDriver.implicitlyWait(Duration.ofSeconds(30));

		webDriver.pageLoadTimeout(Duration.ofSeconds(30));

		webDriver.deleteAllCookies();

		PropertyReader prop = new PropertyReader();

		String url = prop.getProperty("SIT_URL");

		webDriver.get(url);
	}

}

