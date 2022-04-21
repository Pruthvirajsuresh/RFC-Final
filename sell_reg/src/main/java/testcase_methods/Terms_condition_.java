package testcase_methods;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;

import page_objects.Landing_page;
import resource.Base;

public class Terms_condition_ extends Base {

	private static Logger log = LogManager.getLogger(Terms_condition_.class.getName());

	public static void terms_conditions() throws InterruptedException, IOException {

		Landing_page p = new Landing_page(driver);
		p.Terms_conditions().click();
		log.info("clicked on terms and conditions button");

	}

	public static void checkbox() throws InterruptedException {

		// checkbox
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("$('#accept-tnc > label')[0].click()");
		log.info("clicked on concern checkbox");

	}

}
