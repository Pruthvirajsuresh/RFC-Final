package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class APOB_page extends Base {

	public WebDriver driver;

	public APOB_page(WebDriver driver) {
		this.driver = driver;
	}

	By FAQ1 = By.xpath("//div[@id='accordion']/div//div[@id='headingOne']");

	By FAQ2 = By.xpath("//div[@id='accordion']/div//div[@id='headingTwo']");

	By radio_btn = By.xpath("//input[@id='self_registration']");

	By checkbox = By.xpath("//label[contains(text(),\"I'm satisfied with the documents received for avai\")]");

	By Submit_btn = By.xpath("//div[@class='text-center']/button");

	public WebElement get_FAQ1() {
		return driver.findElement(FAQ1);

	}

	public WebElement get_FAQ2() {
		return driver.findElement(FAQ2);

	}

	public WebElement get_radio_btn() {
		return driver.findElement(radio_btn);

	}

	public WebElement get_checkbox() {
		return driver.findElement(checkbox);

	}

	public WebElement get_Submit_btn() {
		return driver.findElement(Submit_btn);

	}

}
