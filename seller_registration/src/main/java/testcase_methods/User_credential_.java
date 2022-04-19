package testcase_methods;

import java.io.IOException;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import Pageobjects.user_cred_page;
import resource.Base;

public class User_credential_ extends Base {

	private static Logger log = LogManager.getLogger(User_credential_.class.getName());

	public static String get_seller_id() {
		Random obj = new Random();
		long seller = obj.nextInt(1000);
		String sel_name = ("seller" + seller);
		log.info(sel_name);
		return sel_name;
	}

	public static void user_credentails() throws IOException, InterruptedException {

		user_cred_page uc = new user_cred_page(driver);
		String sel_name = get_seller_id();
		uc.get_user_id().sendKeys(sel_name);
		System.out.println(sel_name);
		log.info("user id entered");

		uc.get_new_pwd().sendKeys(prop.getProperty("user_pwd"));
		String pwd1 = uc.get_new_pwd().getAttribute("value");
		System.out.println(pwd1);

		uc.vrfy_new_pwd().sendKeys(prop.getProperty("confirm_pwd"));
		String pwd2 = uc.vrfy_new_pwd().getAttribute("value");
		System.out.println(pwd2);

		if (pwd1.equals(pwd2)) {
			Assert.assertTrue(true);
			log.info("password created successfully");
		} else {
			Thread.sleep(1000);
			log.error("please check the password entered");
			screenshot("user_credentails");
		}

		uc.click_checkbox().click();
		log.info("clicked on checkbox");

		uc.click_create_act_btn().click();
		log.info("seller account created successfully");

	}

}
