package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class My_catagory_page extends Base {

	public WebDriver driver;

	By my_catagories_tab = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-links.col-md-3.navbar-collapse.collapse > render-profile-section > company-profile-section > a:nth-child(7)");
	By Add_new_btn = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > my-categories-tab > button");
	By catagory_text_field = By.xpath("//form[@name='categorySearchForm']/div/div[2]/div/div/input");
	By Add_catagory_btn = By.cssSelector(
			"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > my-categories-tab > form > button");

	public My_catagory_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_my_catgory_tab() {
		return driver.findElement(my_catagories_tab);
	}

	public WebElement get_Add_new_btn() {
		return driver.findElement(Add_new_btn);
	}

	public WebElement get_catagory_text_field() {
		return driver.findElement(catagory_text_field);
	}

	public WebElement get_Add_catagory_btn() {
		return driver.findElement(Add_catagory_btn);
	}

}
