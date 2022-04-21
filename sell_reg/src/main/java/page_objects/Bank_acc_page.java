package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Bank_acc_page extends Base {

	public WebDriver driver;

	By bank_details_tab = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-links.col-md-3.navbar-collapse.collapse > render-profile-section > company-profile-section > a:nth-child(6)");
	By Account_type_dropdown = By.xpath("//select[@name='accountType']");
	By account_option = By.xpath("//option[@value='Saving']");
	By ifsc_code = By.xpath("//input[@id='ifsc_code']");
	By Account_no = By.xpath("//input[@id='bank_account_no']");
	By verify_acc_no = By.xpath("//input[@id='verify_bank_account_no']");
	By acc_holder_name = By.xpath("//input[@id='account_holder_name']");
	By primary_acc_checkbox = By.xpath("//input[@id='is_primary_account']");
	By validate_acc_btn = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > seller-bank-details-tab > div.bank_account_details > form > button");

	By validation_error = By.xpath("//span[@class='mismatch ng-scope']");
	By validation_success = By.xpath("//span[@class='verified ng-scope']");

	By upload_option = By.xpath("//a[@class='fa fa-upload-icon ng-scope']");

	By select_doc_type = By.xpath("//div[@class='modal-dialog modal-md']/div/div/div[2]/form/div/div/select");

	By upload_doc = By.xpath("//div[@class='modal-dialog modal-md']/div/div/div[2]/form/div/div[2]/button");

	By submit_for_approval = By.cssSelector(
			"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-footer > button:nth-child(1)");

	public Bank_acc_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_bank_tab() {
		return driver.findElement(bank_details_tab);
	}

	public WebElement get_account_type_dropdown() {
		return driver.findElement(Account_type_dropdown);
	}

	public WebElement get_account_option() {
		return driver.findElement(account_option);
	}

	public WebElement get_ifsc_code() {
		return driver.findElement(ifsc_code);
	}

	public WebElement get_account_number() {
		return driver.findElement(Account_no);
	}

	public WebElement get_verify_acc_no() {
		return driver.findElement(verify_acc_no);
	}

	public WebElement get_acc_holder_name() {
		return driver.findElement(acc_holder_name);
	}

	public WebElement get_primary_acc_checkbox() {
		return driver.findElement(primary_acc_checkbox);
	}

	public WebElement get_validate_acc_btn() {
		return driver.findElement(validate_acc_btn);
	}

	public WebElement get_validation_error_symbol() {
		return driver.findElement(validation_error);
	}

	public WebElement get_upload_option() {
		return driver.findElement(upload_option);
	}

	public WebElement get_doc_type() {
		return driver.findElement(select_doc_type);
	}

	public WebElement get_upload_doc_btn() {
		return driver.findElement(upload_doc);
	}

	public WebElement get_submit_for_approval_btn() {
		return driver.findElement(submit_for_approval);
	}

}
