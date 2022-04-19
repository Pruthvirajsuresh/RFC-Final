package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.landing_page_;
import testcase_methods.terms_condition_;

public class Terms_condition_Test extends Base {

	@Test(priority = 1)
	public void title_validation() throws InterruptedException {
		landing_page_.title_validation();

	}

	@Test(priority = 2)
	public void logo_validation() throws InterruptedException, IOException {
		landing_page_.logo_validations();
	}

	@Test(priority = 3)
	public void t_c_validation() throws InterruptedException, IOException {

		terms_condition_.terms_conditions();
		Thread.sleep(2000);
		screenshot("terms_conditions");

	}

	@Test(priority = 4)
	public void term_checkbox() throws InterruptedException, IOException {

		terms_condition_.checkbox();
	}
}
