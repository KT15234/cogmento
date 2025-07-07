package utilityLayer;


import IHelper.IAlert;
import baseLayer.BaseClass;

public class AlertImpl extends BaseClass implements IAlert {
	private WaitImpl wait = new WaitImpl();
	@Override
	public void accept() {
		wait.alertIsPresent().accept();
		
	}

	@Override
	public void dismiss() {
	wait.alertIsPresent().dismiss();
		
	}

	@Override
	public String getText() {
		
		return wait.alertIsPresent().getText();
	}

	@Override
	public void sendKeys(String value) {
		wait.alertIsPresent().sendKeys(value);
		
	}

}
