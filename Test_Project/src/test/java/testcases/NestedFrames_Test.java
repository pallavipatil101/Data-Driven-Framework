package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.NestedFrames;
import base.Base;

public class NestedFrames_Test extends Base{
	NestedFrames nf = new NestedFrames();
	
	@Test(priority = 0)
	public void navigate_to_nested_frames() {
		HomePage hp = new HomePage();
		hp.navigate_to_alert_frames_windows().navigate_to_nested_frames();
	}
	
	@Test(priority = 1)
	public void outer_frame() {
		nf.switch_to_outer_frame();
		nf.verify_outer_frame_text();
	}
	
	@Test(priority = 2)
	public void inner_frame() {
		nf.switch_to_inner_frame();
		nf.verify_inner_frame_text();
		nf.switch_to_original_frame();
	}
}
