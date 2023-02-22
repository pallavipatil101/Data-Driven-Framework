package testcases;

import org.testng.annotations.Test;

import actions.Elements;
import actions.RadioButton;
import base.Base;

public class RadioButton_Test extends Base {
	public RadioButton rb = new RadioButton();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Naviagate to Radio Buttons under Elements")
	public void navigate_to_radio_button() {
		//HomePage hp = new HomePage();	
		//hp.navigate_to_Elements().navigate_to_radioButtons();
		Elements el = new Elements();
		el.navigate_to_radioButtons();
	}
	
	@Test(priority = 1, description = "Click on a radio button and verify if its selected")
	public void select_radio_button() {
		rb.click_RadioButton();
		rb.verify_Radio_Result();
	}
	
	@Test(priority = 2, description = "Verify if disabled radio button is really disabled")
	public void verifyDisabledRadio() {
		rb.verify_Disabled_Radio();
	}
}
