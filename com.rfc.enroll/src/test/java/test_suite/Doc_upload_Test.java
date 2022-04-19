package test_suite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page_objects.Upload_doc_page;
import resource.Base;

public class Doc_upload_Test extends Base {

	@Test
	public void doc_upload() throws InterruptedException, AWTException, IOException {

		Upload_doc_page ud = new Upload_doc_page(driver);

		// upload digital signature
		Robot robot = new Robot();

		ud.get_Digital_signature().click();
		log.info("clicked one upload digital signature");

		Thread.sleep(2000);

		StringSelection stringSelection = new StringSelection(
				"/home/infibeam/eclipse-workspace/com.rfc.enroll/digitalsignature.png");
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

		log.info("Digital signature uploaded successfully");

		// upload GST REG 06 certificate
		Robot robot1 = new Robot();

		ud.get_GST_REG_06_cer().click();
		log.info("clicked one upload GST-REG-06 certificate");

		Thread.sleep(2000);

		StringSelection stringSelection1 = new StringSelection(
				"/home/infibeam/eclipse-workspace/com.rfc.enroll/gst-reg-06.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
		Thread.sleep(1000);

		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);

		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		log.info("GST-REG-06 Certificate uploaded successfully");

		// upload FSSAI document

		Robot robot2 = new Robot();

		ud.get_FSSAI_cer().click();
		log.info("clicked one upload FSSAI Document");

		Thread.sleep(2000);

		StringSelection stringSelection2 = new StringSelection(
				"/home/infibeam/eclipse-workspace/com.rfc.enroll/PROFILE-converted (1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection2, null);
		Thread.sleep(1000);

		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);

		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		log.info("FSSAI Document uploaded successfully");

		ud.get_Submit_btn().click();
		log.info("RFC Enrollment submitted successfully");
		Thread.sleep(2000);
		screenshot("doc_upload");

	}

	@AfterMethod
	public void teardown() throws InterruptedException {

		driver.close();
		log.info("Browser closed");
		log.info("============================================================");

	}
}
