package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Business_details_page extends Base {

	public WebDriver driver;

	public Business_details_page(WebDriver driver) {
		this.driver = driver;
	}

	By GSTIN_textfield = By.xpath("//form[@name='businessDetailsForm']/div[3]/div[2]/input");

	By FAQ1 = By.xpath("//div[@id='accordion']/div//div[@id='headingOne']");

	By FAQ2 = By.xpath("//div[@id='accordion']/div//div[@id='headingTwo']");

	By PAN_field = By.xpath("//input[@name='pan-number']");

	By upload_GST = By.xpath("//span[@class='fa-upload-icon']");

	By office_name = By.xpath("//input[@name='addr-name']");

	By Address = By.xpath(
			"//div[@class='clearfix form-group form-group-horz ng-scope ng-enter-prepare']/div[2]/input[@ng-model='inputAddress.address']");

	By Area = By.xpath(
			"//div[@class='clearfix form-group form-group-horz ng-scope ng-enter-prepare']/div[2]/input[@ng-model='inputAddress.area']");

	By pincode = By.xpath("//input[@name='pincode']");

	By mobile_no = By.xpath("//input[@ng-model='inputAddress.mobile']");

	By Email_id = By.xpath("//input[@ng-model='inputAddress.email']");

	By Submit_btn = By.xpath("//div[@class='text-center full-width']/button");

	public WebElement get_GSTIN_textfield() {
		return driver.findElement(GSTIN_textfield);

	}

	public WebElement get_FAQ1() {
		return driver.findElement(FAQ1);

	}

	public WebElement get_FAQ2() {
		return driver.findElement(FAQ2);

	}

	public WebElement get_PAN_field() {
		return driver.findElement(PAN_field);

	}

	public WebElement get_upload_GST() {
		return driver.findElement(upload_GST);

	}

	public WebElement get_office_name() {
		return driver.findElement(office_name);

	}

	public WebElement get_Address() {
		return driver.findElement(Address);

	}

	public WebElement get_Area() {
		return driver.findElement(Area);

	}

	public WebElement get_pincode() {
		return driver.findElement(pincode);

	}

	public WebElement get_mobile_no() {
		return driver.findElement(mobile_no);

	}

	public WebElement get_Email_id() {
		return driver.findElement(Email_id);

	}

	public WebElement get_Submit_btn() {
		return driver.findElement(Submit_btn);

	}

}
