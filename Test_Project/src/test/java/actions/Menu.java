package actions;

import base.Base;
import locators.Menu_locators;
import utilities.CommonUtilities;

public class Menu extends Base{
	Menu_locators mm = new Menu_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void hover_over_menu1() {
		cu.action().moveToElement(mm.menu1()).build().perform();
	}
	
	public void hover_over_menu3() {
		cu.action().moveToElement(mm.menu3()).build().perform();
	}
	
	public void hover_over_menu2() {
		cu.action().moveToElement(mm.menu2()).build().perform();
	}
	
	public void hover_over_menu2_item1() {
		cu.action().moveToElement(mm.menu2_Item1()).build().perform();
	}
	
	public void hover_over_menu2_item2() {
		cu.action().moveToElement(mm.menu2_Item2()).build().perform();
	}
	
	public void hover_over_submenu() {
		cu.action().moveToElement(mm.menu2_Submenu()).build().perform();
	}
	
	public void hover_over_submenu_item1() {
		cu.action().moveToElement(mm.submenu_Item1()).build().perform();
	}
	
	public void hover_over_submenu_item2() {
		cu.action().moveToElement(mm.submenu_Item2()).build().perform();
	}
}
