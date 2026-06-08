package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import utilities.EmailUtil;

public class SuiteListener implements ISuiteListener {
	
	  @Override
	    public void onFinish(ISuite suite) {

	        try {

	            EmailUtil.sendReport();

	        } catch (Exception e) {

	            e.printStackTrace();
	        }
	    }
	}


