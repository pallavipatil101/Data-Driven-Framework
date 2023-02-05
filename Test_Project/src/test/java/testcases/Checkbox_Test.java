package testcases;

import org.testng.annotations.Test;
import actions.CheckBox;
import actions.HomePage;
import base.Base;

public class Checkbox_Test extends Base{
	public CheckBox cb = new CheckBox();
	
	@Test(priority = 0)
	public void navigate_to_checkbox() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_checkbox();
	}
	
	@Test(priority = 1)
	public void checkbox() {
		cb.click_Checkbox();
		cb.verify_Selected_CheckBox();
	}
}
