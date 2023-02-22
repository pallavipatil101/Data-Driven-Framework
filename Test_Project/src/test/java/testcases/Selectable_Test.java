package testcases;

import org.testng.annotations.Test;

import actions.Interactions;
import actions.Selectable;
import base.Base;

public class Selectable_Test extends Base{
	Selectable se = new Selectable();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Naviagate to Selectable under Interactions")
	public void navigate_to_selectable() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_interactions().navigate_to_selectable();
		Interactions in = new Interactions();
		in.navigate_to_selectable();
	}
	
	@Test(priority = 1, description = "Select all list options")
	public void select_all_list_options() {
		se.select_all_list_options();
	}
	
	@Test(priority = 2, description = "Switch to grid & select all grid options")
	public void switch_to_grid() {
		se.switch_to_grid();
		se.verify_grid_options();
		se.select_all_grid_options();
	}
}
