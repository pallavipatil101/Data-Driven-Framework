package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.Slider;
import base.Base;

public class Slider_Test extends Base{

	Slider sl = new Slider();
	
	@Test(priority = 0)
	public void navigate_to_slider() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_slider();
	}
	
	@Test(priority = 1)
	public void drag_drop_slider() {
		sl.slider_location_before_drag();
		sl.dragSlider();
		sl.slider_location_after_drag();
	}
	
	@Test(priority = 2)
	public void verify_dragdrop_successful() {
		sl.verify_dragdrop_successful();
	}
}
