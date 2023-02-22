package testcases;

import org.testng.annotations.Test;

import actions.AutoComplete;
import actions.Widgets;
import base.Base;

public class AutoComplete_Test extends Base{
	AutoComplete ac = new AutoComplete();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to auto complete under Widgets")
	public void navigate_to_autocomplete() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_widgets().navigate_to_autocomplete();
		Widgets widget = new Widgets();
		widget.navigate_to_autocomplete();
	}
	
	@Test(priority = 1, description = "Enter names of two colors in first auto complete textbox")
	public void multi_colors_textbox() {
		ac.go_to_multi_colors_textbox();
		ac.select_first_color();
		ac.select_second_color();
		
	}
	
	@Test(priority = 2, description = "Enter name of one color in second auto complete textbox")
	public void single_color_textbox() {
		ac.go_to_single_color_textbox();
		ac.select_single_color();
	}
}
