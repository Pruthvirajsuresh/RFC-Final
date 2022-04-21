package test_suite;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Documents_;
import testcase_methods.User_login_;

public class Documents_Test extends Base {

	@Test(priority = 1)
	public void log_in_seller() throws IOException, InterruptedException {
		User_login_.login_screen();
	}

	@Test(priority = 2)
	public void doc_validate1() throws InterruptedException, IOException, AWTException {

		Documents_.doc_validate();
		Thread.sleep(2000);
		screenshot("doc_validate");

	}

}
