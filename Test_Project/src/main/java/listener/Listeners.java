package listener;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import base.Base;
import extent.reporter.ExtentReporter;
import utilities.CommonUtilities;

public class Listeners extends Base implements ITestListener{
	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;
	ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<ExtentTest>();
	public WebDriver driver = null;
	CommonUtilities cu = new CommonUtilities();
	
	public void onTestStart(ITestResult result) {
		extentTest = extentReport.createTest(result.getName()+" execution started");
		extentTestThread.set(extentTest);
	}

	public void onTestSuccess(ITestResult result) {
		String testname = result.getName();
		//extentTest.log(Status.PASS,testname+" Test Passed");
		extentTestThread.get().log(Status.PASS,testname+" Test Passed");	// making it thread safe
	}

	public void onTestFailure(ITestResult result) {
		//extentTest.fail(result.getThrowable());	// to print cause of error/exception in report. without it itll show as pass
		String testname = result.getName();
		extentTestThread.get().log(Status.FAIL,testname+" Test Failed!");
		extentTestThread.get().fail(result.getThrowable());
		String testMethodName = result.getName();
		try {
			String screenshotPath = cu.takeScreenshot(testMethodName);
			extentTestThread.get().addScreenCaptureFromPath(screenshotPath, testMethodName);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		String testname = result.getName();
		extentTestThread.get().log(Status.SKIP,testname+" Test Passed");
	}

	
	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		extentReport.flush();
	}

}
