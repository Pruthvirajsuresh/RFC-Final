package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Bill_plan_;
import testcase_methods.User_login_;

public class Bill_Plan_Test extends Base {

	@Test(priority = 1)
	public void log_in_seller() throws IOException, InterruptedException {
		User_login_.login_screen();
	}

	@Test(priority = 2)
	public void bill_plan_validation() throws InterruptedException, IOException {

		Bill_plan_.bill_plan_validation();
		Thread.sleep(2000);
		screenshot("bill_plan_validation");

	}

}
