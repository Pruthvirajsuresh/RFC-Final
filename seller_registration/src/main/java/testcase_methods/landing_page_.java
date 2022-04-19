package testcase_methods;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import Pageobjects.landing_page;
import resource.Base;

public class landing_page_ extends Base {

	private static Logger log = LogManager.getLogger(landing_page_.class.getName());

	public static void title_validation() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Seller Registration");
		log.info("title is validated successfully");

	}

	public static void logo_validations() throws InterruptedException, IOException {

		landing_page p = new landing_page(driver);
		boolean b = p.quote().isDisplayed();
		Assert.assertTrue(b);
		log.info("logo validated successfully");

	}

}
