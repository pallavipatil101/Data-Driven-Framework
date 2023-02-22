package testcases;

import org.testng.annotations.Test;

import actions.Tabs;
import actions.Widgets;
import base.Base;

public class Tabs_Test extends Base{
	Tabs t = new Tabs();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to Tabs under Widgets")
	public void navigate_to_tabs() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_widgets().navigate_to_tabs();
		Widgets widget = new Widgets();
		widget.navigate_to_tabs();
	}
	
	@Test(priority = 1, description = "Switch between the tabs")
	public void switch_tabs() {
		t.switchTabs();
	}
}
