package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.Modals;
import base.Base;

public class Modals_Test extends Base{
	Modals md = new Modals();
	
	@Test(priority = 0)
	public void navigate_to_modal_dialogs() {
		HomePage hp = new HomePage();
		hp.navigate_to_alert_frames_windows().navigate_to_modals();
	}
	
	@Test(priority = 1)
	public void small_modal() {
		md.open_small_modal();
		md.verify_small_modal_text();
		md.close_small_modal();
	}
	
	@Test(priority = 2)
	public void large_modal() {
		md.open_large_modal();
		md.verify_large_modal_text();
		md.close_large_modal();
	}
}
