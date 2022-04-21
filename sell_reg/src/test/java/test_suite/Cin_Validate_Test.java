package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Cin_verify_;
import testcase_methods.User_login_;

public class Cin_Validate_Test extends Base {

	@Test(priority = 1)
	public void log_in_seller() throws IOException, InterruptedException {
		User_login_.login_screen();
	}

	@Test(priority = 2)
	public void Cin_no_valid() throws InterruptedException, IOException {

		Cin_verify_.cin_verification();
		screenshot("cin_verification");

	}

}
