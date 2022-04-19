package com.sto.maincode;

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
import com.sto.Config.Properties2File;

public class Sto {

	static WebDriver driver;
	public static String browser;
	public static String seller_name;
	public static String seller_pwd;
	public static String STR_NUM;
	public static String confirm_qty;
	public static String MRP;
	public static String product_length;
	public static String product_breath;
	public static String product_height;
	public static String Year;
	public static String Month;
	public static String Day;
	public static String package_length;
	public static String package_breath;
	public static String package_height;
	public static String package_weight;
	public static String Eaches;
	public static String packageno;
	public static String BOXWEIGHT;
	public static String box_length;
	public static String box_breath;
	public static String box_height;
	public static String AppointmentDate;
	public static String Time_slot;

	public static void main(String[] args) throws InterruptedException {

		Properties2File.readPropertiesFile();
		// SetBrowser();
		SetBrowserConfig1();
		RunTest();
		Properties2File.readPropertiesFile();

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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// userid
		driver.findElement(By.xpath("//input[@id='user_user_id']")).sendKeys(seller_name);

		// pwd
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(seller_pwd);

		// login
		driver.findElement(By.xpath("//input[@name='commit']")).click();

		// services
		driver.findElement(By.cssSelector("#nav-menu- > ul > li:nth-child(8) > a")).click();
		Thread.sleep(2000);

		// seller str services
		driver.findElement(By.linkText("Seller STR Settings")).click();
        Thread.sleep(2000);
        
		// search for STR created
		driver.findElement(By.xpath("//div[@class='input-group manage-input-group']/input[@placeholder='Search by STO/STR number, Item Id, RFC...']")).sendKeys(STR_NUM);

		// search button
		driver.findElement(By.xpath("//div[@class='add-flex flex-full']/button[1]")).click();
		Thread.sleep(2000);

		// click on result str process button
		driver.findElement(By.xpath("//tr[@ng-repeat='str in $list.results']/td[9]/div/button")).click();

		// click on view/edit str button
		driver.findElement(By.xpath("//tr[@ng-repeat='item in sto.stock_transfer_order_items']/td[6]/button")).click();

		// confirm qty
		driver.findElement(By.xpath("//input[@id='confirmed-qty']")).sendKeys(confirm_qty);

		// mrp
		//driver.findElement(By.xpath("//input[@id='mrp_in_cents']")).sendKeys(MRP);

		// country of origin
		WebElement contry = driver.findElement(By.id("country_of_origin"));
		Select select = new Select(contry);
		select.selectByVisibleText("India");
		Thread.sleep(2000);

		// Expiry date
//		driver.findElement(By.cssSelector("#content > div > div > ui-view > ui-view > ui-view > sto-item-edit-component > div > fieldset > div > div.section_gap.batch-details.theme-bg > div > div > div > div:nth-child(2) > div:nth-child(3) > div > span > button")).click();
//		Thread.sleep(2000);
//		
//		// month selection button
//		driver.findElement(By.xpath("//th[@colspan='5']/button")).click();
//		
//		// year selection button
//		driver.findElement(By.xpath("//th[@colspan='1']/button")).click();
//		
//		//select active year
//		driver.findElement(By.xpath("//button[@class='btn btn-default active']")).click();
//		
//		//select active month
//		List<WebElement> months = driver.findElements(By.xpath("//button[@type='button' and @class='btn btn-default']"));
//		for (WebElement selectedMonth : months) {
//			String selection2 = selectedMonth.getText();
//			System.out.println(selection2);
//
//			if (selection2.contains("January")) {
//				selectedMonth.click();
//				break;
//			}
//		}
//		
//		//select day
//		List<WebElement> days = driver.findElements(By.xpath("//button[@type='button' and @class='btn btn-default btn-sm']"));
//		for (WebElement selectedDay : days) {
//			String selection3 = selectedDay.getText();
//			System.out.println(selection3);
//
//			if (selection3.contains("09")) {
//				selectedDay.click();
//				break;
//			}
//		}

		// product dimensions
		driver.findElement(By.xpath("//input[@id='dimension' and @placeholder='L']")).sendKeys(product_length);
		driver.findElement(By.xpath("//input[@id='dimension' and @placeholder='B']")).sendKeys(product_breath);
		driver.findElement(By.xpath("//input[@id='dimension' and @placeholder='H']")).sendKeys(product_height);

		// packaging type
		WebElement packageType = driver.findElement(By.xpath("//div[@class='row']/div/div/div/div/div/div/div[2]/select"));
		Select select1 = new Select(packageType);
		select1.selectByVisibleText("Paper Box");

		// package dimensions
		driver.findElement(By.xpath("//div[@class='row lbh']/div[1]/input")).sendKeys(package_length);
		driver.findElement(By.xpath("//div[@class='row lbh']/div[2]/input")).sendKeys(package_breath);
		driver.findElement(By.xpath("//div[@class='row lbh']/div[3]/input")).sendKeys(package_height);

		// package weight
		driver.findElement(By.cssSelector("#content > div > div > ui-view > ui-view > ui-view > sto-item-edit-component > div > fieldset > div > div.section_gap.batch-details.theme-bg > div > div > div > div:nth-child(3) > div > div.row.batch-package.ng-scope > div > div > div.col-md-10 > div:nth-child(1) > div.col-md-2.form-group > input")).sendKeys(package_weight);

		// eaches per pack
		driver.findElement(By.xpath("//input[@value='package.package_details.eaches_per_package']")).sendKeys(Eaches);

		// no of packages
		driver.findElement(By.xpath("//input[@value='package.no_of_packages']")).sendKeys(packageno);
		Thread.sleep(2000);

		// scrolldown
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,500)");

		// save and move back to STO
		driver.findElement(By.xpath("//div[@class='add-flex  flex-full flex-vert-center']/div/button[2]")).click();
		System.out.println("STR Product details confirmed");
		Thread.sleep(2000);

		// print package label
		driver.findElement(By.xpath("//div[@class='right-actions']/button")).click();

		// back to confirm STR
		driver.findElement(By.xpath("//div[@class='col-md-6']/a")).click();
		Thread.sleep(2000);

		// confirm STR
		driver.findElement(By.xpath("//div[@class='inline-actions section_gap center-align']/button[2]")).click();
		System.out.println("STR confirmed successfully");
		Thread.sleep(3000);
		

		// book appointment page
		// select address
		driver.findElement(By.xpath("//change-shipping-address[@button-name='Select Address']/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-body ng-scope']/div/div[1]/div/div/label/input")).click();
		driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/div/div/button[1]")).click();
		Thread.sleep(2000);

		// scrolldown
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,1000)");
		
		//select appointment
		driver.findElement(By.cssSelector("#tabs > div > div.tab-pane.ng-scope.active > fieldset > div.transportation-details > div.row.section_gap > div.col-md-6.form-group.ng-scope > div > div.col-md-5 > div > div > span > button")).click();
		
		//select date
		List<WebElement> appointment = driver.findElements(By.xpath("//button[@type='button' and @class='btn btn-default btn-sm']"));
		for (WebElement selectedDay1 : appointment) {
			String selection4 = selectedDay1.getText();
			System.out.println(selection4);

			if (selection4.contains(AppointmentDate)) {
				selectedDay1.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		
		//select time slots
		
		driver.findElement(By.cssSelector("div > div.col-md-7 > div > div > div.ui-select-match.ng-scope > span")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ui-select-choices-row-1-0 > span")).click();
		
		
		Thread.sleep(2000);
		
		//confirm appointment
		driver.findElement(By.xpath("//div[@class='inline-actions center-align section_gap']/button[2]")).click();
		System.out.println("Appointment confirmed successfully");
		Thread.sleep(3000);
		
		// scrolldown
		JavascriptExecutor js46 = (JavascriptExecutor) driver;
	    js46.executeScript("window.scrollBy(0,1000)");
	    
	    //select appointment date
	    driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-default']")).click();
	    
	    //select date
	  	List<WebElement> sheduledate = driver.findElements(By.xpath("//button[@type='button' and @class='btn btn-default btn-sm']"));
	    for (WebElement selectedDay2 : sheduledate) {
			String selection5 = selectedDay2.getText();
			System.out.println(selection5);

			if (selection5.contains(AppointmentDate)) {
				selectedDay2.click();
				break;
			}
		}
	    
	    // invoice number
	    driver.findElement(By.xpath("//input[@id='invoice-number-0']")).sendKeys("IAL-73377");
	    Thread.sleep(1000);
	    
	    //INVOICE VALUE
	    driver.findElement(By.xpath("//input[@id='invoice-value-0']")).sendKeys("12500");
	    Thread.sleep(1000);
	    
	    //add packages 
	    driver.findElement(By.xpath("//div[@class='form-group col-md-6']/div/button[2]")).click();
	    Thread.sleep(1000);
	    
	    // select packages
		List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input ng-pristine ng-untouched ng-valid ng-empty']"));
        int sizes = boxes.size();
		System.out.println(sizes);

		for (int i = 0; i <=sizes; i++) {

			boxes.get(i).click();

		}
		       
        Thread.sleep(3000);
        
        //click on done button
        driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
        Thread.sleep(3000);
        
        //click on shedule dispatch
        driver.findElement(By.xpath("//div[@class='inline-actions center-align section_gap']/button[2]")).click();
		System.out.println("dispatched successfully");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
        
		
		// scrolldown
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,700)");
		
		
		//vehicle number
		Random obj = new Random();
		long seller = obj.nextInt(1000);
		String cellnum = ("KA-02-" + seller);
		driver.findElement(By.xpath("//input[@id='vehicle-number-0']")).sendKeys(cellnum);
		System.out.println(cellnum);
		
		Thread.sleep(2000);
		
		//confirm dispatch
		driver.findElement(By.xpath("//div[@class='inline-actions center-align section_gap']/button[2]")).click();
		
		
	    
	    

	}

}
