package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.Sortable;
import base.Base;

public class Sortable_Test extends Base{
	Sortable so = new Sortable();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Naviagate to Interactions and then naviagte to Sortable")
	public void navigate_to_sortable() {
		HomePage hp = new HomePage();
		hp.navigate_to_interactions().navigate_to_sortable();
		//LeftPanel leftPanel = new LeftPanel();
		//leftPanel.navigate_to_interaction().navigate_to_sortable();
	}
	
	@Test(priority = 1, description = "Switch to grid view and verify grid elements")
	public void grid() {
		so.switch_to_grid();
		so.verify_grid_elements();
	}
	
	@Test(priority = 2, description = "Switch to list view and verify list elements")
	public void list() {
		so.switch_to_list();
		so.verify_list_elements();
	}
}
