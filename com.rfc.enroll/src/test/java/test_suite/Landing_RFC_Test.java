package test_suite;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page_objects.Landing_page;
import resource.Base;

public class Landing_RFC_Test extends Base {

	@BeforeClass
	public void setup() throws IOException, InterruptedException {

		// initiate browser
		driver = initiatedriver();
		log.info("Browser initiated successfully");

		driver.get(prop.getProperty("url"));
		log.info("landed on Seller home page");

	}

	@Test
	public void log_in_seller() throws IOException, InterruptedException {
		Landing_page lp = new Landing_page(driver);

		lp.get_user_name().sendKeys(prop.getProperty("User_id"));
		log.info("user id entered");

		lp.get_user_pwd().sendKeys("Ril@1234");
		log.info("password enetered");

		lp.get_login_btn().click();
		log.info("clicked on login button");

		lp.get_Services_tab().click();
		log.info("clicked on services");

		lp.get_JioMart_fulfilment_tab().click();
		log.info("clicked on JioMart_fulfilment_tab");
		Thread.sleep(2000);

		String url = driver.getCurrentUrl();

		if (url.equalsIgnoreCase("https://sit-eks-userreg.ril.smebazaar.ooo/rfc/register")) {

			lp.get_referal_code_textfield().sendKeys(prop.getProperty("Referal_code"));
			log.info("Referal code entered successfully");

			lp.get_submit_btn().click();
			log.info("clicked on submit button");

			Thread.sleep(1000);

			String loginStatus = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.elementToBeClickable(lp.get_error_message())).getText();
			if (loginStatus.contains("Invalid referral code")) {
				System.out.println("if executed");
				log.error("Invalid referral code");
				Assert.assertTrue(false);

			} else {
				System.out.println("else executed");
				lp.get_Add_rfc_btn().click();
				log.info("Clicked on Add RFC button after entering referal code");

			}

		} else if (url.equalsIgnoreCase("https://sit-eks-userreg.ril.smebazaar.ooo/rfc/enroll")) {

			Thread.sleep(1000);
			lp.get_Add_rfc_btn2().click();
			log.info("clicked on Add RFC button after clicking on JioMart fulfilment tab");

		} else {

			Assert.assertTrue(false);

		}

		screenshot("log_in_seller");
	}

}
