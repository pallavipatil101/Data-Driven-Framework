package testcases;

import org.testng.annotations.Test;

import actions.RadioButton;
import actions.HomePage;
import base.Base;

public class RadioButton_Test extends Base {
	public RadioButton rb = new RadioButton();
	
	@Test(priority = 0)
	public void navigate_to_radio_button() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_radioButtons();
	}
	
	@Test(priority = 1)
	public void select_radio_button() {
		rb.click_RadioButton();
		rb.verify_Radio_Result();
	}
	
	@Test(priority = 2)
	public void verifyDisabledRadio() {
		rb.verify_Disabled_Radio();
	}
}
