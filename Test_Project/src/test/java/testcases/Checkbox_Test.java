package testcases;

import org.testng.annotations.Test;

import actions.CheckBox;
import actions.Elements;
import base.Base;

public class Checkbox_Test extends Base{
	public CheckBox cb = new CheckBox();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to checkbox under Elements")
	public void navigate_to_checkbox() {
		//HomePage hp = new HomePage();	
		//hp.navigate_to_Elements().navigate_to_checkbox();
		Elements el = new Elements();
		el.navigate_to_checkbox();
	}
	
	@Test(priority = 1, description = "Check the checkbox and verify if the action is successful")
	public void checkbox() {
		cb.click_Checkbox();
		cb.verify_Selected_CheckBox();
	}
}
