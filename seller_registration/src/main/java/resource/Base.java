package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());

	public static WebDriver driver;
	public static Properties prop;

	public WebDriver initiatedriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/resource/data.properties");
		prop.load(fis);

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/infibeam/Downloads/Selenium_setup/chromedriver");
			driver = new ChromeDriver();

		}

		else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/infibeam/Downloads/Selenium_setup/geckodriver");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

	@BeforeClass
	public void setup() throws IOException, InterruptedException {

		// initiate browser
		driver = initiatedriver();
		log.info("Browser initiated successfully");

		driver.get(prop.getProperty("url"));
		log.info("landed on registration page");

	}

	@AfterClass

	public void teardown() {

		driver.close();
		log.info("Browser closed");
		log.info("============================================================");

	}

	public static void screenshot(String FileName) throws IOException {
		TakesScreenshot scr = ((TakesScreenshot) driver);
		File file1 = scr.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file1,
				new File("/home/infibeam/eclipse-workspace/seller_registration/screenshots/shots" + FileName + ".jpg"));
		System.out.println("Screenshot of the test is taken");
	}

}
