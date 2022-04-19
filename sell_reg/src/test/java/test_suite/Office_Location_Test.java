package test_suite;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Office_location_;
import testcase_methods.User_login_;

public class Office_Location_Test extends Base {

	@Test(priority = 1)
	public void log_in_seller() throws IOException, InterruptedException {
		User_login_.login_screen();
	}

	@Test(priority = 2)
	public void Office_location_validation() throws IOException, InterruptedException, AWTException {
		Office_location_.office_location_create();
		Thread.sleep(3000);
		screenshot("office_location_create");
	}

}
