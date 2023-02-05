package testcases;

import org.testng.annotations.Test;

import actions.Alerts;
import actions.HomePage;
import base.Base;

public class Alerts_Test extends Base{
	Alerts a = new Alerts();
	
	@Test(priority = 0)
	public void navigate_to_alerts() {
		HomePage hp = new HomePage();
		hp.navigate_to_alert_frames_windows().navigate_to_alerts();
	}
	
	@Test(priority = 1)
	public void handle_simple_alert() {
		a.click_on_simple_alert();
		a.handle_simple_alert();
	}

	@Test(priority = 2)
	public void handle_delay_alert() {
		a.click_on_delay_alert();
		a.handle_delay_alert();
	}
	
	@Test(priority = 3)
	public void handle_confirm_alert() {
		a.click_on_confirm_alert();
		a.handle_confirm_alert();
		a.verify_confirm_alert_msg();
	}
	
	@Test(priority = 4)
	public void handle_prompt_alert() {
		a.click_on_prompt_alert();
		a.handle_prompt_alert();
		a.verify_prompt_alert_msg();
	}
}
