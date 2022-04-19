package testcase_methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import page_objects.My_catagory_page;
import resource.Base;

public class My_catagories_ extends Base {

	private static Logger log = LogManager.getLogger(My_catagories_.class.getName());

	public static void my_catagories() throws InterruptedException {

		My_catagory_page mc = new My_catagory_page(driver);

		mc.get_my_catgory_tab().click();
		log.info("clicked on my catagories tab");

		mc.get_Add_new_btn().click();

		boolean final_btn = mc.get_Add_catagory_btn().isEnabled();
		if (final_btn == true) {
			Assert.assertTrue(false);
			log.error("add catagory button is " + final_btn);
		} else {

			Assert.assertTrue(true);
		}

		mc.get_catagory_text_field().sendKeys(prop.getProperty("catagory"));
		Thread.sleep(2000);
		mc.get_catagory_text_field().sendKeys(Keys.ENTER);
		log.info("catagory name entered successfully");

		boolean final_btn2 = mc.get_Add_catagory_btn().isEnabled();
		if (final_btn2 == false) {
			Assert.assertTrue(false);
			log.error("add catagory button is " + final_btn2);
		} else {

			Assert.assertTrue(true);
			mc.get_Add_catagory_btn().click();
			log.info("catagory added successfully");
		}

	}

}
