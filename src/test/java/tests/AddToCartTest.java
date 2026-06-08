package tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import base.BaseClass;

public class AddToCartTest extends BaseClass {
	
	 @Test
	    public void addProductToCart() {

	        LoginPage lp = new LoginPage(driver);

	        lp.login("standard_user","secret_sauce");

	        HomePage hp = new HomePage();

	        hp.addProduct();
	    }

}
