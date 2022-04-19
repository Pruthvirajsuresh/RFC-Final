package chrome_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/infibeam/Downloads/Selenium_setup/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sit-eks-userreg.ril.smebazaar.ooo/sso/login");
		driver.manage().window().maximize();

		// userid
		driver.findElement(By.xpath("//input[@id='user_user_id']")).sendKeys("sit@seller60");

		// pwd
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Ril@1234");

		// login
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(2000);

		// scroll down
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollBy(0,1000)");

		// document
		driver.findElement(By.xpath(
				"//div[@class='org-links col-md-3 navbar-collapse collapse']/render-profile-section/company-profile-section/a[8]"))
				.click();
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
		
		
		// date pick button
		driver.findElement(By.cssSelector("#upload > form > div:nth-child(4) > div.right-pane > div > span > button")).click();
		Thread.sleep(2000);
		// month selection button
		driver.findElement(By.xpath("//th[@colspan='6']/button")).click();
		//year selection button
		driver.findElement(By.xpath("//th[@colspan='1']/button")).click();
		List<WebElement> years = driver.findElements(By.xpath("//button[@type='button' and @class='btn btn-default']"));
		for (WebElement year : years) {
			String selection1 = year.getText();
			System.out.println(selection1);

			if (selection1.contains("2023")) 
			{
				year.click();
				break;
			} 
		}
		
		List<WebElement> months = driver.findElements(By.xpath("//button[@type='button' and @class='btn btn-default']"));
		for (WebElement month : months) {
			String selection2 = month.getText();
			System.out.println(selection2);

			if (selection2.contains("November")) {
				month.click();
				break;
			} 
		}

		List<WebElement> days = driver.findElements(By.xpath("//button[@type='button' and @class='btn btn-default btn-sm']"));
		for (WebElement day : days) {
			String selection3 = day.getText();
			System.out.println(selection3);

			if (selection3.contains("25")) {
				day.click();
				break;
			} 
		}

	}

}
