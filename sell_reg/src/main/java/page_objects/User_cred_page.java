package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class User_cred_page extends Base {

	public WebDriver driver;

	By user_id = By.xpath("//input[@name='user_id']");
	By pwd = By.xpath("//input[@name='password']");
	By pwd_confirm = By.xpath("//input[@name='password_confirm']");
	By con_checkbox = By.cssSelector("form > div.agree_primary_reg.checkbox-wrapper > label");
	By acnt_btn = By.xpath("//button[@type='submit']");
	By pwdmismatch = By.cssSelector(
			"#accordiongroup-34-840-panel > div > div > render-section > user-credentials > form > div.password-confirm.clearfix.form-group > div.right-pane > label > span");

	By user_exist_txt = By.xpath("//span[@ng-if='flags.user_id_exists' and @class='ng-scope']");

	public User_cred_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_user_id() {
		return driver.findElement(user_id);
	}

	public WebElement get_new_pwd() {
		return driver.findElement(pwd);
	}

	public WebElement vrfy_new_pwd() {
		return driver.findElement(pwd_confirm);
	}

	public WebElement click_checkbox() {
		return driver.findElement(con_checkbox);
	}

	public WebElement click_create_act_btn() {
		return driver.findElement(acnt_btn);
	}

	public WebElement pwd_error_txt() {
		return driver.findElement(pwdmismatch);
	}

	public WebElement get_user_exist_txt() {
		return driver.findElement(user_exist_txt);
	}

}
