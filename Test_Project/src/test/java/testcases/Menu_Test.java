package testcases;

import org.testng.annotations.Test;

import actions.Menu;
import actions.Widgets;
import base.Base;

public class Menu_Test extends Base {
	Menu mm = new Menu();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to Menu under Widgets")
	public void navigate_to_menu() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_widgets().navigate_to_menu();
		Widgets widget = new Widgets();
		widget.navigate_to_menu();
	}
	
	@Test(priority = 1, description = "Hover the curser over menu one")
	public void menu1() {
		mm.hover_over_menu1();
	}
	
	@Test(priority = 2, description = "Hover the curser over menu three")
	public void menu3() {
		mm.hover_over_menu3();
	}
	
	@Test(priority = 3, description = "Hover the curser over menu two and it's options")
	public void menu2() {
		mm.hover_over_menu2();
		mm.hover_over_menu2_item1();
		mm.hover_over_menu2_item2();
	}
	
	@Test(priority = 4, description = "Hover the curser over submenu of menu2 and submenu's options")
	public void hover_over_submenu() {
		mm.hover_over_submenu();
		mm.hover_over_submenu_item1();
		mm.hover_over_submenu_item2();
	}
}
