package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Seller_approval_page extends Base {

	public WebDriver driver;

	By view_btn = By.xpath("//tbody[@class='seller-approval-list']/tr/td[4]/button");
	By approve_fssai_doc = By
			.xpath("//addresses[@addresses='seller.addresses']/div/div[2]/table/tbody/tr/td[9]/span/button[1]");
	By approve_certificate1 = By.xpath(
			"//certificates[@certificates='seller.certificates']/div/div[2]/table/tbody/tr/td[8]/span/button[1]");
	By approve_certificate2 = By.xpath(
			"//certificates[@certificates='seller.certificates']/div/div[2]/table/tbody/tr[2]/td[8]/span/button[1]");
	By approve_document1 = By
			.xpath("//documents[@documents='seller.uploaded_docs']/div/div[2]/table/tbody/tr/td[6]/span/button[1]");
	By approve_document2 = By
			.xpath("//documents[@documents='seller.uploaded_docs']/div/div[2]/table/tbody/tr[2]/td[6]/span/button[1]");
	By approve_document3 = By
			.xpath("//documents[@documents='seller.uploaded_docs']/div/div[2]/table/tbody/tr[3]/td[6]/span/button[1]");
	By approve_document4 = By
			.xpath("//documents[@documents='seller.uploaded_docs']/div/div[2]/table/tbody/tr[4]/td[6]/span/button[1]");
	By approve_seller_btn = By.cssSelector(
			"#content > div > div > approval-details > div > div > div.right-actions > button.btn.btn-primary.ng-scope");
	By confirm_approval_btn = By.cssSelector(
			"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > div.modal-footer.row > button.btn.btn-primary");

	public Seller_approval_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_view_btn() {
		return driver.findElement(view_btn);
	}

	public WebElement get_approve_certificate1() {
		return driver.findElement(approve_certificate1);
	}

	public WebElement get_approve_certificate2() {
		return driver.findElement(approve_certificate2);
	}

	public WebElement get_approve_document1() {
		return driver.findElement(approve_document1);
	}

	public WebElement get_approve_document2() {
		return driver.findElement(approve_document2);
	}

	public WebElement get_approve_seller_btn() {
		return driver.findElement(approve_seller_btn);
	}

	public WebElement get_confirm_approval_btn() {
		return driver.findElement(confirm_approval_btn);
	}

	public WebElement get_approve_fssai_doc() {
		return driver.findElement(approve_fssai_doc);
	}

	public WebElement get_approve_document3() {
		return driver.findElement(approve_document3);
	}

	public WebElement get_approve_document4() {
		return driver.findElement(approve_document4);
	}

}
