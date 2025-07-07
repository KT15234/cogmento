package utilityLayer;

import java.time.Duration;

import org.openqa.selenium.WindowType;

import IHelper.IWebDriver;
import baseLayer.BaseClass;

public class WebDriverImpl extends BaseClass implements IWebDriver {

	@Override
	public void get(String Url) {
		getDriver().get(Url);
	}

	@Override
	public String getTitle() {
		return getDriver().getTitle();
	}

	@Override
	public String getCurrentUrl() {
		return getDriver().getCurrentUrl();
	}

	@Override
	public void close() {
		getDriver().close();
	}

	@Override
	public void quit() {
		getDriver().quit();
	}

	@Override
	public void back() {
		getDriver().navigate().back();
	}

	@Override
	public void forward() {
		getDriver().navigate().forward();
	}

	@Override
	public void refresh() {
		getDriver().navigate().refresh();
	}

	@Override
	public void implicitlyWait(Duration duration) {
		getDriver().manage().timeouts().implicitlyWait(duration);
	}

	@Override
	public void pageLoadTimeout(Duration duration) {
		getDriver().manage().timeouts().pageLoadTimeout(duration);

	}

	@Override
	public void maximize() {
		getDriver().manage().window().maximize();
	}

	@Override
	public void minimize() {
		getDriver().manage().window().minimize();
	}

	@Override
	public void fullscreen() {
		getDriver().manage().window().fullscreen();
	}

	@Override
	public void newWindow(WindowType windowType) {
		getDriver().switchTo().newWindow(windowType);
	}

	@Override
	public void deleteAllCookies() {
		getDriver().manage().deleteAllCookies();
	}

}
