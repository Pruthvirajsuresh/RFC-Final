package testcase_methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import page_objects.Personaldetails_page;
import resource.Base;

public class Org_details_ extends Base {

	private static Logger log = LogManager.getLogger(Org_details_.class.getName());

	public static void org_details() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='constitution_type']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Company");
		log.info("org type is company");

		Personaldetails_page pd = new Personaldetails_page(driver);

		pd.get_org_name().sendKeys(prop.getProperty("company_name"));
		log.info("org name entered successfully");

		pd.get_nxt_btn().click();
		log.info("org details verified successfully");

	}

}
