package com.rfc.maincode1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.rf.Config.PropertiesFile1;

public class Enrolmentrfc {

	static WebDriver driver;
	public static String browser;
	public static String seller_name;
	public static String seller_pwd;
	public static String GSTIN;
	public static String RFC_STATE;
	public static String RFC_NAME;

	public static void main(String[] args) throws InterruptedException {

		PropertiesFile1.readPropertiesFile();
		// SetBrowser();
		SetBrowserConfig1();
		RunTest();
		PropertiesFile1.readPropertiesFile();

	}

	public static void SetBrowser() {
		browser = "chrome";
	}

	public static void SetBrowserConfig1() {

		if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/infibeam/Downloads/Selenium_setup/chromedriver");
			driver = new ChromeDriver();

		}

	}

	public static void RunTest() throws InterruptedException {

		driver.get("https://sit-eks-userreg.ril.smebazaar.ooo/sso/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// userid
		driver.findElement(By.xpath("//input[@id='user_user_id']")).sendKeys(seller_name);

		// pwd
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(seller_pwd);

		// login
		driver.findElement(By.xpath("//input[@name='commit']")).click();

		// services
		driver.findElement(By.cssSelector("#nav-menu- > ul > li:nth-child(8) > a")).click();

		// jiomart
		driver.findElement(By.cssSelector("#nav-menu- > ul > li.dropdown.ang-dropdown.open > ul > li:nth-child(1) > a"))
				.click();

		driver.findElement(By.xpath("//input[@name='referral-code']")).sendKeys("");

		// add RFC button
		driver.findElement(By.xpath("//div[@class='inline-actions']/div[2]/button")).click();

		// select state
		List<WebElement> radioButtons = driver.findElements(By.xpath("//div[@class='radio-button']"));

		for (WebElement radio : radioButtons) {

			String name_of_the_states = radio.getText();
			System.out.println(name_of_the_states);

			if (name_of_the_states.contains(RFC_STATE)) {
				radio.click();
			}

		}

		// submit button
		driver.findElement(By.cssSelector(
				"#bd > div > div > div > rfc-component > div > div > new-enrollment-component > div > form > div.text-center > button"))
				.click();
		Thread.sleep(2000);

		// scroll down
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0,400)");
		Thread.sleep(2000);

		// select RFC
		List<WebElement> checkboxs = driver.findElements(By.xpath("//div[@class='clearfix form-group ng-scope']"));

		for (WebElement check : checkboxs) {

			String name_of_the_rfc = check.getText();
			System.out.println(name_of_the_rfc);

			if (name_of_the_rfc.contains(RFC_NAME)) {
				check.click();
			}

		}

		// FSSAI checkbox
		driver.findElement(By.cssSelector(
				"#bd > div > div > div > rfc-component > div > div > show-enrollment-component > div > div.tabs > div > select-rfc > div > div.col-md-8 > div > form > div.clearfix.form-group > div > label"))
				.click();

		// submit button
		driver.findElement(By.xpath("//div[@class='text-center section_gap']/button")).click();
		Thread.sleep(3000);

		// enter Gstin
		driver.findElement(By.xpath("//div[@class='business-details']/form/div[3]/div[2]/input")).sendKeys(GSTIN);

		// click on org type
		driver.findElement(By.xpath("//input[@ type='text' and @name='org-type']")).click();
		Thread.sleep(2000);

		// click on submit button

	}

}
