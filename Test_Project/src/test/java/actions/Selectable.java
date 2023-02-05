package actions;

import org.openqa.selenium.WebElement;

import base.Base;
import locators.Selectable_locators;
import utilities.CommonUtilities;

public class Selectable extends Base {
	Selectable_locators sl = new Selectable_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void select_all_list_options() {
		for(WebElement opt : sl.selectableListElements())
		{
			cu.scroll_to_element(opt);
			opt.click();
		}
	}
	
	public void switch_to_grid() {
		for(WebElement tab : sl.selectableTabsList())
		{
			if(tab.getText().equals("Grid"))
			{
				tab.click();
			}
		}
	}
	
	public void verify_grid_options() {
		cu.isTrue(sl.selectableGridElements().size()==9);
	}
	
	public void select_all_grid_options() {
		for(WebElement opt : sl.selectableGridElements())
		{
			cu.scroll_to_element(opt);
			opt.click();
		}
	}
}
