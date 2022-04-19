package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Landing_page_;
import testcase_methods.Terms_condition_;

public class Terms_Condition_Test extends Base {

	@Test(priority = 1)
	public void title_validation() throws InterruptedException {
		Landing_page_.title_validation();

	}

	@Test(priority = 2)
	public void logo_validation() throws InterruptedException, IOException {
		Landing_page_.logo_validations();
	}

	@Test(priority = 3)
	public void t_c_validation() throws InterruptedException, IOException {

		Terms_condition_.terms_conditions();
		Thread.sleep(2000);
		screenshot("terms_conditions");

	}

	@Test(priority = 4)
	public void term_checkbox() throws InterruptedException, IOException {

		Terms_condition_.checkbox();
	}

}
