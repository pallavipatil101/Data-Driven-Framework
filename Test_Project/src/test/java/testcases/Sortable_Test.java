package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.Sortable;
import base.Base;

public class Sortable_Test extends Base{
	Sortable so = new Sortable();
	
	@Test(priority = 0)
	public void navigate_to_sortable() {
		HomePage hp = new HomePage();
		hp.navigate_to_interactions().navigate_to_sortable();
	}
	
	@Test(priority = 1)
	public void grid() {
		so.switch_to_grid();
		so.verify_grid_elements();
	}
	
	@Test(priority = 2)
	public void list() {
		so.switch_to_list();
		so.verify_list_elements();
	}
}
