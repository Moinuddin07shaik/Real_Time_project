package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.ScreenshotUtil;

public class TestListener implements ITestListener {

	   @Override
	    public void onTestFailure(ITestResult result) {

	        String path =
	                ScreenshotUtil.captureScreenshot(result.getName());

	        System.out.println("Screenshot saved at : " + path);
	    }
	}