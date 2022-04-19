package page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class RFC_selection_page extends Base {

	public WebDriver driver;

	public RFC_selection_page(WebDriver driver) {
		this.driver = driver;
	}

	By Caution_message = By.xpath("//div[@class='rfc-selection']/form/div[1]");

	By RFC_check_boxs = By.xpath("//div[@class='clearfix form-group ng-scope']");

	By FAQ1 = By.xpath("//div[@id='accordion']/div//div[@id='headingOne']");

	By FAQ2 = By.xpath("//div[@id='accordion']/div//div[@id='headingTwo']");

	By FSSAI_checkbox = By.cssSelector(
			"#bd > div > div > div > rfc-component > div > div > show-enrollment-component > div > div.tabs > div > select-rfc > div > div.col-md-8 > div > form > div.clearfix.form-group > div > label");

	By submit_btn = By.xpath("//div[@class='text-center section_gap']/button");

	public WebElement get_Caution_message() {
		return driver.findElement(Caution_message);

	}

	public List<WebElement> get_RFC_check_boxs() {
		return driver.findElements(RFC_check_boxs);

	}

	public WebElement get_FAQ1() {
		return driver.findElement(FAQ1);

	}

	public WebElement get_FAQ2() {
		return driver.findElement(FAQ2);

	}

	public WebElement get_FSSAI_checkbox() {
		return driver.findElement(FSSAI_checkbox);

	}

	public WebElement get_submit_btn() {
		return driver.findElement(submit_btn);

	}

}
