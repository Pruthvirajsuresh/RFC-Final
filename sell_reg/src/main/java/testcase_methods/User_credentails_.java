package testcase_methods;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import page_objects.User_cred_page;
import resource.Base;

public class User_credentails_ extends Base {

	private static Logger log = LogManager.getLogger(User_credentails_.class.getName());

	public static void user_credentails() throws IOException, InterruptedException {

		User_cred_page uc = new User_cred_page(driver);

		uc.get_user_id().sendKeys(prop.getProperty("User_id"));
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
			Thread.sleep(2000);
			log.error("please check the password entered");
			screenshot("user_credentails");
		}

		uc.click_checkbox().click();
		log.info("clicked on checkbox");
		Thread.sleep(2000);

		uc.click_create_act_btn().click();
		log.info("seller account created successfully");

	}

}
