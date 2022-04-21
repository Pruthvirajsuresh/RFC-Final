package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class RFC_Approve_Page extends Base {

	public WebDriver driver;

	public RFC_Approve_Page(WebDriver driver) {
		this.driver = driver;
	}

	By view_btn = By.xpath("//tbody[@class='seller-approval-list']/tr/td[6]/button");

	By approve_GST_APOB_CERTIFICATE = By
			.xpath("//document-view[@ng-if='documents']/div/div[2]/table/tbody/tr[1]/td[6]/span/button[1]");

	By approve_GST_CERTIFICATE = By
			.xpath("//document-view[@ng-if='documents']/div/div[2]/table/tbody/tr[2]/td[6]/span/button[1]");

	By approve_FSSAI_CERTIFICATE = By
			.xpath("//document-view[@ng-if='documents']/div/div[2]/table/tbody/tr[3]/td[6]/span/button[1]");

	By approve_RFC_btn = By.cssSelector(
			"#content > div > div > ui-view > rfc-approval-show-component > rfc-approval-show > div > div > div.right-actions > button.btn.btn-primary");
	By confirm_approval_btn = By.cssSelector(
			"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-footer.row.ng-scope > button.btn.btn-primary");

	public WebElement get_view_btn() {
		return driver.findElement(view_btn);
	}

	public WebElement get_approve_GST_APOB_CERTIFICATE() {
		return driver.findElement(approve_GST_APOB_CERTIFICATE);
	}

	public WebElement get_approve_GST_CERTIFICATE() {
		return driver.findElement(approve_GST_CERTIFICATE);
	}

	public WebElement get_approve_FSSAI_CERTIFICATE() {
		return driver.findElement(approve_FSSAI_CERTIFICATE);
	}

	public WebElement get_approve_RFC_btn() {
		return driver.findElement(approve_RFC_btn);
	}

	public WebElement get_confirm_approval_btn() {
		return driver.findElement(confirm_approval_btn);
	}

}
