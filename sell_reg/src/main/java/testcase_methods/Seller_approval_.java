package testcase_methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import page_objects.Seller_approval_page;
import resource.Base;

public class Seller_approval_ extends Base {

	private static Logger log = LogManager.getLogger(Seller_approval_.class.getName());

	public static void seller_approval() throws InterruptedException {

		Seller_approval_page sa = new Seller_approval_page(driver);

		sa.get_view_btn().click();
		log.info("opened the request");
		Thread.sleep(2000);

		sa.get_approve_fssai_doc().click();
		log.info("fssai doc approved");
		Thread.sleep(2000);

		// scrolldown
		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		scroll1.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);

		sa.get_approve_certificate1().click();
		log.info("1st certificate is approved");
		Thread.sleep(2000);

		sa.get_approve_certificate2().click();
		log.info("2nd certificate is approved");
		Thread.sleep(2000);

		sa.get_approve_document1().click();
		log.info("1st document is approved");
		Thread.sleep(2000);

		sa.get_approve_document2().click();
		log.info("2nd document is approved");
		Thread.sleep(2000);

		sa.get_approve_document3().click();
		log.info("3rd document is approved");
		Thread.sleep(2000);

		sa.get_approve_document4().click();
		log.info("4th document is approved");
		Thread.sleep(2000);

		JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
		scroll2.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		boolean btn1 = sa.get_approve_seller_btn().isEnabled();

		if (btn1 == true) {

			Assert.assertTrue(true);
			sa.get_approve_seller_btn().click();
			Thread.sleep(2000);
			log.info("clicked on approve button");
		} else {
			Assert.assertTrue(false);
			log.error("approve button is not enabled");
		}

		sa.get_confirm_approval_btn().click();
		log.info("SELLER SUCCESSFULLY APPROVED");

	}
}
