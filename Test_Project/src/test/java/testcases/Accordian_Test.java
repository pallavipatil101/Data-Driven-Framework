package testcases;

import org.testng.annotations.Test;

import actions.Accordian;
import actions.HomePage;
import base.Base;

public class Accordian_Test extends Base{
	
	Accordian ac = new Accordian();
	
	@Test(priority = 0, groups = { "Navigation" } ,description = "Navigate to widgets and then navigate to accordian under it")
	public void navigate_to_accordian() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_accordian();
		//LeftPanel leftPanel = new LeftPanel();
		//leftPanel.navigate_to_widgets().navigate_to_accordian();
	}
	
	@Test(priority = 1, description = "Open heading1 and verify its text")
	public void heading1() {
		ac.click_on_heading1();
		ac.verify_heading1_text();
	}
	
	@Test(priority = 2, description = "Open heading2 and verify its text")
	public void heading2() {
		ac.click_on_heading2();
		ac.verify_heading2_text();
	}
	
	@Test(priority = 3, description = "Open heading3 and verify its text")
	public void heading3() {
		ac.click_on_heading3();
		ac.verify_heading3_text();
	}
}
