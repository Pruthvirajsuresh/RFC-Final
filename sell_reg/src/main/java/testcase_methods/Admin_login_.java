package testcase_methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import page_objects.Admin_login_page;
import resource.Base;

public class Admin_login_ extends Base {

	private static Logger log = LogManager.getLogger(Admin_login_.class.getName());

	public static void admin_login() throws InterruptedException {

		driver.get(prop.getProperty("url3"));
		Thread.sleep(2000);

		Admin_login_page al = new Admin_login_page(driver);

		String displayed_text = al.get_main_text().getText();
		Assert.assertEquals(displayed_text, "Welcome to Reliance Jio");
		log.info("main text is validated");

		boolean b1 = al.get_forgot_pwd_text().isDisplayed();
		if (b1 == true) {

			log.info("forgot password is displayed");
		} else {

			log.info("forgot password is not displayed");
		}

		boolean b2 = al.get_Generate_pwd_link().isDisplayed();
		if (b2 == true) {

			log.info("generate password is displayed");
		} else {

			log.info("generate password is not displayed");
		}

		al.get_admin_user_name().sendKeys(prop.getProperty("admin_username"));
		log.info("entered user name is " + al.get_admin_user_name().getAttribute("value"));

		al.get_admin_password().sendKeys(prop.getProperty("admin_password"));
		log.info("entered password is " + al.get_admin_password().getAttribute("value"));

		al.get_admin_login_btn().click();
		log.info("Admin login successful");
	}

}
