package testcase_methods;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import page_objects.Company_details_page;
import resource.Base;

public class Company_details_ extends Base {

	private static Logger log = LogManager.getLogger(Company_details_.class.getName());

	public static void cmpny_verify() throws IOException {

		Company_details_page cd = new Company_details_page(driver);

		cd.get_company_details_tab().click();
		log.info("clicked on company details tab");

		boolean btn1 = cd.get_company_vrfy_btn().isEnabled();

		if (btn1 == true) {

			Assert.assertTrue(false);
			screenshot("cmpny_verify");
			log.error("submit button is enabled before entereing the data");
		} else {

			cd.get_business_type().click();
			cd.get_option().click();
			log.info("selected seller Type");

			cd.get_anual_turnover().sendKeys(prop.getProperty("anual_turnover"));
			log.info("annual turnover entered");
		}

		cd.get_company_vrfy_btn().click();
		log.info("company details verified");
	}

}
