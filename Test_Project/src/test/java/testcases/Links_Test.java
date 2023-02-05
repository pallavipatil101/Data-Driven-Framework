package testcases;

import org.testng.annotations.Test;

import actions.Links;
import actions.HomePage;
import base.Base;

public class Links_Test extends Base {
	public Links link = new Links();
	
	@Test(priority = 0)
	public void navigateToLinks() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_links();
	}
	
	@Test(priority = 1)
	public void clickLinks() {
		link.click_Links();
	}
}
