package catalogue_creation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.UUID;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class catalogue {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","/home/sharath/Downloads/Selenium_setupp/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sit-eks-userreg.ril.smebazaar.ooo/sso/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//login details
		driver.findElement(By.id("user_user_id")).sendKeys("Pruthviraj@007");
		driver.findElement(By.id("user_password")).sendKeys("9535Putu@1517");
		driver.findElement(By.name("commit")).submit();
		Thread.sleep(2000);
//		//selecting product
//		driver.findElement(By.cssSelector("#nav-menu- > ul > li:nth-child(3) > a")).click();
//		Thread.sleep(1000);
//		//choosing offering
//		driver.findElement(By.xpath("//a[@class='dropdown-toggle ']")).click();
//		Thread.sleep(1000);
//		  //choosing add new option
//		  driver.findElement(By.cssSelector("#nav-menu- > ul > li.dropdown.ang-dropdown.open > ul > li.dropdown.ang-dropdown.open > ul > li:nth-child(2) > a")).click();
//		Thread.sleep(1000);
//		//passing input to search catagory
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("clinwink4");
//		Thread.sleep(2000);
//		   //selecting catagory
//		   driver.findElement(By.xpath("//a[@tabindex=\"-1\"]")).click();  
//		   //scroll down
//		   Thread.sleep(3000);
//		   JavascriptExecutor js = (JavascriptExecutor) driver;
//		   js.executeScript("window.scrollBy(0,25)");
//		   
//		   //selecting Brand
//		   Select Brand = new Select(driver.findElement(By.xpath("//select[@name=\"brand\"]")));
//		   Brand.selectByIndex(1);
//		   //passing product code generating random number
//		   String uuid = UUID.randomUUID().toString();
//		   driver.findElement(By.xpath("//input[@ng-model=\'catSvc.data.catalog.catalog_details.site_sku.value\']")).sendKeys(uuid);
//		   //clicking random number
//		   driver.findElement(By.name("model")).click();//
//		   // pop up message ok
//		   Thread.sleep(1000);
//		   driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-success.ng-binding")).click();
//		   //passing Model name 1
//		   driver.findElement(By.name("model")).sendKeys(uuid);
//		   //passing product name
//		   driver.findElement(By.name("title")).sendKeys("jamun");
//		   //Scrolling down
//		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		   js1.executeScript("window.scrollBy(0,700)");
//		   //Description text field
//		   driver.findElement(By.xpath("//div[@ta-bind=\"ta-bind\"]")).sendKeys("the product contains");
//		   //HSN
//		   driver.findElement(By.xpath("//input[@placeholder=\"Type to get suggestions\"]")).sendKeys("00003204");
//		Thread.sleep(1000);
//		//selecting HSN
//		   driver.findElement(By.xpath("//a[@class=\"ng-binding ng-scope\"]")).click();
//		   //passing Ean
//		   Random obj= new Random();
//		   long rgen1= obj.nextInt(1000000000);
//		   String cellnum = ("07" + rgen1);
//		        driver.findElement(By.name("validate_ean_0")).sendKeys(cellnum);
//		        //submit button
//		        driver.findElement(By.xpath("//button[@class=\"btn btn-primary ng-scope ng-isolate-scope\"]")).click();
//		       
//		       
//		       
//		        //scrolling to the top page
//		        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		   js2.executeScript("window.scrollTo(0,800)");
//		   Thread.sleep(1000);
//		       
//		        driver.findElement(By.xpath("//input[@type=\"url\"]")).sendKeys("https://www.youtube.com/");
//		       
//		        //driver.findElement(By.xpath("#accordiongroup-252-3576-panel > div > fieldset > div:nth-child(4) > div.col-md-6 > tags-input > div > div > input")).sendKeys("puma");
//		        //key feature
//		        driver.findElement(By.name("key_feature_0")).sendKeys("the product contains");
//		        //manufacturer
//		        driver.findElement(By.name("managers")).sendKeys("qwerty");
//		        Thread.sleep(1000);
//		        driver.findElement(By.xpath("//a[@ng-bind-html=\"match.label | uibTypeaheadHighlight:query\"]")).click();
//		        Thread.sleep(3000);
//		        //manufacutre adress
//		        driver.findElement(By.cssSelector("manufacturing-addresses-mapping > div.row.ng-scope > div.col-md-6 > input")).click();
//		        Thread.sleep(1000);
//		        driver.findElement(By.xpath("//a[@tabindex=\"-1\"]")).click();
//		        //Importer
//		        driver.findElement(By.cssSelector("importer-mapping > div > div.col-md-6 > input")).sendKeys("amazon");
//		        Thread.sleep(1000);
//		        driver.findElement(By.xpath("//a[@tabindex=\"-1\"]")).click();
//		        //marketed by
//		        driver.findElement(By.cssSelector("marketer-mapping > div > div.col-md-6 > input")).sendKeys("sample");
//		        Thread.sleep(1000);
//		        driver.findElement(By.xpath("//a[@tabindex=\"-1\"]")).click();
//		        //Package dimension
//		        driver.findElement(By.xpath("//div[@ng-class=\"{'fa-chevron-circle-down': catSvc.status.isPacDimOpen, 'fa-chevron-circle-right': !catSvc.isPacDimOpen}\"]")).click();
//		       
//		        driver.findElement(By.name("length_value")).sendKeys("10");
//		        driver.findElement(By.name("width_value")).sendKeys("10");
//		        driver.findElement(By.name("height_value")).sendKeys("10");
//		        driver.findElement(By.name("depth_value")).sendKeys("10");
//		        driver.findElement(By.name("weight_value")).sendKeys("10");
//		        driver.findElement(By.name("volumetric_weight_value")).sendKeys("10");
//		       
//		        //Item dimension
//		        driver.findElement(By.xpath("//div[@ng-class=\"{'fa-chevron-circle-down': catSvc.isItemDimOpen, 'fa-chevron-circle-right': !catSvc.isItemDimOpen}\"]")).click();
//		       
//		        driver.findElement(By.xpath("//input[@ng-model=\"item.length.value\"]")).sendKeys("20");
//		        driver.findElement(By.xpath("//input[@ng-model=\"item.width.value\"]")).sendKeys("20");
//		        driver.findElement(By.xpath("//input[@ng-model=\"item.height.value\"]")).sendKeys("20");
//		        driver.findElement(By.xpath("//input[@ng-model=\"item.depth.value\"]")).sendKeys("20");
//		        driver.findElement(By.xpath("//input[@ng-model=\"item.net_weight.value\"]")).sendKeys("20");
//		        driver.findElement(By.xpath("//input[@ng-model=\"item.volume.value\"]")).sendKeys("20");
//		       
//		        //Is food  and all check box
//		        driver.findElement(By.cssSelector("div:nth-child(13) > div.col-sm-6.tool-tip-wrap > input")).click();
//		        driver.findElement(By.cssSelector("div.col-sm-6.tool-tip-wrap > label:nth-child(1) > input")).click();
//		        driver.findElement(By.cssSelector("div:nth-child(15) > div.col-sm-6.tool-tip-wrap > input")).click();
//		        driver.findElement(By.cssSelector("div:nth-child(16) > div.col-sm-6.tool-tip-wrap > input")).click();
//		       
//		        //Disclaimer
//		        driver.findElement(By.name("address")).sendKeys("the product contains so and soooooo");
//		        driver.findElement(By.name("care_instructions")).sendKeys("the product contains so and soooooo");
//		        driver.findElement(By.name("safety_warning")).sendKeys("the product contains so and soooooo");
//		        driver.findElement(By.name("safety_rating")).sendKeys("5");
//		        //Submit button
//		        driver.findElement(By.cssSelector("fieldset > div:nth-child(21) > div > button")).click();
//		        Thread.sleep(1000);
//		        //2nd section Completed
//		        //3rd section
//		        //title
//		        driver.findElement(By.cssSelector("div:nth-child(1) > div.col-sm-6.tool-tip-wrap > input")).sendKeys("Iphone 8S");
//		        //Variant SKU
//		        driver.findElement(By.cssSelector("fieldset > div > div > div:nth-child(2) > div.col-sm-6.tool-tip-wrap > input")).sendKeys(uuid);
//		        //Sku
//		        driver.findElement(By.cssSelector("stock-details > ng-form > fieldset > div:nth-child(1) > div.col-sm-6 > input")).sendKeys(uuid);
//		        //Vendor
//		        // driver.findElement(By.xpath("//input[@ng-model=\"variant.stock.vendor.value\"]")).click();
//		        //Thread.sleep(1000);
//		        //driver.findElement(By.xpath("//a[@tabindex=\"-1\"]")).click();
//		        //MRP
//		        driver.findElement(By.name("base_price")).sendKeys("1000");
//		        //offer price
//		        driver.findElement(By.name("wsp")).sendKeys("20");
//		        //warrenty
//		        driver.findElement(By.xpath("//input[@ng-model=\"variant.stock.warranty.value\"]")).sendKeys("3 years");
//		        //Batch number
//		        driver.findElement(By.xpath("//input[@ng-model=\"variant.stock.batch_number.value\"]")).sendKeys("564215457");
//		        //quantity
//		        driver.findElement(By.cssSelector("inventory-field > div > div.with_manage_inventory.ng-scope > div.row.ng-scope > div.col-sm-6.tool-tip-wrap > input")).sendKeys("100");
//		        //low stock threshold
//		        driver.findElement(By.cssSelector("inventory > div > inventory-field > div > div.with_manage_inventory.ng-scope > div:nth-child(2) > div.col-sm-6.tool-tip-wrap > input")).sendKeys("1");
//		        //Minimum order quantity
//		        driver.findElement(By.cssSelector("inventory > div > inventory-field > div > div:nth-child(5) > div.col-sm-6.tool-tip-wrap > input")).sendKeys("1");
//		        //maximum order quantity
//		        driver.findElement(By.cssSelector("div.show_inventory.ng-scope > inventory > div > inventory-field > div > div:nth-child(6) > div.col-sm-6.tool-tip-wrap > input")).sendKeys("10");        
//		   //mulitiplier
//		        driver.findElement(By.name("multiplier")).sendKeys("1");
//		        //shel life
//		        driver.findElement(By.name("shelf_life_value")).sendKeys("1");
//		        driver.findElement(By.name("shelf_life_unit")).click();
//		        Thread.sleep(1000);
//		        Select Shelf = new Select(driver.findElement(By.xpath("//select[@name=\"shelf_life_unit\"]")));
//		   Shelf.selectByIndex(3);
//		   //shipping cost
//		   driver.findElement(By.name("base_price")).sendKeys("10");
//		   //time to ship
//		   driver.findElement(By.name("shipping_time_min")).sendKeys("1");
//		   driver.findElement(By.name("shipping_time_max")).sendKeys("5");
//		   driver.findElement(By.name("shipping_time_unit_select")).click();
//		   Thread.sleep(1000);
//		   Select shipping_time = new Select(driver.findElement(By.xpath("//select[@name=\"shipping_time_unit_select\"]")));
//		   shipping_time.selectByIndex(1);
//		   //Lead time to source
//		   driver.findElement(By.name("availability_min")).sendKeys("1");
//		   driver.findElement(By.name("availability_max")).sendKeys("5");
//		   driver.findElement(By.name("availability_time_unit_select")).click();
//		   Thread.sleep(1000);
//		   Select availability_time = new Select(driver.findElement(By.xpath("//select[@name=\"availability_time_unit_select\"]")));
//		   availability_time.selectByIndex(1);
//		   //notes
//		   driver.findElement(By.xpath("//input[@ng-model=\"variant.stock.warehouses_details.value\"]")).sendKeys("contains nothing");
//		   //country of origin
//		   driver.findElement(By.cssSelector("fieldset > div.show_inventory.ng-scope > inventory > div > inventory-field > div > div:nth-child(16) > div.col-sm-6.tool-tip-wrap > div > div:nth-child(1) > input")).click();
//		   driver.findElement(By.cssSelector("#ui-select-choices-row-0-0 > span > div")).click();
//		   //submit
//		   driver.findElement(By.cssSelector("fieldset > variant-details > div > div > stock-details > ng-form > div > div > button")).click();
//		        driver.findElement(By.cssSelector("fieldset > variant-details > div > div > div > div > div > div > span > button")).click();      
//		   
//		        //////4 th section
//		        Thread.sleep(3000);
//		        driver.findElement(By.cssSelector("fieldset > div:nth-child(2) > form-builder > div > div > div > fieldset > div:nth-child(2) > div > div.col-md-8.tp-field-input > div > element > div > input")).sendKeys("654214354");
//		        driver.findElement(By.cssSelector("#C9725B")).click();
//		        driver.findElement(By.cssSelector("fieldset > div:nth-child(3) > div > button")).click();
//		       
//		        //5th section
//		       
//		        JavascriptExecutor js10 = (JavascriptExecutor) driver;
//		   js10.executeScript("window.scrollTo(0,800)");
//		   Thread.sleep(1000);
//		   
//		   //add image big section
//		   Robot robot = new Robot();
//		   driver.findElement(By.cssSelector("fieldset > catalog-images > div > div:nth-child(2) > catalog-group-images > div > div.img-upload-wrapper.ng-scope > button")).click();    
//		   Thread.sleep(2000);
//		   StringSelection stringSelection = new StringSelection("/home/sharath/Documents/test/date 4.jpg");
//		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null );
//		   Thread.sleep(1000);
//		   robot.keyPress(KeyEvent.VK_CONTROL);
//		   robot.keyPress(KeyEvent.VK_V);
//		   
//		   robot.keyRelease(KeyEvent.VK_CONTROL);
//		   robot.keyRelease(KeyEvent.VK_V);
//		   
//		   Thread.sleep(1000);
//		   robot.keyPress(KeyEvent.VK_ENTER);
//		   robot.keyRelease(KeyEvent.VK_ENTER);
//		   Thread.sleep(4000);
//		   
//		   //Final submit
//		   driver.findElement(By.xpath("//button[@ng-if=\"(catSvc.data.mode == 'catalog_edit') || !catSvc.data.section_details.image_section.disabled\"]")).click();
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//button[@ng-if=\"(catSvc.data.mode == 'catalog_edit') || !catSvc.data.section_details.image_section.disabled\"]")).click();
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//input[@ng-click=\"catSvc.publishCatalog(forms.catalogform)\"]")).click();
		 
		         
		       
		}

	

	}

