package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import page_objects.APOB_page;
import resource.Base;

public class APOB_Test extends Base {

	@Test
	public void APOB_validate() throws InterruptedException, IOException {

		APOB_page ap = new APOB_page(driver);

		// select radio button
		ap.get_radio_btn().click();
		Thread.sleep(2000);
		log.info("clicked on radio button");

		// click on check box
		ap.get_checkbox().click();
		log.info("checkbox checked");

		// click on submit button
		ap.get_Submit_btn().click();
		log.info("clicked on submit button");
		Thread.sleep(2000);
		screenshot("APOB_validate");
		log.info("APOB Completed successfully");
		log.info("================================================");

	}

}
