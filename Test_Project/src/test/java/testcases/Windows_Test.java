package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import actions.HomePage;
import actions.Windows;
import base.Base;

public class Windows_Test extends Base{
	Windows win = new Windows();
	public Logger log = LogManager.getLogger(Accordian_Test.class.getName());
	
	@Test(priority = 0)
	public void navigate_to_windows() {
		HomePage hp = new HomePage();
		hp.navigate_to_alert_frames_windows().navigate_to_windows();
	}
	
	@Test(priority = 1, enabled=true)
	public void new_tab() {
		win.open_new_tab();
		log.debug("Opened new tab");
		win.switch_to_newwindow();
		log.debug("Navigated to new tab");
		win.verify_newtab_heading();
		log.debug("Verifified heading of new tab");
		win.switch_to_parentwindow();
		log.debug("Switched back to original tab");
	}
	
	
	@Test(priority = 2, enabled=true)
	public void new_window() {
		win.open_new_window();
		log.debug("Opened new window");
		win.switch_to_newwindow();
		log.debug("Switched to new window");
		win.verify_newwindow_heading();
		log.debug("Verified heading of new window");
		win.switch_to_parentwindow();
		log.debug("Switched back to original window");
	}
	
	
	@Test(priority = 3, enabled = true)
	public void new_msg_window() {
		win.open_msg_window();
		log.debug("Opened new window");
		win.switch_to_newwindow();
		log.debug("Switched to new window");
		win.verify_msgwindow_heading();
		log.debug("Verified heading of new text");
		win.switch_to_parentwindow();
		log.debug("Switched back to original window");
	}
}
