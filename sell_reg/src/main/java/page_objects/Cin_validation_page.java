package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Cin_validation_page extends Base {

	public WebDriver driver;

	By cin_tab = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-links.col-md-3.navbar-collapse.collapse > render-profile-section > company-profile-section > a:nth-child(3)");
	By cin_no = By.xpath("//input[@name='cin']");
	By cin_vrfy_btn = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > cin-tab > div.update_organisation > form > div.organisation.clearfix.form-group > button");

	public Cin_validation_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_cin_tab() {
		return driver.findElement(cin_tab);

	}

	public WebElement get_cin_num() {
		return driver.findElement(cin_no);

	}

	public WebElement get_cin_vrfy_btn() {
		return driver.findElement(cin_vrfy_btn);

	}

}
