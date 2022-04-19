package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Company_details_page extends Base {

	public WebDriver driver;

	By compant_details_tab = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-links.col-md-3.navbar-collapse.collapse > render-profile-section > company-profile-section > a.tab-section-content.ng-scope.ng-binding.mandatory");

	By business_type = By.xpath("//select[@name='business_type']");

	By option = By.xpath("//option[@value='authorized_retailer']");

	By annual_turnover = By.xpath("//input[@name='annual_turnover']");

	By compny_details_vrfy_btn = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > company-details-tab > div > form > button");

	public Company_details_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_company_details_tab() {
		return driver.findElement(compant_details_tab);
	}

	public WebElement get_business_type() {
		return driver.findElement(business_type);
	}

	public WebElement get_option() {
		return driver.findElement(option);
	}

	public WebElement get_anual_turnover() {
		return driver.findElement(annual_turnover);
	}

	public WebElement get_company_vrfy_btn() {
		return driver.findElement(compny_details_vrfy_btn);
	}

}
