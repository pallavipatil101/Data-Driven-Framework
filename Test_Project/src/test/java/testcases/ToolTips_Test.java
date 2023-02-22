package testcases;

import org.testng.annotations.Test;

import actions.ToolTips;
import actions.Widgets;
import base.Base;

public class ToolTips_Test extends Base{
	ToolTips tt = new ToolTips();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to tooltips under Widgets")
	public void navigate_to_tooltips() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_widgets().navigate_to_tooltips();
		Widgets widget = new Widgets();
		widget.navigate_to_tooltips();
	}
	
	@Test(priority = 1, description = "Hover curser over button")
	public void hover_over_button() {
		tt.hover_over_button();
	}
	
	@Test(priority = 2, description = "Hover curser over textbox")
	public void hover_over_textbox() {
		tt.hover_over_textbox();
	}
}
