package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CheckoutPage extends BaseClass{
	  public CheckoutPage() {

	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id="shopping_cart_container")
	    WebElement cart;

	    public void openCart() {

	        cart.click();
	    }

}
