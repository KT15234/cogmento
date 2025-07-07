package IHelper;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface IActions {

	void click(WebElement wb);

	void doubleClick(WebElement wb);

	void contextClick(WebElement wb);

	void moveToElement(WebElement wb);

	void scrollToElement(WebElement wb);

	void clickAndHold(WebElement wb);

	void release(WebElement wb);

	void dragAndDrop(WebElement source, WebElement destination);

	void keyDown(Keys keys);

	void keyUp(Keys keys);

	void sendKeys(WebElement wb, String value);

}
