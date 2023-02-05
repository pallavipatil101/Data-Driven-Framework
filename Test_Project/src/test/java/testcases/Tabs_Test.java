package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.Tabs;
import base.Base;

public class Tabs_Test extends Base{
	Tabs t = new Tabs();
	
	@Test(priority = 0)
	public void navigate_to_tabs() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_tabs();
	}
	
	@Test(priority = 1)
	public void switch_tabs() {
		t.switchTabs();
	}
}
