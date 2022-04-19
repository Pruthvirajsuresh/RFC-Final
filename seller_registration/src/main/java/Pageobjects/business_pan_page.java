package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class business_pan_page extends Base {

	public WebDriver driver;

	By business_pan = By.xpath("//input[@name='pan']");
	By business_name = By.xpath("//input[@name='pan_name']");
	By pan_checkbox = By.cssSelector("div.update_pan > form > verification-consent > ng-form > div > label");
	By pan_vrfy_btn = By.xpath("//button[@ng-click='validatePANDetails(seller.pan_name,seller.pan)']");

	public business_pan_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement get_bus_pan_no() {
		return driver.findElement(business_pan);

	}

	public WebElement get_bus_pan_name() {
		return driver.findElement(business_name);

	}

	public WebElement get_bus_pan_checkbox() {
		return driver.findElement(pan_checkbox);

	}

	public WebElement get_bus_pan_vrfy_btn() {
		return driver.findElement(pan_vrfy_btn);

	}

}
