package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Close_account_;
import testcase_methods.User_login_;

public class Close_Account_Test extends Base {

	@Test(priority = 1)
	public void log_in_seller() throws IOException, InterruptedException {
		User_login_.login_screen();
	}

	@Test(priority = 2)
	public void close_account_seller() throws IOException, InterruptedException {
		Close_account_.account_close();
		Thread.sleep(2000);
		screenshot("account_close");
	}

}
