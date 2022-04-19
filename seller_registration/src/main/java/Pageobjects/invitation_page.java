package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class invitation_page extends Base {

	public WebDriver driver;

	By validate_T_c = By.xpath("//div[@class='seller-registration-tnc text-center review_button']/a");
	By invite_code = By.xpath("//input[@name='invitation_code']");
	By submit_button = By.xpath("//button[@type='submit']");

	public invitation_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement Validate_TC() {
		return driver.findElement(validate_T_c);

	}

	public WebElement invitation() {
		return driver.findElement(invite_code);

	}

	public WebElement submit() {
		return driver.findElement(submit_button);

	}

}
