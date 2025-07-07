package utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import IHelper.IDropDown;
import baseLayer.BaseClass;

public class DropdownImpl extends BaseClass implements IDropDown {

	private WaitImpl wait = new WaitImpl();
	private WebElementImpl webElement = new WebElementImpl();

	@Override
	public void selectByVisibleText(WebElement wb, String visibleValue) {

		new Select(wait.visibilityOf(wb)).selectByVisibleText(visibleValue);
	}

	@Override
	public void selectByValue(WebElement wb, String value) {
		new Select(wait.visibilityOf(wb)).selectByValue(value);

	}

	@Override
	public void selectByIndex(WebElement wb, int index) {
		new Select(wait.visibilityOf(wb)).selectByIndex(index);

	}

	@Override
	public void selectValue(List<WebElement> lists, String expectedValue) {

		for (WebElement value : wait.visibilityOfAllElements(lists)) {
			if (webElement.getText(value).equalsIgnoreCase(expectedValue)) {
				webElement.click(value);
				break;
			}
		}

	}

}
