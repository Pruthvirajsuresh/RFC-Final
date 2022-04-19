package testcase_methods;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.login_page;
import resource.Base;

public class User_login_ extends Base {

	private static Logger log = LogManager.getLogger(User_credential_.class.getName());

	public static void login_screen() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/infibeam/Downloads/Selenium_setup/chromedriver");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url2"));
		Thread.sleep(3000);

		String sel_id = User_credential_.get_seller_id();
		System.out.println(sel_id);

		login_page lp = new login_page(driver);

		lp.get_user_name().sendKeys(sel_id);
		log.info("user id entered");

		lp.get_user_pwd().sendKeys("Ril@1234");
		log.info("password enetered");

		lp.get_login_btn().click();
		log.info("clicked on login button");

	}

}
