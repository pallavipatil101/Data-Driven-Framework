package testcases;

import org.testng.annotations.Test;

import actions.AlertsFramesWindows;
import actions.Frames;
import base.Base;

public class Frames_Test extends Base {
	Frames fr = new Frames();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to frames under AlertsFramesWindows")
	public void navigate_to_frames() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_alert_frames_windows().navigate_to_frames();
		AlertsFramesWindows frame = new AlertsFramesWindows();
		frame.navigate_to_frames();
	}
	
	@Test(priority = 1, description = "Switch to first frame. Verify its heading. switch back to original frame")
	public void frame1() {
		fr.switch_to_frame1();
		fr.verify_frame1_heading();
		fr.switch_to_original_frame();
	}
	
	@Test(priority = 2, description = "Switch to second frame. Verify its heading. switch back to original frame")
	public void frame2() {
		fr.switch_to_frame2();
		fr.verify_frame2_heading();
		fr.switch_to_original_frame();
	}
}
