package IHelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ICalendar {

	void selectMonthAndYear(WebElement monthAndYear, WebElement next, String expectedMonthAndYear);

	void selectDates(List<WebElement> listsDates, String expectedDate);

}
