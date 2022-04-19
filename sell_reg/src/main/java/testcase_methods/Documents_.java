package testcase_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import page_objects.Documents_page;
import resource.Base;

public class Documents_ extends Base {

	private static Logger log = LogManager.getLogger(Documents_.class.getName());

	public static void doc_validate() throws InterruptedException, AWTException {

		Documents_page dp = new Documents_page(driver);

		dp.get_document_tab().click();
		log.info("clicked on doc tab");

		// document 1
		dp.get_doc_radio_btn().click();
		Thread.sleep(1000);
		WebElement dropdown25 = dp.get_doc_type_dropdown();
		Select select25 = new Select(dropdown25);
		select25.selectByVisibleText("Resolution Document from Board of Directors");
		log.info("selected Resolution Document from Board of Directors document from dropdown");
		Thread.sleep(1000);

		// choose file
		Robot robot = new Robot();
		dp.get_upload_btn().click();
		Thread.sleep(2000);

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

		dp.get_submit_btn().click();
		log.info("Resolution Document from Board of Directors uploaded successfully");
		Thread.sleep(2000);

		// document 2
		dp.get_doc_radio_btn().click();
		Thread.sleep(1000);
		WebElement dropdown26 = dp.get_doc_type_dropdown();
		Select select26 = new Select(dropdown26);
		select26.selectByVisibleText("Memorandum Of Association (MOA)");
		log.info("Memorandum Of Association (MOA) document from dropdown");
		Thread.sleep(1000);

		// choose file
		Robot robo = new Robot();
		dp.get_upload_btn().click();
		Thread.sleep(2000);

		StringSelection stringSelection1 = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
		Thread.sleep(1000);

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		dp.get_submit_btn().click();
		log.info("Memorandum Of Association (MOA) document uploaded successfully");
		Thread.sleep(1000);

		// document 3
		dp.get_doc_radio_btn().click();
		Thread.sleep(1000);

		WebElement dropdown261 = dp.get_doc_type_dropdown();
		Select select261 = new Select(dropdown261);
		select261.selectByVisibleText("Electricity Bill");
		log.info("selected Electricity Bill from dropdown");
		Thread.sleep(1000);

		// choose file
		Robot robot123 = new Robot();
		dp.get_upload_btn().click();
		Thread.sleep(2000);

		StringSelection stringSelection123 = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection123, null);
		Thread.sleep(1000);

		robot123.keyPress(KeyEvent.VK_CONTROL);
		robot123.keyPress(KeyEvent.VK_V);

		robot123.keyRelease(KeyEvent.VK_CONTROL);
		robot123.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		robot123.keyPress(KeyEvent.VK_ENTER);
		robot123.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		dp.get_submit_btn().click();
		log.info("Electricity Bill uploaded successfully");
		Thread.sleep(1000);

		// document 4
		dp.get_doc_radio_btn().click();
		Thread.sleep(1000);

		WebElement dropdown262 = dp.get_doc_type_dropdown();
		Select select262 = new Select(dropdown262);
		select262.selectByVisibleText("Registered Rent Agreement");
		log.info("selected Registered Rent Agreement from dropdown");
		Thread.sleep(1000);

		// choose file
		Robot robot1234 = new Robot();
		dp.get_upload_btn().click();
		Thread.sleep(2000);

		StringSelection stringSelection1234 = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1234, null);
		Thread.sleep(1000);

		robot1234.keyPress(KeyEvent.VK_CONTROL);
		robot1234.keyPress(KeyEvent.VK_V);

		robot1234.keyRelease(KeyEvent.VK_CONTROL);
		robot1234.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		robot1234.keyPress(KeyEvent.VK_ENTER);
		robot1234.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		dp.get_submit_btn().click();
		log.info("Registered Rent Agreement uploaded successfully");
		Thread.sleep(1000);

		// certificate1
		dp.get_certificate_radio_btn().click();
		Thread.sleep(1000);
		WebElement dropdown28 = dp.get_certificate_type_dropdown();
		Select select28 = new Select(dropdown28);
		select28.selectByVisibleText("Authorized Retailer");
		log.info("Authorized Retailer certificate is selected");

		Thread.sleep(1000);
		dp.get_certificate_name().sendKeys("certificate2");
		Thread.sleep(1000);
		dp.get_certificate_number().sendKeys("987454158");
		Thread.sleep(1000);

		// date pick button
		driver.findElement(By.cssSelector("#upload > form > div:nth-child(4) > div.right-pane > div > span > button"))
				.click();
		Thread.sleep(2000);
		// month selection button
		driver.findElement(By.xpath("//th[@colspan='6']/button")).click();
		// year selection button
		driver.findElement(By.xpath("//th[@colspan='1']/button")).click();
		List<WebElement> years = driver.findElements(By.xpath("//button[@type='button' and @class='btn btn-default']"));
		for (WebElement year : years) {
			String selection1 = year.getText();

			if (selection1.contains(prop.getProperty("Expiry_year"))) {
				year.click();
				break;
			}
		}

		List<WebElement> months = driver
				.findElements(By.xpath("//button[@type='button' and @class='btn btn-default']"));
		for (WebElement month : months) {
			String selection2 = month.getText();

			if (selection2.contains(prop.getProperty("Expiry_month"))) {
				month.click();
				break;
			}
		}

		List<WebElement> days = driver
				.findElements(By.xpath("//button[@type='button' and @class='btn btn-default btn-sm']"));
		for (WebElement day : days) {
			String selection3 = day.getText();

			if (selection3.contains(prop.getProperty("Expiry_day"))) {
				day.click();
				break;
			}
		}

		Robot rocrf = new Robot();
		dp.get_upload_btn().click();
		Thread.sleep(2000);

		StringSelection stringSelection39 = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection39, null);
		Thread.sleep(1000);

		rocrf.keyPress(KeyEvent.VK_CONTROL);
		rocrf.keyPress(KeyEvent.VK_V);

		rocrf.keyRelease(KeyEvent.VK_CONTROL);
		rocrf.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		rocrf.keyPress(KeyEvent.VK_ENTER);
		rocrf.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		dp.get_submit_btn().click();
		log.info("Authorized Retailer certificate uploaded successfuly");
		Thread.sleep(3000);

		// certificate2
		dp.get_certificate_radio_btn().click();
		Thread.sleep(1000);
		WebElement dropdown42 = dp.get_certificate_type_dropdown();
		Select select42 = new Select(dropdown42);
		select42.selectByVisibleText("MSME Certificate");
		log.info("MSME Certificate selected from the dropdown");
		Thread.sleep(1000);
		dp.get_certificate_name().sendKeys("certificate3");
		Thread.sleep(1000);
		dp.get_certificate_number().sendKeys("987454158");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#upload > form > div:nth-child(4) > div.right-pane > div > span > button"))
				.click();
		Thread.sleep(1000);

		for (int i = 1; i < 3; i++) {
			driver.findElement(By.cssSelector(
					"#upload > form > div:nth-child(4) > div.right-pane > div > div > ul > li:nth-child(1) > div > div > div > table > thead > tr:nth-child(1) > th:nth-child(3) > button"))
					.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm active']")).click();
		Thread.sleep(2000);

		Robot ro = new Robot();
		dp.get_upload_btn().click();
		Thread.sleep(2000);

		StringSelection stringSelection40 = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection40, null);
		Thread.sleep(1000);

		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);

		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		dp.get_submit_btn().click();
		log.info("MSME Certificate uploaded successfully");
		Thread.sleep(3000);

		// send for approval
		dp.get_request_for_approval_btn().click();
		Thread.sleep(2000);

		// confirmation
		dp.get_confirm_request_btn().click();
		log.info("seller successfully completed company profile and sent for approval");
	}
}
