package IHelper;

import java.time.Duration;

public interface IWebDriver {

	void get(String url);

	void implicitlyWait(Duration duration);

	void pageLoadTimeOut(Duration duration);

	void maximize();

}
