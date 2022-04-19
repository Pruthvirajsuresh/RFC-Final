package test_suite;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page_objects.RFC_Approve_Page;
import resource.Base;

public class RFC_approval_Test extends Base {

	@Test
	public void RFC_approval() throws InterruptedException, IOException {

		RFC_Approve_Page ra = new RFC_Approve_Page(driver);

		ra.get_view_btn().click();
		log.info("clicked on view button");
		Thread.sleep(2000);

		// scrolldown
		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		scroll1.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);

		ra.get_approve_GST_APOB_CERTIFICATE().click();
		log.info("GST_APOB_CERTIFICATE is approved");
		Thread.sleep(2000);

		ra.get_approve_GST_CERTIFICATE().click();
		log.info("GST_CERTIFICATE is approved");
		Thread.sleep(2000);

		ra.get_approve_FSSAI_CERTIFICATE().click();
		log.info("FSSAI_CERTIFICATE is approved");
		Thread.sleep(2000);

		boolean btn1 = ra.get_approve_RFC_btn().isEnabled();

		if (btn1 == true) {

			Assert.assertTrue(true);
			ra.get_approve_RFC_btn().click();
			Thread.sleep(2000);
			log.info("clicked on approve button");
		} else {
			Assert.assertTrue(false);
			log.error("approve button is not enabled");
		}

		ra.get_confirm_approval_btn().click();
		Thread.sleep(2000);
		screenshot("RFC_approval");
		log.info("RFC SUCCESSFULLY APPROVED");
		log.info("=======================================================");

	}

	@AfterMethod
	public void closebrowser() {

		driver.close();
		log.info("Browser closed");
	}

}
