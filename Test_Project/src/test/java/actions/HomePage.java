package actions;

import base.Base;
import locators.Home_page_locators;
import utilities.CommonUtilities;

public class HomePage extends Base {
	
	Home_page_locators hpl = new Home_page_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public Elements navigate_to_Elements() {
		cu.scroll_to_element(hpl.element());
		hpl.element().click();
		return new Elements();
	}
	
	public Forms navigate_to_forms() {
		cu.scroll_to_element(hpl.forms());
		hpl.forms().click();
		return new Forms();
	}
	
	public AlertsFramesWindows navigate_to_alert_frames_windows() {
		cu.scroll_to_element(hpl.alerts_frames_windows());
		hpl.alerts_frames_windows().click();
		return new AlertsFramesWindows();
	}
	
	public Widgets navigate_to_widgets() {
		cu.scroll_to_element(hpl.widgets());
		hpl.widgets().click();
		return new Widgets();
	}
	
	public Interactions navigate_to_interactions() {
		cu.scroll_to_element(hpl.interactions());
		hpl.interactions().click();
		return new Interactions();
	}
}
