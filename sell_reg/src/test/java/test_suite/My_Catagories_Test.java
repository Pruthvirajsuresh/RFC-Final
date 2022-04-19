package test_suite;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.My_catagories_;
import testcase_methods.User_login_;

public class My_Catagories_Test extends Base {

	@Test(priority = 1)
	public void log_in_seller() throws IOException, InterruptedException {
		User_login_.login_screen();
	}

	@Test(priority = 2)
	public void my_catagory_validation() throws InterruptedException, IOException, AWTException {

		My_catagories_.my_catagories();
		Thread.sleep(2000);
		screenshot("my_catagories");

	}

}
