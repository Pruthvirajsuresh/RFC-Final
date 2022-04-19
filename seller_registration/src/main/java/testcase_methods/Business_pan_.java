package testcase_methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import Pageobjects.business_pan_page;
import resource.Base;

public class Business_pan_ extends Base {

	private static Logger log = LogManager.getLogger(Business_pan_.class.getName());

	public static void busniness_pan_validation() {

		business_pan_page obj = new business_pan_page(driver);

		obj.get_bus_pan_no().sendKeys(prop.getProperty("business_pan"));

		obj.get_bus_pan_name().sendKeys(prop.getProperty("business_pan_name"));

		boolean b1 = obj.get_bus_pan_checkbox().isSelected();
		if (b1 == true) {
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
			obj.get_bus_pan_checkbox().click();
			log.info("clicked on checkbox");
		}

		boolean b3 = obj.get_bus_pan_vrfy_btn().isEnabled();

		if (b3 == true) {
			Assert.assertTrue(true);
			log.info("button is enabled");
			obj.get_bus_pan_vrfy_btn();
		} else {
			Assert.assertTrue(false);
		}

	}

}
