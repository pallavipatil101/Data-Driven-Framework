package actions;

import org.testng.Assert;
import base.Base;
import locators.Slider_locators;
import utilities.CommonUtilities;

public class Slider extends Base{
	CommonUtilities cu = new CommonUtilities();
	Slider_locators sl = new Slider_locators();
	public String locationBefore;
	public String locationAfter;
	
	public void slider_location_before_drag() {
		locationBefore = sl.sliderValue().getAttribute("value");
	}
	
	public void dragSlider() {
		cu.action().dragAndDropBy(sl.sliderButton(), 70, 0).build().perform();
	}
	
	public void slider_location_after_drag() {
		cu.waitImplicitly();
		locationAfter = sl.sliderValue().getAttribute("value");
	}
	
	public void verify_dragdrop_successful() {
		Assert.assertNotEquals(locationBefore, locationAfter);
	}
}
