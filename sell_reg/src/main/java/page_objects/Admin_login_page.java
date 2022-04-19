package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Admin_login_page extends Base {

	public WebDriver driver;

	By admin_user_name = By.xpath("//input[@name='username']");
	By admin_password = By.xpath("//input[@name='password']");
	By admin_login_btn = By.cssSelector("#content-inner > form > input[type=submit]:nth-child(6)");
	By main_text = By.xpath("//div[@class='menu']/p");
	By forgot_pwd_link = By.linkText("Forgot Password");
	By Generate_pwd_link = By.linkText("Generate Password");

	public Admin_login_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_admin_user_name() {
		return driver.findElement(admin_user_name);
	}

	public WebElement get_admin_password() {
		return driver.findElement(admin_password);
	}

	public WebElement get_admin_login_btn() {
		return driver.findElement(admin_login_btn);
	}

	public WebElement get_main_text() {
		return driver.findElement(main_text);
	}

	public WebElement get_forgot_pwd_text() {
		return driver.findElement(forgot_pwd_link);
	}

	public WebElement get_Generate_pwd_link() {
		return driver.findElement(Generate_pwd_link);
	}
}
