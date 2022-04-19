package test_suite;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.Base;
import testcase_methods.User_login_;

public class Final_Seller_login_Test {

	@Test
	public void final_show() throws InterruptedException, IOException {
		Base.initiatedriver();
		User_login_.login_screen();
		Thread.sleep(2000);

	}

}
