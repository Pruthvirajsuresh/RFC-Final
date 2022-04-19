package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class personaldetails_page extends Base {

	public WebDriver driver;

	By org_name = By.xpath("//input[@name='constitution_name']");
	By nxt_button = By.xpath("//button[@class='btn btn-primary ng-scope']");
	By per_pan = By.xpath("//input[@name='pan_number']");
	By per_pan_name = By.xpath("//input[@name='pan_name']");
	By con_checkbox = By.cssSelector("ng-form > div > label");
	By pan_vrfy_btn = By.xpath("//button[@class='btn btn-secondary ng-scope']");

	public personaldetails_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_org_name() {
		return driver.findElement(org_name);
	}

	public WebElement get_nxt_btn() {
		return driver.findElement(nxt_button);
	}

	public WebElement get_per_pan() {
		return driver.findElement(per_pan);
	}

	public WebElement get_per_pan_name() {
		return driver.findElement(per_pan_name);
	}

	public WebElement click_checkbox() {
		return driver.findElement(con_checkbox);
	}

	public WebElement get_pan_vrfy_btn() {
		return driver.findElement(pan_vrfy_btn);
	}

}
