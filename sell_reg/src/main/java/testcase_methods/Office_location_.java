package testcase_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import page_objects.Office_loc_page;
import resource.Base;

public class Office_location_ extends Base {

	private static Logger log = LogManager.getLogger(Office_location_.class.getName());

	public static void office_location_create() throws InterruptedException, AWTException, IOException {

		Office_loc_page ol = new Office_loc_page(driver);

		ol.get_off_loc_tab().click();
		log.info("clicked on office location tab");

		ol.get_off_name().sendKeys(prop.getProperty("company_name"));
		log.info("entered office name");

		WebElement type_dropdown = ol.get_off_type();
		Select off_type = new Select(type_dropdown);
		off_type.selectByVisibleText(prop.getProperty("office_type"));
		log.info("office type is" + off_type);

		ol.get_act_as_fulfil_checkbox().click();
		log.info("fulfilemnt center checked");

		ol.get_pincode().sendKeys(prop.getProperty("pincode"));
		Thread.sleep(2000);
		ol.get_pincode().sendKeys(Keys.ARROW_DOWN);
		ol.get_pincode().sendKeys(Keys.ENTER);
		log.info("pincode enetred");

		ol.get_flat_no().sendKeys("617");
		log.info("door number is" + ol.get_flat_no().getAttribute("value"));

		ol.get_primisis_name().sendKeys("vani villas");
		log.info("primisis name is" + ol.get_primisis_name().getAttribute("value"));

		ol.get_area_name().sendKeys("basaveshwarnagar");
		log.info("area name is" + ol.get_area_name().getAttribute("value"));

		ol.get_phone_no().sendKeys("7337751344");
		log.info("phone number entered is" + ol.get_phone_no().getAttribute("value"));

		ol.get_email_id().sendKeys("pruthviraj.s@ia.ooo");
		log.info("email id is" + ol.get_email_id().getAttribute("value"));

		ol.get_food_checkbox().click();
		log.info("this location agreed to sell food products");

		ol.get_gstin_no().sendKeys(prop.getProperty("GSTIN"));
		log.info("GSTIN number is" + ol.get_gstin_no().getAttribute("value"));

		ol.get_con_checkbox2().click();
		log.info("clicked on concer checkbox");

		ol.get_upload_fssai().click();
		log.info("clicked on fssai upload button");

		// FSSAI upload
		ol.get_certificate_type().click();

		ol.get_option_type().click();

		ol.get_certificate_name().sendKeys("fggfgfg");

		ol.get_certificate_number().sendKeys("123456");

		ol.get_calender_btn().click();

		ol.get_change_month_btn().click();
		ol.get_change_month_btn().click();
		Thread.sleep(1000);

		ol.get_active_date_btn().click();

		// choose file
		Robot robot = new Robot();

		ol.get_upload_doc_btn().click();
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

		ol.get_submit_doc_btn().click();
		log.info("fssai doc uploaded successfully");

		WebElement zone = ol.get_zone();
		Select final_zone = new Select(zone);
		final_zone.selectByVisibleText(prop.getProperty("Zone"));
		log.info("selected zone is " + ol.get_zone().getAttribute("value"));

		ol.get_submit_btn().click();
		log.info("OFFICE LOCATION CREATED SUCCESSFULLY");

	}
}
