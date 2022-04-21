package testcase_methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import page_objects.Close_account_page;
import resource.Base;

public class Close_account_ extends Base {

	private static Logger log = LogManager.getLogger(Close_account_.class.getName());

	public static void account_close() throws InterruptedException {

		Close_account_page ca = new Close_account_page(driver);

		ca.get_My_profile_tab().click();
		log.info("clicked on my profile tab");

		ca.get_Personal_settings_tab().click();
		log.info("clicked on personal settings tab");

		ca.get_close_account_tab().click();
		log.info("clicked on close account tab");
		Thread.sleep(2000);

		ca.get_get_otp_btn().click();
		log.info("requested for otp");

		ca.get_enter_otp_field().sendKeys("123456");
		log.info("otp entered successfully");

		ca.get_vrfy_otp_btn().click();
		log.info("otp verified successfully");

		ca.get_close_acc_btn().click();
		log.info("clicked on close account button");

		ca.get_confirm_btn().click();
		log.info(prop.getProperty("User_id") + " IS CLOSED...!!");

	}

}
