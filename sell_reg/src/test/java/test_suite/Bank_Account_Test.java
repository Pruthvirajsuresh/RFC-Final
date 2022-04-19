package test_suite;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Bank_account_;
import testcase_methods.User_login_;

public class Bank_Account_Test extends Base {

	@Test(priority = 1)
	public void log_in_seller() throws IOException, InterruptedException {
		User_login_.login_screen();
	}

	@Test(priority = 2)
	public void bank_act_validation() throws InterruptedException, IOException, AWTException {

		Bank_account_.bank_acc_validation();
		Thread.sleep(2000);
		screenshot("bank_acc_validation");

	}

}
