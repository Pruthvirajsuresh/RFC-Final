package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Mobile_email_page extends Base {

	public WebDriver driver;

	By mobile = By.xpath("//input[@name='mobile']");
	By mobile_vrfy = By.xpath("//input[@name='mobile_confirm']");
	By otp_btn = By.xpath("//button[@class='send_otp btn btn-secondary ng-scope']");
	By enter_otp = By.xpath("//input[@id='mobileotp']");
	By vrfy_otp_btn = By.xpath(
			"//button[@ng-disabled='(!flags.otp_sent) || (!mobile_info.mobile_verify_otp) || (mobile_info.mobile!=mobile_info.verify_mobile)']");
	By nxt_button = By.xpath("//button[@class='btn btn-primary ng-scope']");

	By email = By.xpath("//input[@name='email_id']");
	By vrfy_email = By.xpath("//input[@name='email_id_confirm']");
	By send_otp = By.xpath(
			"//button[@class='send_otp btn btn-secondary ng-scope' and @ng-disabled=\"(email_info.email!=email_info.verify_email) || (flags.otp_sent) || (email_info.email=='') || (!email_info.email)\"]");
	By enter_otp_mail = By.xpath("//input[@id='emailotp']");
	By vrfy_otp_button = By.xpath(
			"//button[@class='send_otp btn btn-secondary ng-scope' and @ng-disabled='(!flags.otp_sent) || (!email_info.email_verify_otp)']");
	By nxt_btn = By.xpath(
			"//button[@class='btn btn-primary ng-scope' and @ng-click='handleStageChange({stageCode: regStage.codeName})']");

	public Mobile_email_page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement get_mobile() {
		return driver.findElement(mobile);
	}

	public WebElement get_mobile_vrfy() {
		return driver.findElement(mobile_vrfy);
	}

	public WebElement get_otp_btn() {
		return driver.findElement(otp_btn);
	}

	public WebElement otp_enter() {
		return driver.findElement(enter_otp);
	}

	public WebElement click_otp_btn() {
		return driver.findElement(vrfy_otp_btn);
	}

	public WebElement nxt_btn() {
		return driver.findElement(nxt_button);
	}

	public WebElement enter_email() {
		return driver.findElement(email);
	}

	public WebElement mail_vrfy() {
		return driver.findElement(vrfy_email);
	}

	public WebElement mail_otp_btn() {
		return driver.findElement(send_otp);
	}

	public WebElement enter_otp_mail() {
		return driver.findElement(enter_otp_mail);
	}

	public WebElement vrfy_otp_mail_button() {
		return driver.findElement(vrfy_otp_button);
	}

	public WebElement mail_nxt_btn() {
		return driver.findElement(nxt_btn);
	}

}
