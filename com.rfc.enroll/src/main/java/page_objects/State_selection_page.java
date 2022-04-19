package page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class State_selection_page extends Base {

	public WebDriver driver;

	public State_selection_page(WebDriver driver) {
		this.driver = driver;
	}

	By Caution_message = By.xpath("//div[@class='new-enrollment']/form/div[2]");

	By State_radio_btns = By.xpath("//div[@class='radio-button']");

	By submit_btn = By.cssSelector(
			"#bd > div > div > div > rfc-component > div > div > new-enrollment-component > div > form > div.text-center > button");

	By Disabled_state = By.xpath("//input[@disabled='disabled']");

	public WebElement get_Caution_message() {
		return driver.findElement(Caution_message);

	}

	public List<WebElement> get_State_radio_btns() {
		return driver.findElements(State_radio_btns);

	}

	public WebElement get_submit_btn() {
		return driver.findElement(submit_btn);

	}

	public WebElement get_Disabled_state() {
		return driver.findElement(Disabled_state);

	}
}
