package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.User_login_;

public class Login_Page_Test extends Base {

	@Test
	public void log_in_seller() throws IOException, InterruptedException {
		User_login_.login_screen();
		Thread.sleep(2000);
		screenshot("login_screen");
	}

}
