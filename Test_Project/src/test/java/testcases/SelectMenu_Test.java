package testcases;

import org.testng.annotations.Test;

import actions.SelectMenu;
import actions.Widgets;
import base.Base;

public class SelectMenu_Test extends Base{
	SelectMenu sm = new SelectMenu();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to SelectMenu under Widgets")
	public void naviagate_to_selectmenu() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_widgets().navigate_to_selectmenu();
		Widgets widget = new Widgets();
		widget.navigate_to_selectmenu();
	}
	
	@Test(priority = 1, description = "Select Aqua color from dropdown")
	public void select_dropdown() {
		sm.select_dropdown();
	}
	
	@Test(priority = 2, description = "Select Volvo and Audi from standard multi select dropdown")
	public void standard_multiselect() {
		sm.standard_multi_select();
	}
	
	@Test(priority = 3, description = "Select blue and black colors from  multi select dropdown")
	public void multi_select() {
		sm.multi_select();
	}
	
	@Test(priority = 4, description = "Select Group 2, option 1 from value dropdown ")
	public void value_dropdown() {
		sm.value_dropdown();
	}
	
	@Test(priority = 5, description = "Select Ms. from one dropdown")
	public void one_dropdown() {
		sm.one_dropdown();
	}
}
