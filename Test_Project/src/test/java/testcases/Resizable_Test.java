package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.Resizable;
import base.Base;

public class Resizable_Test extends Base{
	Resizable re = new Resizable();
	
	@Test(priority = 0)
	public void navigate_to_resizable() {
		HomePage hp = new HomePage();
		hp.navigate_to_interactions().navigate_to_resizable();
	}
	
	@Test(priority = 1)
	public void resize_box_contained() {
		re.resizable_box_contained();
	}
	
	@Test(priority = 2)
	public void resize_page_contained() {
		re.resizable_page_contained();
	}
}
