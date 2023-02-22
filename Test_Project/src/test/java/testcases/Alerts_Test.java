package testcases;

import org.testng.annotations.Test;

import actions.Alerts;
import actions.HomePage;
import base.Base;

public class Alerts_Test extends Base{
	Alerts a = new Alerts();

	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to AlertsFramesWindos & then to Alerts")
	public void navigate_to_alerts() {
		HomePage hp = new HomePage();
		hp.navigate_to_alert_frames_windows().navigate_to_alerts();
		//LeftPanel leftPanel = new LeftPanel();
		//leftPanel.navigate_to_alertframeswindows().navigate_to_alerts();
	}
	
	@Test(priority = 1, description = "Open simple alert and Handle it")
	public void handle_simple_alert() {
		a.click_on_simple_alert();
		a.verify_simple_alert_present();
		a.handle_simple_alert();
	}

	@Test(priority = 2, description = "Open delay alert and Handle it")
	public void handle_delay_alert() {
		a.click_on_delay_alert();
		a.verify_delay_alert_present();
		a.handle_delay_alert();
	}
	
	@Test(priority = 3, description = "Open confirm alert and Handle it")
	public void handle_confirm_alert() {
		a.click_on_confirm_alert();
		a.verify_confirm_alert_present();
		a.handle_confirm_alert();
		a.verify_confirm_alert_msg();
	}
	
	@Test(priority = 4, description = "Open prompt alert and Handle it")
	public void handle_prompt_alert() {
		a.click_on_prompt_alert();
		a.verify_prompt_alert_present();
		a.handle_prompt_alert();
		a.verify_prompt_alert_msg();
	}
}
