package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Upload_doc_page extends Base {

	public WebDriver driver;

	public Upload_doc_page(WebDriver driver) {
		this.driver = driver;
	}

	By Digital_signature = By.xpath("//div[@class='row upload-section']/div/span");

	By GST_REG_06_cer = By.xpath("//form[@name='apobDetailsForm']/div[3]/div/div/span");

	By FSSAI_cer = By.xpath("//form[@name='apobDetailsForm']/div[5]/div/div/span");

	By Submit_btn = By.cssSelector(
			"#bd > div > div > div > rfc-component > div > div > show-enrollment-component > div > div.tabs > div > upload-document > div > div.col-md-8 > div > form > div.text-center.section_gap > button");

	public WebElement get_Digital_signature() {
		return driver.findElement(Digital_signature);

	}

	public WebElement get_GST_REG_06_cer() {
		return driver.findElement(GST_REG_06_cer);

	}

	public WebElement get_FSSAI_cer() {
		return driver.findElement(FSSAI_cer);

	}

	public WebElement get_Submit_btn() {
		return driver.findElement(Submit_btn);

	}

}
