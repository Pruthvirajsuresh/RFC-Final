package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Office_loc_page extends Base {

	public WebDriver driver;

	By office_loc_tab = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-links.col-md-3.navbar-collapse.collapse > render-profile-section > company-profile-section > a.tab-section-content.ng-scope.ng-binding.pending.mandatory");
	By office_name = By.xpath("//input[@ng-model='locations.name']");
	By type_dropdown = By.xpath("//select[@name='type_of_office']");
	By checkbox = By.cssSelector("div.right-pane > span > input");
	By pincode = By.xpath("//input[@name='pincode']");
	By flat_no = By.xpath("//input[@name='block_no']");
	By primisis = By.xpath("//input[@ng-model='locations.building_name']");
	By area = By.xpath("//input[@ng-model='locations.area']");
	By phone_no = By.xpath("//input[@ng-model='locations.mobile']");
	By emial_id = By.xpath("//input[@ng-model='locations.email']");
	By food_checkbox = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > office-locations-tab > div.office_details > form > div:nth-child(2) > div.right-pane > div:nth-child(1) > input");
	By GSTIN = By.xpath("//input[@ng-model='locations.gstin']");
	By checkbox2 = By.cssSelector("verification-consent > ng-form > div > label");
	By upload_fssai = By.xpath("//a[@class='upload-btn']");
	By Zone = By.xpath("//select[@ng-model='locations.zone']");
	By submit_btn = By.xpath("//button[@ng-click='createLocationDetails()']");
	By proceed_btn = By.cssSelector(
			"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-footer > button:nth-child(2)");

	By certificate_type = By.xpath("//div[@class='modal-dialog modal-md']/div/div/div[2]/form/div/div[2]/select");
	By option_fssai = By.cssSelector("#certificate_type > option.ng-binding.ng-scope");
	By certificate_name = By.xpath("//input[@id='certificate_name']");
	By certificate_number = By.xpath("//input[@id='certificate_number']");
	By calender_btn = By.cssSelector(
			"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-body > form > div:nth-child(4) > div.right-pane.col-md-6 > div > span > button");
	By change_month_btn = By.cssSelector(
			"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-body > form > div:nth-child(4) > div.right-pane.col-md-6 > div > div > ul > li:nth-child(1) > div > div > div > table > thead > tr:nth-child(1) > th:nth-child(3) > button");
	By active_date_btn = By.xpath("//button[@class='btn btn-default btn-sm active']");
	By upload_doc_btn = By.xpath("//button[@name='logo_image']");
	By submit_doc_btn = By.xpath("//div[@class='modal-footer ng-scope']/button[1]");

	public Office_loc_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_off_loc_tab() {
		return driver.findElement(office_loc_tab);

	}

	public WebElement get_off_name() {
		return driver.findElement(office_name);

	}

	public WebElement get_off_type() {
		return driver.findElement(type_dropdown);

	}

	public WebElement get_act_as_fulfil_checkbox() {
		return driver.findElement(checkbox);

	}

	public WebElement get_pincode() {
		return driver.findElement(pincode);

	}

	public WebElement get_flat_no() {
		return driver.findElement(flat_no);

	}

	public WebElement get_primisis_name() {
		return driver.findElement(primisis);

	}

	public WebElement get_area_name() {
		return driver.findElement(area);

	}

	public WebElement get_phone_no() {
		return driver.findElement(phone_no);

	}

	public WebElement get_email_id() {
		return driver.findElement(emial_id);

	}

	public WebElement get_food_checkbox() {
		return driver.findElement(food_checkbox);

	}

	public WebElement get_gstin_no() {
		return driver.findElement(GSTIN);

	}

	public WebElement get_con_checkbox2() {
		return driver.findElement(checkbox2);

	}

	public WebElement get_upload_fssai() {
		return driver.findElement(upload_fssai);

	}

	public WebElement get_zone() {
		return driver.findElement(Zone);

	}

	public WebElement get_submit_btn() {
		return driver.findElement(submit_btn);

	}

	public WebElement get_proceed_btn() {
		return driver.findElement(proceed_btn);

	}

	public WebElement get_certificate_type() {
		return driver.findElement(certificate_type);

	}

	public WebElement get_option_type() {
		return driver.findElement(option_fssai);

	}

	public WebElement get_certificate_name() {
		return driver.findElement(certificate_name);

	}

	public WebElement get_certificate_number() {
		return driver.findElement(certificate_number);

	}

	public WebElement get_calender_btn() {
		return driver.findElement(calender_btn);

	}

	public WebElement get_change_month_btn() {
		return driver.findElement(change_month_btn);

	}

	public WebElement get_active_date_btn() {
		return driver.findElement(active_date_btn);

	}

	public WebElement get_upload_doc_btn() {
		return driver.findElement(upload_doc_btn);

	}

	public WebElement get_submit_doc_btn() {
		return driver.findElement(submit_doc_btn);

	}

}
