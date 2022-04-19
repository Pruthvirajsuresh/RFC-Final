package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Business_pan_;
import testcase_methods.User_login_;

public class Business_Pan_Test extends Base {

	@Test(priority = 1)
	public void log_in_seller() throws IOException, InterruptedException {
		User_login_.login_screen();
	}

	@Test(priority = 2)
	public void bus_pan_validation() throws InterruptedException, IOException {

		Business_pan_.busniness_pan_validation();
		screenshot("busniness_pan_validation");

	}

}
