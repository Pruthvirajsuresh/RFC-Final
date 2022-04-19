package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.Org_details_;
import testcase_methods.invitation_code_;
import testcase_methods.landing_page_;
import testcase_methods.personal_pan_;
import testcase_methods.terms_condition_;

public class Personal_pan_Test extends Base {

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

	}

	@Test(priority = 4)
	public void term_checkbox() throws InterruptedException, IOException {

		terms_condition_.checkbox();
	}

	@Test(priority = 5)
	public void review_confirm() throws InterruptedException, IOException {

		invitation_code_.validate_t_c();

	}

	@Test(priority = 6)
	public void invitation_code() throws InterruptedException, IOException {

		invitation_code_.enter_code();

	}

	@Test(priority = 7)
	public void subit_in_code() throws InterruptedException, IOException {

		invitation_code_.submit_code();

	}

	@Test(priority = 8)
	public void org_details() throws InterruptedException, IOException {

		Org_details_.org_details();
	}

	@Test(priority = 9)
	public void per_pan_validation() throws InterruptedException, IOException {

		personal_pan_.per_pan_number();

	}

}
