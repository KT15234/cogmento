package utilityLayer;

import java.time.Duration;

import IHelper.IWebDriver;
import baseLayer.BaseClass;

public class WebDriverImpl extends BaseClass implements IWebDriver {

	@Override
	public void get(String url) {

		getDriver().get(url);
	}

	@Override
	public void implicitlyWait(Duration duration) {

		getDriver().manage().timeouts().implicitlyWait(duration);

	}

	@Override
	public void pageLoadTimeOut(Duration duration) {

		getDriver().manage().timeouts().pageLoadTimeout(duration);
	}

	@Override
	public void maximize() {

		getDriver().manage().window().maximize();
	}

}
