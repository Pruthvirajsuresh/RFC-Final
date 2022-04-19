package test_suite;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.State_selection_page;
import resource.Base;

public class State_Selection_Test extends Base {

	@Test
	public void state_select() throws IOException, InterruptedException {

		State_selection_page ss = new State_selection_page(driver);

		// url validation

		String state_select_url = driver.getCurrentUrl();
		Thread.sleep(1000);

		if (state_select_url.equalsIgnoreCase("https://sit-eks-userreg.ril.smebazaar.ooo/rfc/new")) {

			Assert.assertTrue(true);
			log.info("successfully redirected to state selection page");

		} else {

			log.error("page not redirected to state selection page");
		}

		// confirm that caution message is displayed

		String suggestion_msg = ss.get_Caution_message().getText();

		if (suggestion_msg
				.equalsIgnoreCase("*You can only select the state(s) where your business/company is GST registered")) {

			log.info("Caution message is displayed stating " + suggestion_msg);

		} else {

			log.error("Caution message is not displayed");
		}

		// select state
		List<WebElement> radioButtons = ss.get_State_radio_btns();
		for (WebElement radio : radioButtons) {

			String name_of_the_states = radio.getText();
			System.out.println(name_of_the_states);

			if (name_of_the_states.contains("MAHARASHTRA")) {
				radio.click();
				log.info("selected state is " + prop.getProperty("RFC_State"));
			}
		}

		Thread.sleep(1000);
		screenshot("state_select");

		// submit button
		ss.get_submit_btn().click();
		log.info("clicked on submit button");
		log.info("===========================================");

	}
}
