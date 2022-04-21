package testcase_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import page_objects.Bank_acc_page;
import resource.Base;

public class Bank_account_ extends Base {

	private static Logger log = LogManager.getLogger(Bank_account_.class.getName());

	public static void bank_acc_validation() throws InterruptedException, AWTException {

		Bank_acc_page ba = new Bank_acc_page(driver);

		ba.get_bank_tab().click();
		log.info("clicked on bank account tab");

		// validate if submit button is enable before giving the details
		boolean ba1 = ba.get_validate_acc_btn().isEnabled();
		if (ba1 == true) {
			Assert.assertTrue(false);
			log.error("submit button is enabled before giving the details");

		} else {
			Assert.assertTrue(true);
			log.info("submit button is disabled u can enter the details");
		}

		// select bank account type
		WebElement acc_type_dropdown = ba.get_account_type_dropdown();
		Select select = new Select(acc_type_dropdown);
		select.selectByVisibleText("Saving");
		log.info("Account type is " + ba.get_account_type_dropdown().getAttribute("value"));

		// IFSC code
		ba.get_ifsc_code().sendKeys(prop.getProperty("ifsc_code"));
		Thread.sleep(2000);
		ba.get_ifsc_code().sendKeys(Keys.ARROW_DOWN);
		ba.get_ifsc_code().sendKeys(Keys.ENTER);
		log.info("IFSC code entered successfully");

		// IFSC code format validation method is in base class
		String ifsc_no = ba.get_ifsc_code().getAttribute("value");
		isValidIFSCode(ifsc_no);
		log.info("Entered IFSC code is " + isValidIFSCode(ifsc_no));

		// Bank account number
		ba.get_account_number().sendKeys(prop.getProperty("Bank_account_no"));
		String acc1 = ba.get_account_number().getAttribute("value");

		ba.get_verify_acc_no().sendKeys(prop.getProperty("Verify_bank_acc_no"));
		String acc2 = ba.get_verify_acc_no().getAttribute("value");

		if (acc1.equals(acc2)) {

			Assert.assertTrue(true);
			log.info("Account number verified successfully");

		} else {
			Assert.assertTrue(false);
			log.error("Please check the account number entered");
		}

		// account holder name
		ba.get_acc_holder_name().sendKeys(prop.getProperty("Account_holder_name"));
		log.info("account holder name is " + ba.get_acc_holder_name().getAttribute("value"));

		// primary account checkbox
		boolean primary_checkbox = ba.get_primary_acc_checkbox().isSelected();
		if (primary_checkbox == true) {

			Assert.assertTrue(false);
			log.error("checkbox is already checked before checking");
		} else {
			ba.get_primary_acc_checkbox().click();
			log.info("Is Primary Account? checkbox is checked");
		}

		// validation of submit button after giving all the details
		boolean ba2 = ba.get_validate_acc_btn().isEnabled();

		if (ba2 == true) {
			Assert.assertTrue(true);
			ba.get_validate_acc_btn().click();
			log.info("clicked on submit button");
		} else {
			Assert.assertTrue(false);
			log.error("submit button is not enabled to submit after entereing all the details");
		}

		boolean validation_failed = ba.get_validation_error_symbol().isDisplayed();
		if (validation_failed == true) {

			ba.get_upload_option().click();
			log.warn("Bank validation failed please upload documents");

			// select doc type
			WebElement doc_type_dropdown = ba.get_doc_type();
			Select selected_doc = new Select(doc_type_dropdown);
			selected_doc.selectByVisibleText("Cancelled Cheque");

			// upload doc btn and choose file
			Robot robot = new Robot();

			ba.get_upload_doc_btn().click();
			Thread.sleep(1000);

			StringSelection stringSelection = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			Thread.sleep(1000);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

			ba.get_submit_for_approval_btn().click();
			log.info("bank doc uploaded successfully");

		} else {

			log.info("Bank account created successfully");
		}

	}
}
