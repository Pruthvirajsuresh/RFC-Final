package testcase_methods;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Pageobjects.personaldetails_page;
import resource.Base;

public class personal_pan_ extends Base {

	private static Logger log = LogManager.getLogger(personal_pan_.class.getName());

	public static void per_pan_number() throws InterruptedException, IOException {

		personaldetails_page pd = new personaldetails_page(driver);

		pd.get_per_pan().sendKeys(prop.getProperty("personal_pan"));

		String pan_num = pd.get_per_pan().getAttribute("value");
		System.out.println(pan_num);
		String final_num = pan_num.substring(3, 4);
		System.out.println(final_num);

		log.info("pan number entered successfully");

		pd.get_per_pan_name().sendKeys(prop.getProperty("personal_pan_name"));
		log.info("pan name entered succesdfuly");

		if (final_num.equalsIgnoreCase("P")) {
			// Assert.assertTrue(true, final_num);
			log.info("this is personal pan");
		} else {
			screenshot("per_pan_number");
			// Assert.assertTrue(false, final_num);
			log.error("this is not personal pan");

		}

		// DOB
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='day']"));
		Select select1 = new Select(dropdown1);
		select1.selectByVisibleText("11");

		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='month']"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("December");

		WebElement dropdown3 = driver.findElement(By.xpath("//select[@name='year']"));
		Select select3 = new Select(dropdown3);
		select3.selectByVisibleText("1998");
		log.info("DOB entered successfully");

		pd.click_checkbox().click();
		log.info("clicked on checkbox");

		pd.get_pan_vrfy_btn().click();
		log.info("clicked on verify button");

		Thread.sleep(1000);
		screenshot("per_pan_number");

	}

}
