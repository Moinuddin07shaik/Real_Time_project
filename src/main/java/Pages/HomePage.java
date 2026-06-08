package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	 public HomePage() {

	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id="add-to-cart-sauce-labs-backpack")
	    WebElement addCart;

	    public void addProduct() {

	        addCart.click();
	    }
	}


