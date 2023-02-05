package actions;

import base.Base;
import locators.AlertsFramesWindows_page_locators;
import utilities.CommonUtilities;

public class AlertsFramesWindows extends Base{
	AlertsFramesWindows_page_locators afw = new AlertsFramesWindows_page_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public Windows navigate_to_windows() {
		cu.scroll_to_element(afw.windows());
		afw.windows().click();
		return new Windows();
	}
	
	public Alerts navigate_to_alerts() {
		cu.scroll_to_element(afw.alerts());
		afw.alerts().click();
		return new Alerts();
	}
	
	public Frames navigate_to_frames() {
		cu.scroll_to_element(afw.frames());
		afw.frames().click();
		return new Frames();
	}
	
	public NestedFrames navigate_to_nested_frames() {
		cu.scroll_to_element(afw.nested_frames());
		afw.nested_frames().click();
		return new NestedFrames();
	}
	
	public Modals navigate_to_modals() {
		cu.scroll_to_element(afw.modals());
		afw.modals().click();
		return new Modals();
	}
}
