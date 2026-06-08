package utilities;

import org.openqa.selenium.WebElement;

public class ReusableMethods {
	
	  public static void click(WebElement element) {

	        element.click();
	    }

	    public static void enterText(WebElement element,String text) {

	        element.sendKeys(text);
	    }

	    public static String getText(WebElement element) {

	        return element.getText();
	    }

}
