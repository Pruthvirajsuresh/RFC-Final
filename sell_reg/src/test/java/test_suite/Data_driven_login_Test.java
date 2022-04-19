package test_suite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page_objects.Login_page;
import testcase_methods.User_login_;

public class Data_driven_login_Test {

	public static WebDriver driver;

	private Logger log = LogManager.getLogger(User_login_.class.getName());

	@Test(dataProvider = "credentails")
	public void login_screen(String Scenario, String Username, String Password)
			throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/infibeam/Downloads/Selenium_setup/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://sit-eks-userreg.ril.smebazaar.ooo/sso/login");

		Login_page lp = new Login_page(driver);

		lp.get_user_name().sendKeys(Username);
		log.info("user id entered");

		lp.get_user_pwd().sendKeys(Password);
		log.info("password enetered");

		lp.get_login_btn().click();
		log.info("clicked on login button");

		if (Scenario.equals("both_correct")) {
			String url1 = driver.getCurrentUrl();
			log.info("Actual url is " + url1);
			String url2 = "https://sit-eks-userreg.ril.smebazaar.ooo/seller_profile";
			if (url1.matches(url2)) {
				log.info("Seller loged in successfully");
			} else {

				log.error("login failed");
			}

		} else if (Scenario.equals("both_wrong")) {
			String error_message = driver.findElement(By.xpath("//div[@class='errors red']")).getText();
			log.info("both_wrong " + error_message);
			Assert.assertEquals(error_message, "Invalid User or password.");

		} else if (Scenario.equals("correct_username")) {

			String error_message = driver.findElement(By.xpath("//div[@class='errors red']")).getText();
			log.info("correct_username " + error_message);
			Assert.assertEquals(error_message, "Invalid User or password.");

		} else if (Scenario.equals("correct_password")) {

			String error_message = driver.findElement(By.xpath("//div[@class='errors red']")).getText();
			log.info("correct_password " + error_message);
			Assert.assertEquals(error_message, "Invalid User or password.");
		}
		driver.quit();

	}

	@DataProvider(name = "credentails")
	public Object[][] getData() {
		return new Object[][] { { "both_correct", "sit@seller60", "Ril@1234" },
				{ "both_wrong", "automatedseller", "pu@tu" }, { "correct_username", "seller1", "Pruthvi@1234" },
				{ "correct_password", "sellernon", "Ril@1234" } };
	}

}
