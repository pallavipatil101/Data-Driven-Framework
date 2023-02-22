package testcases;

import org.testng.annotations.Test;

import actions.AlertsFramesWindows;
import actions.Modals;
import base.Base;

public class Modals_Test extends Base{
	Modals md = new Modals();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to modals under AlertsFramesWindows")
	public void navigate_to_modal_dialogs() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_alert_frames_windows().navigate_to_modals();
		AlertsFramesWindows modal = new AlertsFramesWindows();
		modal.navigate_to_modals();
	}
	
	@Test(priority = 1, description = "Open small modal. verify it's text. close small modal")
	public void small_modal() {
		md.open_small_modal();
		md.verify_small_modal_text();
		md.close_small_modal();
	}
	
	@Test(priority = 2, description = "Open large modal. verify it's text. close large modal")
	public void large_modal() {
		md.open_large_modal();
		md.verify_large_modal_text();
		md.close_large_modal();
	}
}
