package testcases;

import org.testng.annotations.Test;

import actions.Elements;
import actions.Links;
import base.Base;

public class Links_Test extends Base {
	public Links link = new Links();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to Links under Elements")
	public void navigateToLinks() {
		//HomePage hp = new HomePage();	
		//hp.navigate_to_Elements().navigate_to_links();
		Elements el = new Elements();
		el.navigate_to_links();
	}
	
	@Test(priority = 1, description = "Click the links and navigate back to original page")
	public void clickLinks() {
		link.click_Links();
	}
}
