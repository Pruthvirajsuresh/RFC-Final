package com.jio.maincode;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.jio.Config.PropertiesFile;

public class Registration {

	public static String browser;
	public static String invitation_code;
	public static String company_name;
	public static String personal_pan;
	public static String business_pan;
	public static String cin_number;
	public static String company_pan_name;
	public static String office_location;
	public static String pincode;
	public static String GSTIN;
	public static String ifsc_code;
	public static String bank_account_no;
	public static String account_holder_name;
	public static String catagory;
	public static String Expiry_year;
	public static String Expiry_month;
	public static String Expiry_day;

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		PropertiesFile.readPropertiesFile();
		// SetBrowser();
		SetBrowserConfig();
		RunTest();
		PropertiesFile.writePropertiesFile();

	}

	public static void SetBrowser() {

		browser = "Chrome";
	}

	public static void SetBrowserConfig() {

		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/infibeam/Downloads/Selenium_setup/chromedriver");
			driver = new ChromeDriver();

		}

	}

	public static void RunTest() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.get("https://sit-eks-userreg.ril.smebazaar.ooo/seller_registration");
		driver.manage().window().maximize();

		// click terms and condition button
		driver.findElement(By.cssSelector("#bd review-tnc > div > a")).click();

		// Checkbooks click
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("$('#accept-tnc > label')[0].click()");

		// scrolldown
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,1000)");

		// invitation code
		driver.findElement(By.xpath("//input[@name='invitation_code']")).sendKeys(invitation_code);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='constitution_type']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Company");

		// select organisation name
		driver.findElement(By.xpath("//input[@name='constitution_name']")).sendKeys(company_name);

		// press next button
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-scope']")).click();

		// personal pan number EZJPP6602R
		driver.findElement(By.xpath("//input[@name='pan_number']")).sendKeys(personal_pan);

		// personal pan name
		driver.findElement(By.xpath("//input[@name='pan_name']")).sendKeys("Pruthviraj S");

		// DOB
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='day']"));
		Select select1 = new Select(dropdown1);
		select1.selectByVisibleText("11");

		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='month']"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("December");

		WebElement dropdown3 = driver.findElement(By.xpath("//select[@name='year']"));
		Select select3 = new Select(dropdown3);
		select3.selectByVisibleText("1998");

		// Concern checkbooks
		driver.findElement(By.cssSelector("ng-form > div > label")).click();

		// verify pan button
		driver.findElement(By.xpath("//button[@class='btn btn-secondary ng-scope']")).click();

		// Mobile verification
		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("7022413574");

		// mobile confirmation
		driver.findElement(By.xpath("//input[@name='mobile_confirm']")).sendKeys("7022413574");

		// send otp button
		driver.findElement(By.xpath("//button[@class='send_otp btn btn-secondary ng-scope']")).click();
		Thread.sleep(1000);

		// otp ebter
		driver.findElement(By.xpath("//input[@id='mobileotp']")).sendKeys("555555");

		// verify otp button
		driver.findElement(By.xpath(
				"//button[@ng-disabled='(!flags.otp_sent) || (!mobile_info.mobile_verify_otp) || (mobile_info.mobile!=mobile_info.verify_mobile)']"))
				.click();

		// next button after otp is entered
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-scope']")).click();

		// email verification
		driver.findElement(By.xpath("//input[@name='email_id']")).sendKeys("pruthviraj.s@ia.ooo");

		// email confirmation
		driver.findElement(By.xpath("//input[@name='email_id_confirm']")).sendKeys("pruthviraj.s@ia.ooo");

		// send otp button email
		driver.findElement(By.xpath(
				"//button[@class='send_otp btn btn-secondary ng-scope' and @ng-disabled=\"(email_info.email!=email_info.verify_email) || (flags.otp_sent) || (email_info.email=='') || (!email_info.email)\"]"))
				.click();
		Thread.sleep(1000);

		// enter otp
		driver.findElement(By.xpath("//input[@id='emailotp']")).sendKeys("555555");

		// verify otp button
		driver.findElement(By.xpath(
				"//button[@class='send_otp btn btn-secondary ng-scope' and @ng-disabled='(!flags.otp_sent) || (!email_info.email_verify_otp)']"))
				.click();

		// next button
		driver.findElement(By.xpath(
				"//button[@class='btn btn-primary ng-scope' and @ng-click='handleStageChange({stageCode: regStage.codeName})']"))
				.click();

		// enter user ID
		Random obj = new Random();
		long seller = obj.nextInt(1000);
		String cellnum = ("seller" + seller);
		driver.findElement(By.xpath("//input[@name='user_id']")).sendKeys(cellnum);
		System.out.println(cellnum);

		// enter password for new seller
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ril@1234");

		// confirm password
		driver.findElement(By.xpath("//input[@name='password_confirm']")).sendKeys("Ril@1234");

		// Checkbooks
		driver.findElement(By.cssSelector("form > div.agree_primary_reg.checkbox-wrapper > label")).click();

		// create account button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// JavascriptExecutor js5 = (JavascriptExecutor) driver;
		// js5.executeScript("window.scrollTo(0,400)");
		// Thread.sleep(1000);

		// enter business pan
		driver.findElement(By.xpath("//input[@name='pan']")).sendKeys(business_pan);

		// enter pan name
		driver.findElement(By.xpath("//input[@name='pan_name']")).sendKeys(company_pan_name);
		Thread.sleep(1000);

		// checkbox
		driver.findElement(By.cssSelector("div.update_pan > form > verification-consent > ng-form > div > label"))
				.click();
		Thread.sleep(2000);

		// verify pan button
		driver.findElement(By.xpath("//button[@ng-click='validatePANDetails(seller.pan_name,seller.pan)']")).click();
		Thread.sleep(3000);

		// cin number
		driver.findElement(By.xpath("//input[@name='cin']")).sendKeys(cin_number);
		Thread.sleep(1000);
		// verify and save button
		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > cin-tab > div.update_organisation > form > div.organisation.clearfix.form-group > button"))
				.click();
		Thread.sleep(2000);

		// company details
		driver.findElement(By.xpath("//select[@name='business_type']")).click();
		driver.findElement(By.xpath("//option[@value='authorized_retailer']")).click();

		driver.findElement(By.xpath("//input[@name='annual_turnover']")).sendKeys("450000000");

		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > company-details-tab > div > form > button"))
				.click();

		// Office location
		driver.findElement(By.xpath("//input[@ng-model='locations.name']")).sendKeys(office_location);

		// type of office dropdown
		WebElement dropdown4 = driver.findElement(By.xpath("//select[@name='type_of_office']"));
		Select select4 = new Select(dropdown4);
		select4.selectByVisibleText("Registered");

		// checkbox
		driver.findElement(By.cssSelector("div.right-pane > span > input")).click();

		// pincode
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys(pincode);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys(Keys.ENTER);

		// flat no
		driver.findElement(By.xpath("//input[@name='block_no']")).sendKeys("617");

		// name of premisis
		driver.findElement(By.xpath("//input[@ng-model='locations.building_name']")).sendKeys("vani villas");

		// area
		driver.findElement(By.xpath("// input[@ng-model='locations.area']")).sendKeys("basaveshwarnagar");

		// phone number
		driver.findElement(By.xpath("//input[@ng-model='locations.mobile']")).sendKeys("9879699128");

		// email id
		driver.findElement(By.xpath("//input[@ng-model='locations.email']"))
				.sendKeys("dixitkumar.prajapati@infibeam.ooo");

		// GSTIN
		driver.findElement(By.xpath("//input[@ng-model='locations.gstin']")).sendKeys(GSTIN);

		// Checkbox
		driver.findElement(By.cssSelector("verification-consent > ng-form > div > label")).click();

		// select zone
		WebElement dropdown5 = driver.findElement(By.xpath("//select[@ng-model='locations.zone']"));
		Select select5 = new Select(dropdown5);
		select5.selectByVisibleText("India");

		// submit button
		driver.findElement(By.xpath("//button[@ng-click='createLocationDetails()']")).click();

		// proceed button
		driver.findElement(By.cssSelector(
				"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-footer > button:nth-child(2)"))
				.click();

		// Bank Accounts
		driver.findElement(By.xpath("//a[@class='tab-section-content ng-scope ng-binding mandatory current']")).click();

		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > seller-bank-details-tab > div.bank_account_details > form > div.form-group.row.bank_account_type > div.right-pane > select"))
				.click();

		driver.findElement(By.xpath("//option[@value='Saving']")).click();

		driver.findElement(By.xpath("//input[@id='ifsc_code']")).sendKeys(ifsc_code);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ifsc_code']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='ifsc_code']")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//input[@id='bank_account_no']")).sendKeys(bank_account_no);

		driver.findElement(By.xpath("//input[@id='verify_bank_account_no']")).sendKeys(bank_account_no);

		driver.findElement(By.xpath("//input[@id='account_holder_name']")).sendKeys(account_holder_name);

		driver.findElement(By.xpath("//input[@id='is_primary_account']")).click();

		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > seller-bank-details-tab > div.bank_account_details > form > button"))
				.click();

		// proceed button
		driver.findElement(By.cssSelector(
				"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-footer > button:nth-child(2)"))
				.click();

//		}else {
//			
//			driver.findElement(By.cssSelector("#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > seller-bank-details-tab > div.bank_accounts > table > tbody > tr > td.actions > div.actions > a.fa.fa-upload-icon.ng-scope")).click();
//			WebElement dropdown46 = driver.findElement(By.xpath("//select[@name='document_type' ]"));
//			Select select46 = new Select(dropdown46);
//			select46.selectByVisibleText("Cancelled Cheque");
//			
//			Robot robot20 = new Robot();
//			driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-body > form > div > div.col-md-8 > button")).click();    
//			Thread.sleep(2000);
//
//			StringSelection stringSelection3 = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection3, null );
//			Thread.sleep(1000);
//
//			robot20.keyPress(KeyEvent.VK_CONTROL);
//			robot20.keyPress(KeyEvent.VK_V);
//
//			robot20.keyRelease(KeyEvent.VK_CONTROL);
//			robot20.keyRelease(KeyEvent.VK_V);
//
//			Thread.sleep(1000);
//			robot20.keyPress(KeyEvent.VK_ENTER);
//			robot20.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//
//			driver.findElement(By.cssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-footer > button:nth-child(1)")).click();
//			Thread.sleep(1000);
//			
//			driver.findElement(By.cssSelector("#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-links.col-md-3.navbar-collapse.collapse > render-profile-section > company-profile-section > a:nth-child(7)")).click();
//			Thread.sleep(2000);
//		}
//

		// my catagory
		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-links.col-md-3.navbar-collapse.collapse > render-profile-section > company-profile-section > a.tab-section-content.ng-scope.ng-binding.mandatory.current"))
				.click();

		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > my-categories-tab > button"))
				.click();

		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > my-categories-tab > form > div > div.right-pane > div > div > input:nth-child(1)"))
				.sendKeys(catagory);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > my-categories-tab > form > div > div.right-pane > div > div > input:nth-child(1)"))
				.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > my-categories-tab > form > div > div.right-pane > div > div > input:nth-child(1)"))
				.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > my-categories-tab > form > button"))
				.click();

		// proceed button
		driver.findElement(By.cssSelector(
				"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-footer > button:nth-child(2)"))
				.click();

		// bill plan
		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > div.row.profile-section-panel > div.org-sections.col-md-9.ng-scope > ui-view > bill-plan-tab > div > div.text-center.section_gap > button"))
				.click();
		Thread.sleep(2000);

		// document 1
		driver.findElement(By.xpath("//input[@id='document_option']")).click();
		Thread.sleep(1000);
		WebElement dropdown25 = driver.findElement(By.xpath("//select[@id='document_type']"));
		Select select25 = new Select(dropdown25);
		select25.selectByVisibleText("Resolution Document from Board of Directors");
		Thread.sleep(1000);

		// choose file
		Robot robot = new Robot();
		driver.findElement(By.cssSelector("#upload > form > div.row.form-group.ng-scope > div.right-pane > button"))
				.click();
		Thread.sleep(2000);

		StringSelection stringSelection = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#upload > form > button")).click();
		Thread.sleep(2000);

		// document 2

		driver.findElement(By.xpath("//input[@id='document_option']")).click();
		Thread.sleep(1000);
		WebElement dropdown26 = driver.findElement(By.xpath("//select[@id='document_type']"));
		Select select26 = new Select(dropdown26);
		select26.selectByVisibleText("Memorandum Of Association (MOA)");
		Thread.sleep(1000);

		// choose file
		Robot robo = new Robot();
		driver.findElement(By.cssSelector("#upload > form > div.row.form-group.ng-scope > div.right-pane > button"))
				.click();
		Thread.sleep(2000);

		StringSelection stringSelection1 = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
		Thread.sleep(1000);

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#upload > form > button")).click();
		Thread.sleep(1000);

		// certificate1
		driver.findElement(By.xpath("//input[@id='certificate_option']")).click();
		Thread.sleep(1000);
		WebElement dropdown28 = driver.findElement(By.xpath("//select[@id='certificate_type']"));
		Select select28 = new Select(dropdown28);
		select28.selectByVisibleText("Authorized Retailer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='certificate_name']")).sendKeys("certificate2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='certificate_number']")).sendKeys("987454158");
		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("#upload > form > div:nth-child(4) > div.right-pane > div > span > button")).click();
//		Thread.sleep(1000);

		// date pick button
		driver.findElement(By.cssSelector("#upload > form > div:nth-child(4) > div.right-pane > div > span > button"))
				.click();
		Thread.sleep(2000);
		// month selection button
		driver.findElement(By.xpath("//th[@colspan='6']/button")).click();
		// year selection button
		driver.findElement(By.xpath("//th[@colspan='1']/button")).click();
		List<WebElement> years = driver.findElements(By.xpath("//button[@type='button' and @class='btn btn-default']"));
		for (WebElement year : years) {
			String selection1 = year.getText();
			System.out.println(selection1);

			if (selection1.contains(Expiry_year)) {
				year.click();
				break;
			}
		}

		List<WebElement> months = driver
				.findElements(By.xpath("//button[@type='button' and @class='btn btn-default']"));
		for (WebElement month : months) {
			String selection2 = month.getText();
			System.out.println(selection2);

			if (selection2.contains(Expiry_month)) {
				month.click();
				break;
			}
		}

		List<WebElement> days = driver
				.findElements(By.xpath("//button[@type='button' and @class='btn btn-default btn-sm']"));
		for (WebElement day : days) {
			String selection3 = day.getText();
			System.out.println(selection3);

			if (selection3.contains(Expiry_day)) {
				day.click();
				break;
			}
		}

//		// click on date arrow 3 times
//		for (int i = 1; i < 3; i++) 
//		{
//			driver.findElement(By.cssSelector("#upload > form > div:nth-child(4) > div.right-pane > div > div > ul > li:nth-child(1) > div > div > div > table > thead > tr:nth-child(1) > th:nth-child(3) > button")).click();
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm active']")).click();
//		Thread.sleep(2000);

		Robot rocrf = new Robot();
		driver.findElement(By.cssSelector("#upload > form > div.row.form-group.ng-scope > div.right-pane > button"))
				.click();
		Thread.sleep(2000);

		StringSelection stringSelection39 = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection39, null);
		Thread.sleep(1000);

		rocrf.keyPress(KeyEvent.VK_CONTROL);
		rocrf.keyPress(KeyEvent.VK_V);

		rocrf.keyRelease(KeyEvent.VK_CONTROL);
		rocrf.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		rocrf.keyPress(KeyEvent.VK_ENTER);
		rocrf.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#upload > form > button")).click();
		Thread.sleep(3000);

		// certificate2
		driver.findElement(By.xpath("//input[@id='certificate_option']")).click();
		Thread.sleep(1000);
		WebElement dropdown42 = driver.findElement(By.xpath("//select[@id='certificate_type']"));
		Select select42 = new Select(dropdown42);
		select42.selectByVisibleText("MSME Certificate");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='certificate_name']")).sendKeys("certificate3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='certificate_number']")).sendKeys("987454158");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#upload > form > div:nth-child(4) > div.right-pane > div > span > button"))
				.click();
		Thread.sleep(1000);

		for (int i = 1; i < 3; i++) {
			driver.findElement(By.cssSelector(
					"#upload > form > div:nth-child(4) > div.right-pane > div > div > ul > li:nth-child(1) > div > div > div > table > thead > tr:nth-child(1) > th:nth-child(3) > button"))
					.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm active']")).click();
		Thread.sleep(2000);

		Robot ro = new Robot();
		driver.findElement(By.cssSelector("#upload > form > div.row.form-group.ng-scope > div.right-pane > button"))
				.click();
		Thread.sleep(2000);

		StringSelection stringSelection40 = new StringSelection("/home/infibeam/sample pdf/GeM-Bidding-2229509.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection40, null);
		Thread.sleep(1000);

		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);

		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#upload > form > button")).click();
		Thread.sleep(3000);

		// send for approval
		driver.findElement(By.cssSelector(
				"#bd > div > div > div > seller-profile-component > div.sellerprofile.col-md-12.ng-scope > div.panel-wrapper.ng-scope > h2 > span > span > span > button"))
				.click();
		Thread.sleep(2000);

		// confirmation
		driver.findElement(By.cssSelector(
				"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div > div.modal-footer > button:nth-child(2)"))
				.click();

		driver.close();
		Thread.sleep(5000);

		System.setProperty("webdriver.chrome.driver", "/home/infibeam/Downloads/Selenium_setup/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://sit-eks-settleman.ril.smebazaar.ooo/admin/seller_approval");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Chethana.C");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("CC@202020");
		driver.findElement(By.cssSelector("#content-inner > form > input[type=submit]:nth-child(6)")).click();

		// click view button
		driver.findElement(By.xpath("//tbody[@class='seller-approval-list']/tr/td[4]/button")).click();

		// scrolldown
		JavascriptExecutor js336 = (JavascriptExecutor) driver;
		js336.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);

		// approve 1st certificate
		driver.findElement(By.xpath(
				"//certificates[@certificates='seller.certificates']/div/div[2]/table/tbody/tr/td[8]/span/button[1]"))
				.click();

		// approve 2nd certificate
		driver.findElement(By.xpath(
				"//certificates[@certificates='seller.certificates']/div/div[2]/table/tbody/tr[2]/td[8]/span/button[1]"))
				.click();
		Thread.sleep(2000);

		JavascriptExecutor js337 = (JavascriptExecutor) driver;
		js337.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		// approve 1st document
		driver.findElement(By
				.xpath("//documents[@documents='seller.uploaded_docs']/div/div[2]/table/tbody/tr/td[6]/span/button[1]"))
				.click();
		Thread.sleep(2000);

		// approve 2nd document
		driver.findElement(By.xpath(
				"//documents[@documents='seller.uploaded_docs']/div/div[2]/table/tbody/tr[2]/td[6]/span/button[1]"))
				.click();
		Thread.sleep(2000);

		JavascriptExecutor js338 = (JavascriptExecutor) driver;
		js338.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		// approve button
		driver.findElement(By.xpath("//div[@class='inline-actions ng-scope']/div[2]/button[2]")).click();
		Thread.sleep(2000);

		// confirm approval button
		driver.findElement(By.cssSelector(
				"body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > div.modal-footer.row > button.btn.btn-primary"))
				.click();

		driver.quit();

	}
}
