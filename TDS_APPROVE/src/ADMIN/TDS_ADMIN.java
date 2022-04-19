package ADMIN;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TDS_ADMIN {

	public static void main(String[] args) throws InterruptedException {
		//open admin page
        System.setProperty("webdriver.chrome.driver","/home/infibeam/Downloads/Selenium_setup/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://sitohs.jio.com:4443/jiosso/SSOLogin.jsp?bmctx=E6E441B2948AF2024B15447F896466FA7F215B177782E437B73A38279C396C74&contextType=external&username=string&password=secure_string&challenge_url=https%3A%2F%2Fsitohs.jio.com%3A4443%2Fjiosso%2FSSOLogin.jsp&request_id=4645604049720549508&authn_try_count=0&locale=en_GB&resource_url=%252Fuser%252Floginsso");
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		
		//LOGIN
	
		
		

	}

}
