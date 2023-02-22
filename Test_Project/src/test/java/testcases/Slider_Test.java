package testcases;

import org.testng.annotations.Test;

import actions.Slider;
import actions.Widgets;
import base.Base;

public class Slider_Test extends Base{

	Slider sl = new Slider();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to Slider under Widgets")
	public void navigate_to_slider() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_widgets().navigate_to_slider();
		Widgets widget = new Widgets();
		widget.navigate_to_slider();
	}
	
	@Test(priority = 1, description = "Check slider location before dragging. drag the slider and check location after dragging.")
	public void drag_drop_slider() {
		sl.slider_location_before_drag();
		sl.dragSlider();
		sl.slider_location_after_drag();
	}
	
	@Test(priority = 2, description = "Verify if drag drop is successful")
	public void verify_dragdrop_successful() {
		sl.verify_dragdrop_successful();
	}
}
