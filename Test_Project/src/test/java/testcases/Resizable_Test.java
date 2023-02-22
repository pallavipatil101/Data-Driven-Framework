package testcases;

import org.testng.annotations.Test;

import actions.Interactions;
import actions.Resizable;
import base.Base;

public class Resizable_Test extends Base{
	Resizable re = new Resizable();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to resizable under Interactions")
	public void navigate_to_resizable() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_interactions().navigate_to_resizable();
		Interactions in = new Interactions();
		in.navigate_to_resizable();
	}
	
	@Test(priority = 1, description = "Resize the webelement inside container")
	public void resize_box_contained() {
		re.resizable_box_contained();
	}
	
	@Test(priority = 2, description = "Resize the webelement on page")
	public void resize_page_contained() {
		re.resizable_page_contained();
	}
}
