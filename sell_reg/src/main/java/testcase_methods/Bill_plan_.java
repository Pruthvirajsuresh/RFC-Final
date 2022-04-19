package testcase_methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import page_objects.Bill_plan_page;
import resource.Base;

public class Bill_plan_ extends Base {

	private static Logger log = LogManager.getLogger(Bill_plan_.class.getName());

	public static void bill_plan_validation() {

		Bill_plan_page bp = new Bill_plan_page(driver);

		bp.get_bill_plan_tab().click();
		log.info("clicked on bill plan tab");

		bp.get_confirm_btn().click();
		log.info("accepted the bill plan");

	}

}
