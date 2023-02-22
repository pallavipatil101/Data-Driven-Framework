package actions;

import locators.LeftPanel_Locators;
import utilities.CommonUtilities;

public class LeftPanel {
	CommonUtilities cu = new CommonUtilities();
	LeftPanel_Locators leftPanel = new  LeftPanel_Locators();

	public Forms navigate_to_forms()
	{
		cu.scroll_to_element(leftPanel.forms());
		leftPanel.forms().click();
		return new Forms();
	}
	
	public AlertsFramesWindows navigate_to_alertframeswindows() {
		cu.scroll_to_element(leftPanel.alertFrameWindows());
		leftPanel.alertFrameWindows().click();
		return new AlertsFramesWindows();
	}
	
	public Widgets navigate_to_widgets() {
		cu.scroll_to_element(leftPanel.widgets());
		leftPanel.widgets().click();
		return new Widgets();
	}
	
	public Interactions navigate_to_interaction() {
		cu.scroll_to_element(leftPanel.interactions());
		leftPanel.interactions().click();
		return new Interactions();
	}
	
}
