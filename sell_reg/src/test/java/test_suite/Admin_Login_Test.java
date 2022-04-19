package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Admin_login_;

public class Admin_Login_Test extends Base {

	@Test(priority = 1)
	public void log_in_admin() throws IOException, InterruptedException {
		Admin_login_.admin_login();
		screenshot("admin_login");
	}

}
