package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class landing_page extends Base {

	public WebDriver driver;

	public landing_page(WebDriver driver) {
		this.driver = driver;
	}

	By TC = By.cssSelector("#bd review-tnc > div > a");
	By Logo = By.xpath("//div[@class='seller-registration-note info-note']/div/div[1]");

	public WebElement Terms_conditions() {
		return driver.findElement(TC);

	}

	public WebElement quote() {
		return driver.findElement(Logo);

	}

}
