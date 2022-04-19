package test_suite;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.RFC_selection_page;
import resource.Base;

public class RFC_Selection_Test extends Base {

	@Test
	public void RFC_select() throws IOException, InterruptedException {

		RFC_selection_page rs = new RFC_selection_page(driver);

		// confirm that caution message is displayed
		String info_message = rs.get_Caution_message().getText();

		if (info_message.equalsIgnoreCase("*We recommend you to select all FCs to avoid space issues.")) {

			log.info("Info message is displayed stating " + info_message);
		} else {

			Assert.assertTrue(false);
			log.error("Info message is not displayed");
		}

		// FAQ functional test

		rs.get_FAQ1().click();
		log.info("1dt FAQ is opened");
		Thread.sleep(2000);

		rs.get_FAQ2().click();
		log.info("1st FAQ is closed and 2nd FAQ is opened");
		Thread.sleep(2000);

		// submit button is enabled?

		boolean btn_sbmit = rs.get_submit_btn().isEnabled();

		if (btn_sbmit == true) {

			Assert.assertTrue(false);
			log.error("Submit button is enabled before selecting the RFC");
		} else {

			Assert.assertTrue(true);
			log.info("Submit button is not enabled");
		}

		// select RFC

		List<WebElement> checkboxs = rs.get_RFC_check_boxs();

		for (WebElement check : checkboxs) {

			String name_of_the_rfc = check.getText();
			System.out.println(name_of_the_rfc);

			if (name_of_the_rfc.contains("RFC-MH-05 Maharastra RFC")) {
				check.click();

				log.info("RFC is selected");
			}

		}

		Thread.sleep(1000);
		screenshot("RFC_select");

		// submit button should be enabled after selecting RFC

		boolean btn2 = rs.get_submit_btn().isEnabled();

		if (btn2 == true) {

			Assert.assertTrue(true);
			log.info("Submit button is enabled");

		} else {

			Assert.assertTrue(false);
			log.error("Submit button is not available for clicking");
		}

		// FSSAI checkbox
		rs.get_FSSAI_checkbox().click();

		// submit button

		rs.get_submit_btn().click();
		log.info("clicked on submit button");
		log.info("==============================================");

	}

}
