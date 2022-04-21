package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Documents_page extends Base {

	public WebDriver driver;

	By document_tab = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-links.col-md-3.navbar-collapse.collapse > render-profile-section > company-profile-section > a:nth-child(9)");
	By doc_radio_btn = By.xpath("//input[@id='document_option']");
	By doc_type_dropdown = By.xpath("//select[@id='document_type']");
	By certificate_radio_btn = By.xpath("//input[@id='certificate_option']");
	By certificate_type_dropdown = By.xpath("//select[@id='certificate_type']");
	By upload_btn = By.cssSelector("#upload > form > div.row.form-group.ng-scope > div.right-pane > button");
	By submit_btn = By.cssSelector("#upload > form > button");
	By certificate_name = By.xpath("//input[@id='certificate_name']");
	By certificate_number = By.xpath("//input[@id='certificate_number']");
	By request_for_approval_btn = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > h2 > span > span > span > button");
	By confirm_request_btn = By.cssSelector(
			"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-footer > button:nth-child(2)");

	public Documents_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_document_tab() {
		return driver.findElement(document_tab);
	}

	public WebElement get_doc_radio_btn() {
		return driver.findElement(doc_radio_btn);
	}

	public WebElement get_doc_type_dropdown() {
		return driver.findElement(doc_type_dropdown);
	}

	public WebElement get_upload_btn() {
		return driver.findElement(upload_btn);
	}

	public WebElement get_submit_btn() {
		return driver.findElement(submit_btn);
	}

	public WebElement get_certificate_radio_btn() {
		return driver.findElement(certificate_radio_btn);
	}

	public WebElement get_certificate_type_dropdown() {
		return driver.findElement(certificate_type_dropdown);
	}

	public WebElement get_certificate_name() {
		return driver.findElement(certificate_name);
	}

	public WebElement get_certificate_number() {
		return driver.findElement(certificate_number);
	}

	public WebElement get_request_for_approval_btn() {
		return driver.findElement(request_for_approval_btn);
	}

	public WebElement get_confirm_request_btn() {
		return driver.findElement(confirm_request_btn);
	}

}
