package testcases;

import org.testng.annotations.Test;

import actions.AlertsFramesWindows;
import actions.NestedFrames;
import base.Base;

public class NestedFrames_Test extends Base{
	NestedFrames nf = new NestedFrames();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to nested frames under AlertsFramesWindows")
	public void navigate_to_nested_frames() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_alert_frames_windows().navigate_to_nested_frames();
		AlertsFramesWindows frame = new AlertsFramesWindows();
		frame.navigate_to_nested_frames();
	}
	
	@Test(priority = 1, description = "switch to outer nested frame and verify its text")
	public void outer_frame() {
		nf.switch_to_outer_frame();
		nf.verify_outer_frame_text();
	}
	
	@Test(priority = 2, description = "switch to inner nested frame and verify its text")
	public void inner_frame() {
		nf.switch_to_inner_frame();
		nf.verify_inner_frame_text();
		nf.switch_to_original_frame();
	}
}
