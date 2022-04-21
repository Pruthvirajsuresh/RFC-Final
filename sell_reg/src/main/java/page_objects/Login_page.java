package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Login_page extends Base {

	public WebDriver driver;

	public Login_page(WebDriver driver) {
		this.driver = driver;
	}

	By seller_name = By.xpath("//input[@id='user_user_id']");
	By seller_password = By.xpath("//input[@id='user_password']");
	By login_button = By.xpath("//input[@name='commit' and @value='Submit']");
	By my_profile_tab = By.cssSelector("#nav-menu- > ul > li:nth-child(7) > a");
	By company_profile_tab = By.linkText("Company Profile");

	public WebElement get_user_name() {
		return driver.findElement(seller_name);

	}

	public WebElement get_user_pwd() {
		return driver.findElement(seller_password);

	}

	public WebElement get_login_btn() {
		return driver.findElement(login_button);

	}

	public WebElement get_my_profile_tab() {
		return driver.findElement(my_profile_tab);

	}

	public WebElement get_company_profile_tab() {
		return driver.findElement(company_profile_tab);

	}

}
