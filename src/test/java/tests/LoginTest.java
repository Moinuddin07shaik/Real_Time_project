package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import base.BaseClass;
import utilities.ScreenshotUtil;

public class LoginTest extends BaseClass{
	
	
	@Test
	public void verifyLogin() {

	    LoginPage lp = new LoginPage(driver);

	    lp.login("standard_user", "secret_sauce");

	    String path =
	            ScreenshotUtil.captureScreenshot("LoginPage");

	    log.info("Screenshot saved at : " + path);

	    Assert.assertTrue(
	            driver.getCurrentUrl().contains("inventory"));
	}
}