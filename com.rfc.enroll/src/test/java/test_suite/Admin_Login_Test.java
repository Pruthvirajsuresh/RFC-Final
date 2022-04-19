package test_suite;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.Admin_Login_page;
import resource.Base;

public class Admin_Login_Test extends Base {

	@Test
	public void admin_login() throws InterruptedException, IOException {

		initiatedriver();

		driver.get(prop.getProperty("Admin_url"));
		Thread.sleep(2000);

		Admin_Login_page al = new Admin_Login_page(driver);

		// validate the heading
		String displayed_text = al.get_main_text().getText();
		Assert.assertEquals(displayed_text, "Welcome to Reliance Jio");
		log.info("main text is validated");

		// validate for got password link
		boolean b1 = al.get_forgot_pwd_text().isDisplayed();
		if (b1 == true) {

			log.info("forgot password is displayed");
		} else {

			log.info("forgot password is not displayed");
		}

		// validate generate password link
		boolean b2 = al.get_Generate_pwd_link().isDisplayed();
		if (b2 == true) {

			log.info("generate password is displayed");
		} else {

			log.info("generate password is not displayed");
		}

		// login credentials
		al.get_admin_user_name().sendKeys(prop.getProperty("admin_username"));
		log.info("entered user name is " + al.get_admin_user_name().getAttribute("value"));

		al.get_admin_password().sendKeys(prop.getProperty("admin_password"));
		log.info("entered password is " + al.get_admin_password().getAttribute("value"));

		al.get_admin_login_btn().click();
		log.info("Admin login successful");
		log.info("===============================================================");
		Thread.sleep(3000);
	}

}
