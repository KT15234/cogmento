package IHelper;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public interface IWait {

	WebElement visibilityOf(WebElement wb);

	List<WebElement> visibilityOfAllElements(List<WebElement> lists);

	WebElement elementToBeClickable(WebElement wb);

	Alert alertIsPresent();

}
