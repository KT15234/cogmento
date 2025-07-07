
package utilityLayer;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import IHelper.IScreenshot;
import baseLayer.BaseClass;

public class ScreenshotImpl extends BaseClass implements IScreenshot {

	private Utils utils = new Utils();

	@Override
	public String takeScreenshot(String folderName, String testCaseName) {

		String path = System.getProperty("user.dir") + "//Screenshot//" + utils.getDateAndTime("yyyy") + "//"
				+ utils.getDateAndTime("MMMyyyy") + "//" + utils.getDateAndTime("ddMMMyyyy") + "//" + folderName + "//"
				+ testCaseName + utils.getDateAndTime("ddMMMyyyy_HHmmss") + ".png";

		try {
			FileUtils.copyFile(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE), new File(path));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return path;
	}

}
