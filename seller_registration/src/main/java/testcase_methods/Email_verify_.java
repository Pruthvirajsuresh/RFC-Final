package testcase_methods;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Pageobjects.mobile_email_page;
import resource.Base;

public class Email_verify_ extends Base {

	private static Logger log = LogManager.getLogger(Email_verify_.class.getName());

	public static void email_vrfy() throws InterruptedException, IOException {

		mobile_email_page me = new mobile_email_page(driver);

		me.enter_email().sendKeys(prop.getProperty("email_id"));
		log.info("email id entered");

		Thread.sleep(2000);
		me.mail_vrfy().sendKeys(prop.getProperty("email_id_vrfy"));
		log.info("email id re-entered");
		Thread.sleep(2000);

		me.mail_otp_btn().click();

		Thread.sleep(2000);
		me.enter_otp_mail().sendKeys("123456");
		log.info("OTP entered successfully");

		me.vrfy_otp_mail_button().click();
		log.info("OTP verified successfully");

		Thread.sleep(2000);
		screenshot("email_vrfy");

		me.mail_nxt_btn().click();

	}

}
