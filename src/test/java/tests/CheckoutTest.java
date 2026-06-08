package tests;

import org.testng.annotations.Test;

import Pages.CheckoutPage;
import Pages.LoginPage;
import base.BaseClass;

public class CheckoutTest extends BaseClass {
	
	 @Test
	    public void verifyCheckout() {

	        LoginPage lp = new LoginPage(driver);

	        lp.login("standard_user","secret_sauce");

	        CheckoutPage cp = new CheckoutPage();

	        cp.openCart();

}
}
