package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.ToolTips;
import base.Base;

public class ToolTips_Test extends Base{
	ToolTips tt = new ToolTips();
	
	@Test(priority = 0)
	public void navigate_to_tooltips() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_tooltips();
	}
	
	@Test(priority = 1)
	public void hover_over_button() {
		tt.hover_over_button();
	}
	
	@Test(priority = 2)
	public void hover_over_textbox() {
		tt.hover_over_textbox();
	}
}
