package fullfil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class demo01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/infibeam/Downloads/Selenium_setup/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sit-eks-userreg.ril.smebazaar.ooo/sso/login");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.xpath("//input[@autofocus=\"autofocus\"]")).sendKeys("sit@seller1");
        driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Ril@1234");
        driver.findElement(By.name("commit")).submit();
        Thread.sleep(1000);
        
        //select reports
        driver.findElement(By.cssSelector("#nav-menu- > ul > li:nth-child(5) > a")).click();
        Thread.sleep(1000);
        
        //select AllReports
        driver.findElement(By.cssSelector("#nav-menu- > ul > li.dropdown.ang-dropdown.open > ul > li:nth-child(1) > a")).click();
        Thread.sleep(1000);
        
        //select Type of Reports
        WebElement dropdown = driver.findElement(By.cssSelector("#generate-report > div.generate-report > div > select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Shipment Report");
//        select.selectByVisibleText("Cancellation Report");
//        select.selectByVisibleText("Returns Report");
//        select.selectByVisibleText("Unshipped Shipment Report");
//        select.selectByVisibleText("Confirmed Shipment Report");
        Thread.sleep(1000);
        
        //Select Start Date
        driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-sm pull-left uib-left\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-sm pull-left uib-left\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-sm active\"]")).click();    
        
        //select end date
        driver.findElement(By.xpath("//button[@ng-click=\"openMe('endDate')\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-sm active\"]")).click();
        Thread.sleep(3000);
        
        //give file name
        driver.findElement(By.xpath("//input[@placeholder='File Name(without extension)']")).sendKeys("Autogen4");
        Thread.sleep(1000);
        
        //click generate button
        driver.findElement(By.xpath("//button[@ng-click='generateReport()']")).click();
        Thread.sleep(1000);
        
        //refresh the page
        driver.navigate().refresh();
        Thread.sleep(1000);
        
        //click on download
        driver.findElement(By.cssSelector("#content > div > div > reports-show > div > div > div.panel-wrapper.ng-scope > iweb-list > table > tbody > tr:nth-child(1) > td:nth-child(6) > a")).click();
       }

	
}