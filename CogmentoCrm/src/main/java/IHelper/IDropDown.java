package IHelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface IDropDown {

	void selectByVisibleText(WebElement wb, String visibleValue);

	void selectByValue(WebElement wb, String value);

	void selectByIndex(WebElement wb, int index);

	void selectValue(List<WebElement> lists, String expectedValue);

}
