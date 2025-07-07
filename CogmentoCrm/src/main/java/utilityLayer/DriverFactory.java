package utilityLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverFactory {

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	public WebDriver getDriver() {
		return td.get();
	}
	
	public void setDriver(String driverName)
	{
		if(driverName.equalsIgnoreCase("chrome"))
		{
			td.set(new ChromeDriver());
		}
		else if(driverName.equalsIgnoreCase("edge"))
		{
			td.set(new EdgeDriver());
		}
		else if(driverName.equalsIgnoreCase("incognito"))
		{
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));
		}
		else if(driverName.equalsIgnoreCase("headless"))
		{
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
		}
		else if(driverName.equalsIgnoreCase("private"))
		{
			td.set(new EdgeDriver(new EdgeOptions().addArguments("--private")));
		}
		else
		{
			System.err.println("Please Enter valid driver Name");
		}
			
	}

}
