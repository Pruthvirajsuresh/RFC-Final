package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Landing_page extends Base {

	public WebDriver driver;

	public Landing_page(WebDriver driver) {
		this.driver = driver;
	}

	By seller_name = By.xpath("//input[@id='user_user_id']");
	By seller_password = By.xpath("//input[@id='user_password']");
	By login_button = By.xpath("//input[@name='commit' and @value='Submit']");
	By Services_tab = By.cssSelector("#nav-menu- > ul > li:nth-child(8) > a");
	By JioMart_fulfilment_tab = By
			.cssSelector("#nav-menu- > ul > li.dropdown.ang-dropdown.open > ul > li:nth-child(1) > a");

	By referal_code_textfield = By.xpath("//div[@class='register-rfc']/form/div/div/input");
	By submit_btn = By.xpath("//div[@class='right-pane']/button");
	By Add_rfc_btn = By
			.cssSelector("#bd > div > div > div > rfc-component > div > div > enrollment-component > div > button");

	By Add_rfc_btn2 = By.cssSelector(
			"#bd > div > div > div > rfc-component > div > div > enrollment-component > div > div:nth-child(2) > div.right-actions > button");

	By error_message = By.xpath("//body[@class='user-reg-app signed-in']");

	public WebElement get_user_name() {
		return driver.findElement(seller_name);

	}

	public WebElement get_user_pwd() {
		return driver.findElement(seller_password);

	}

	public WebElement get_login_btn() {
		return driver.findElement(login_button);

	}

	public WebElement get_Services_tab() {
		return driver.findElement(Services_tab);

	}

	public WebElement get_JioMart_fulfilment_tab() {
		return driver.findElement(JioMart_fulfilment_tab);

	}

	public WebElement get_referal_code_textfield() {
		return driver.findElement(referal_code_textfield);

	}

	public WebElement get_submit_btn() {
		return driver.findElement(submit_btn);

	}

	public WebElement get_Add_rfc_btn() {
		return driver.findElement(Add_rfc_btn);

	}

	public WebElement get_Add_rfc_btn2() {
		return driver.findElement(Add_rfc_btn2);

	}

	public WebElement get_error_message() {
		return driver.findElement(error_message);

	}

}
