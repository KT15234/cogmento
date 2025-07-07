package utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;



import IHelper.ICalendar;
import baseLayer.BaseClass;

public class CalendarImpl extends BaseClass implements ICalendar {
	private WebElementImpl webElement = new WebElementImpl();
	private WaitImpl wait =new WaitImpl();
	@Override
	public void selectMonthAndYear(WebElement monthAndYear, WebElement next, String expectedMonthAndYear) {
		while(true) {
			if(webElement.getText(monthAndYear).equalsIgnoreCase(expectedMonthAndYear)) {
				break;
			}
			else {
				webElement.click(next);
			}
		}
		
	}

	@Override
	public void selectDates(List<WebElement> listsDates, String expectedDate) {
		for(WebElement date: wait.visibilityOfAllElements(listsDates))
		{
			if(webElement.getText(date).equals(expectedDate))
			{
				webElement.click(date);
				break;
	}

}
	}
	}