package IHelper;

import java.time.Duration;

import org.openqa.selenium.WindowType;

public interface IWebDriver {

	void get(String Url);

	String getTitle();

	String getCurrentUrl();

	void close();

	void quit();

	void back();

	void forward();

	void refresh();

	void implicitlyWait(Duration duration);

	void pageLoadTimeout(Duration duration);

	void maximize();

	void minimize();

	void fullscreen();

	void newWindow(WindowType windowType);

	void deleteAllCookies();

}
