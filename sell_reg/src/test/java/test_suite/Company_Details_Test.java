package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Company_details_;
import testcase_methods.User_login_;

public class Company_Details_Test extends Base {

	@Test(priority = 1)
	public void log_in_seller() throws IOException, InterruptedException {
		User_login_.login_screen();
	}

	@Test(priority = 2)
	public void company_details_validation() throws InterruptedException, IOException {

		Company_details_.cmpny_verify();
		Thread.sleep(3000);
		screenshot("cmpny_verify");

	}

}
