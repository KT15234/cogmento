package utilityLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	public WebDriver getDriver() {
		return td.get();
	}

	public void setDriver(String driverName) {

		if (driverName.equalsIgnoreCase("chrome")) {
			WebDriver driver = new ChromeDriver();
			td.set(driver);

		}

	}
}
