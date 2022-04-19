package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.landing_page_;

public class Landing_Page_Test extends Base {

	@Test(priority = 1)
	public void title_validation() throws InterruptedException {
		landing_page_.title_validation();

	}

	@Test(priority = 2)
	public void logo_validation() throws InterruptedException, IOException {
		landing_page_.logo_validations();
		Thread.sleep(2000);
		screenshot("logo_validations");
	}

}