package test_suite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import page_objects.Business_details_page;
import resource.Base;

public class Business_details_Test extends Base {

	@Test
	public void business_info() throws IOException, InterruptedException, AWTException {

		Business_details_page bd = new Business_details_page(driver);

		bd.get_GSTIN_textfield().sendKeys(prop.getProperty("GSTIN"));
		log.info("GST number entered successfully");

		// GSTIN format validation
		String GST_no = bd.get_GSTIN_textfield().getAttribute("value");
		isValidGSTIN(GST_no);
		log.info("Entered GST number is " + isValidGSTIN(GST_no));

		bd.get_PAN_field().click();

		String PAN_no = bd.get_PAN_field().getAttribute("value");
		System.out.println(PAN_no);

		String GSTIN_no = bd.get_GSTIN_textfield().getAttribute("value");
		System.out.println(GSTIN_no);

		if (GSTIN_no.contains(PAN_no)) {

			log.info("Entered GSTIN is valid");

		} else {

			log.error("GSTIN mismatch with PAN");
			Thread.sleep(2000);
			screenshot("business_info");
			bd.get_GSTIN_textfield().clear();
			log.info("GSTIN cleared");
			bd.get_GSTIN_textfield().sendKeys("27" + PAN_no + "1ZA");
			log.info("valid GSTIN is entered");
			bd.get_PAN_field().click();
		}

		// enter organistation details
		// upload GST Certificate
		// choose file
		Robot robot = new Robot();
		bd.get_upload_GST().click();
		Thread.sleep(2000);

		StringSelection stringSelection = new StringSelection(
				"/home/infibeam/eclipse-workspace/com.rfc.enroll/chcoco.jpeg");
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

		log.info("GST certificate uploaded successfully");

		// enter office name
		bd.get_office_name().sendKeys(prop.getProperty("Office_name"));

		// enter address
		bd.get_Address().sendKeys(prop.getProperty("Address"));

		// enter area
		bd.get_Area().sendKeys(prop.getProperty("Area"));

		// zipcode
		bd.get_pincode().sendKeys(prop.getProperty("Pincode"));
		Thread.sleep(2000);
		bd.get_pincode().sendKeys(Keys.ARROW_DOWN);
		bd.get_pincode().sendKeys(Keys.ENTER);

		// enter mobile number
		bd.get_mobile_no().sendKeys(prop.getProperty("Mobile_no"));

		// enter mailid
		bd.get_Email_id().sendKeys(prop.getProperty("Email"));

		bd.get_Submit_btn().click();
		log.info("Business details saved successfully");
		log.info("================================================");

	}

}
