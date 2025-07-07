package utilityLayer;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import IHelper.IListener;
import baseLayer.BaseClass;

public class ListenerImpl extends BaseClass implements IListener {
	private ExtentReports extentReports;
	private Utils utils = new Utils();
	private ExtentTest extentTest;
	private ScreenshotImpl screenshot = new ScreenshotImpl();

	@Override
	public void onStart(ITestContext context) {

		String path = System.getProperty("user.dir") + "//ExtentReports//" + utils.getDateAndTime("yyyy") + "//"
				+ utils.getDateAndTime("MMMyyyy") + "//" + utils.getDateAndTime("ddMMMyyyy") + "//"
				+ context.getSuite().getName() + utils.getDateAndTime("ddMMMyyyy_HHmmss") + ".html";

		extentReports = new ExtentReports();

		extentReports.attachReporter(new ExtentSparkReporter(path));

	}

	@Override
	public void onTestStart(ITestResult result) {

		extentTest = extentReports.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		extentTest.log(Status.PASS, result.getMethod().getMethodName());

		extentTest.addScreenCaptureFromPath(
				screenshot.takeScreenshot("PassScreenshot", result.getMethod().getMethodName()));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, result.getMethod().getMethodName());

		extentTest.addScreenCaptureFromPath(
				screenshot.takeScreenshot("FailScreenshot", result.getMethod().getMethodName()));

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, result.getMethod().getMethodName());

	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

}
