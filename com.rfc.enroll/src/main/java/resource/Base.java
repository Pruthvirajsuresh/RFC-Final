package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver initiatedriver() throws IOException {

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
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

	public static void screenshot(String FileName) throws IOException {

		TakesScreenshot scr = ((TakesScreenshot) driver);
		File file1 = scr.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file1,
				new File("/home/infibeam/eclipse-workspace/com.rfc.enroll/screenshots/shots_" + FileName + ".jpg"));
		System.out.println("Screenshot of the test is taken");

	}

	public static boolean isValidGSTIN(String str) {
		// Regex to check valid IFSC Code.
		String regex = "^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// return false
		if (str == null) {
			return false;
		}

		// Pattern class contains matcher()
		// method to find matching between
		// the given string and
		// the regular expression.
		Matcher m = p.matcher(str);

		// Return if the string
		// matched the ReGex
		return m.matches();

	}

}
