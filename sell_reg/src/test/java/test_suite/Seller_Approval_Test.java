package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Admin_login_;
import testcase_methods.Seller_approval_;

public class Seller_Approval_Test extends Base {

	@Test(priority = 1)
	public void log_in_admin() throws IOException, InterruptedException {
		Admin_login_.admin_login();
	}

	@Test(priority = 2)
	public void seller_approval() throws InterruptedException, IOException {
		Seller_approval_.seller_approval();
		Thread.sleep(2000);
		screenshot("seller_approval");

	}

}
