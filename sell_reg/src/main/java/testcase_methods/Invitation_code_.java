package testcase_methods;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import page_objects.Invitation_page;
import resource.Base;

public class Invitation_code_ extends Base {

	private static Logger log = LogManager.getLogger(Invitation_code_.class.getName());

	public static void validate_t_c() throws IOException {

		Invitation_page ip = new Invitation_page(driver);
		String b = ip.Validate_TC().getText();
		Assert.assertEquals(b, "Review Terms & Conditions");
		log.info("terms and condition reviewed successfully");

	}

	public static void enter_code() throws InterruptedException, IOException {
		Invitation_page ip = new Invitation_page(driver);
		ip.invitation().sendKeys(prop.getProperty("invitation_code"));
		log.info("invitation code entered successfully");

	}

	public static void submit_code() throws InterruptedException, IOException {

		Invitation_page ip = new Invitation_page(driver);
		// submit button
		ip.submit().click();
		log.info("invitation code validated successfully");

	}

}
