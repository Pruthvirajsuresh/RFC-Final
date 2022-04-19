package testcase_methods;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import page_objects.Login_page;
import resource.Base;

public class User_login_ extends Base {

	private static Logger log = LogManager.getLogger(User_login_.class.getName());

	public static void login_screen() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url2"));

		Login_page lp = new Login_page(driver);

		lp.get_user_name().sendKeys(prop.getProperty("User_id"));
		log.info("user id entered");

		lp.get_user_pwd().sendKeys("Ril@1234");
		log.info("password enetered");

		lp.get_login_btn().click();
		log.info("clicked on login button");

		lp.get_my_profile_tab().click();
		log.info("clicked on my profile");

		lp.get_company_profile_tab().click();
		log.info("clicked on company profile");

	}

}
