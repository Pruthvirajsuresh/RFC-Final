package testcase_methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import page_objects.Cin_validation_page;
import resource.Base;

public class Cin_verify_ extends Base {

	private static Logger log = LogManager.getLogger(Cin_verify_.class.getName());

	public static void cin_verification() throws InterruptedException {

		Cin_validation_page cv = new Cin_validation_page(driver);
		cv.get_cin_tab().click();
		log.info("clicked on cin validation tab");

		cv.get_cin_num().sendKeys(prop.getProperty("CIN"));
		boolean c1 = cv.get_cin_vrfy_btn().isEnabled();
		if (c1 == true)

		{

			Assert.assertTrue(true);
			cv.get_cin_vrfy_btn().click();
			log.info("Cin number verified successfully");
		} else

		{

			Assert.assertTrue(false);
			log.error("please enter CIN number");
		}

		Thread.sleep(5000);
	}
}
