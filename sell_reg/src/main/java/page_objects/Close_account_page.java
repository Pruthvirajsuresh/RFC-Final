package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Close_account_page extends Base {

	public WebDriver driver;

	By My_profile_tab = By.cssSelector("#nav-menu- > ul > li:nth-child(7) > a");
	By Personal_settings_tab = By
			.xpath("//a[@href='https://sit-eks-userreg.ril.smebazaar.ooo/seller_profile/personal_settings']");
	By close_account_tab = By.xpath(
			"//div[@class='org-links col-md-3 navbar-collapse collapse']/render-profile-section/personal-settings-section/a[5]");
	By get_otp_btn = By.xpath("//button[@class='btn btn-primary ng-scope ng-binding']");
	By enter_otp_field = By.xpath("//div[@class='popup-content']/div[2]/div/div/div[2]/input");
	By vrfy_otp_btn = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > close-account-tab > div > otp-verify > div > div > div.popup-message > div > div:nth-child(1) > div:nth-child(3) > button");
	By close_acc_btn = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > close-account-tab > div > button");

	By confirm_btn = By.xpath("//div[@class='gem-popup account-closure-popup ng-scope']/div/div/div/a[1]");

	public Close_account_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_My_profile_tab() {
		return driver.findElement(My_profile_tab);

	}

	public WebElement get_Personal_settings_tab() {
		return driver.findElement(Personal_settings_tab);

	}

	public WebElement get_close_account_tab() {
		return driver.findElement(close_account_tab);

	}

	public WebElement get_get_otp_btn() {
		return driver.findElement(get_otp_btn);

	}

	public WebElement get_enter_otp_field() {
		return driver.findElement(enter_otp_field);

	}

	public WebElement get_vrfy_otp_btn() {
		return driver.findElement(vrfy_otp_btn);

	}

	public WebElement get_close_acc_btn() {
		return driver.findElement(close_acc_btn);

	}

	public WebElement get_confirm_btn() {
		return driver.findElement(confirm_btn);

	}

}
