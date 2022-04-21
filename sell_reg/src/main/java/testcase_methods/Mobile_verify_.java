package testcase_methods;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import page_objects.Mobile_email_page;
import resource.Base;

public class Mobile_verify_ extends Base {

	private static Logger log = LogManager.getLogger(Mobile_verify_.class.getName());

	public static void enter_mob_num() throws InterruptedException, IOException {

		Mobile_email_page me = new Mobile_email_page(driver);

		me.get_mobile().sendKeys(prop.getProperty("mobile_num"));
		String mobile1 = me.get_mobile().getAttribute("value");
		System.out.println(mobile1);
		log.info("mobile number entered");

		me.get_mobile_vrfy().sendKeys(prop.getProperty("mobile_num_verify"));
		String mobile2 = me.get_mobile().getAttribute("value");
		System.out.println(mobile2);
		log.info("mobile number re-entered");

		if (mobile1.equals(mobile2)) {

			// Assert.assertTrue(true);
			me.get_otp_btn().click();
			log.info("clicked on send OTP button");
		} else {
			log.info("please verify the mobile number entered");
			screenshot("enter_mob_num");
		}

		Thread.sleep(1000);
		me.otp_enter().sendKeys("123456");
		log.info("OTP entered successfully");

		me.click_otp_btn().click();
		log.info("OTP verified successfully");

		Thread.sleep(2000);
		screenshot("enter_mob_num");

		me.nxt_btn().click();

	}

}
