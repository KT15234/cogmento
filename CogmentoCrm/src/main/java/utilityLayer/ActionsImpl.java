package utilityLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import IHelper.IActions;
import baseLayer.BaseClass;

public class ActionsImpl extends BaseClass implements IActions {
  private WaitImpl wait =new WaitImpl();
	@Override
	public void click(WebElement wb) {
		new Actions(getDriver()).click(wait.elementToBeClickable(wb)).build().perform();
		
	}

	@Override
	public void doubleClick(WebElement wb) {
		new Actions(getDriver()).doubleClick(wait.elementToBeClickable(wb)).build().perform();
		
	}

	@Override
	public void contextClick(WebElement wb) {
	
		new Actions(getDriver()).contextClick(wait.elementToBeClickable(wb)).build().perform();
	}

	@Override
	public void moveToElement(WebElement wb) {
		new Actions(getDriver()).moveToElement(wait.visibilityOf(wb)).build().perform();
	}

	@Override
	public void scrollToElement(WebElement wb) {
		new Actions(getDriver()).scrollToElement(wait.visibilityOf(wb)).build().perform();

	}

	@Override
	public void clickAndHold(WebElement wb) {
		new Actions(getDriver()).clickAndHold(wait.elementToBeClickable(wb)).build().perform();
		
	}

	@Override
	public void release(WebElement wb) {
	new Actions(getDriver()).release(wait.visibilityOf(wb)).build().perform();
		
	}

	@Override
	public void dragAndDrop(WebElement source, WebElement destination) {
		new Actions(getDriver()).dragAndDrop(wait.visibilityOf(source), wait.visibilityOf(destination)).build()
		.perform();
	}

	@Override
	public void keyDown(Keys keys) {
		new Actions(getDriver()).keyDown(keys).build().perform();	}

	@Override
	public void keyUp(Keys keys) {
		new Actions(getDriver()).keyDown(keys).build().perform();
			}

	@Override
	public void sendKeys(WebElement wb, String value) {
		new Actions(getDriver()).sendKeys(wait.visibilityOf(wb), value).build().perform();
		
	}

}
