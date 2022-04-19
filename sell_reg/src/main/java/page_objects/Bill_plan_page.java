package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Bill_plan_page extends Base {

	public WebDriver driver;

	By bill_plan_tab = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-links.col-md-3.navbar-collapse.collapse > render-profile-section > company-profile-section > a:nth-child(8)");
	By confirm_btn = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > bill-plan-tab > div > div.text-center.section_gap > button");

	public Bill_plan_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_bill_plan_tab() {
		return driver.findElement(bill_plan_tab);
	}

	public WebElement get_confirm_btn() {
		return driver.findElement(confirm_btn);
	}
}
