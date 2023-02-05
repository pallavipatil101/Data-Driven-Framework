package testcases;

import org.testng.annotations.Test;

import actions.Frames;
import actions.HomePage;
import base.Base;

public class Frames_Test extends Base {
	Frames fr = new Frames();
	
	@Test(priority = 0)
	public void navigate_to_frames() {
		HomePage hp = new HomePage();
		hp.navigate_to_alert_frames_windows().navigate_to_frames();
	}
	
	@Test(priority = 1)
	public void frame1() {
		fr.switch_to_frame1();
		fr.verify_frame1_heading();
		fr.switch_to_original_frame();
	}
	
	@Test(priority = 2)
	public void frame2() {
		fr.switch_to_frame2();
		fr.verify_frame2_heading();
		fr.switch_to_original_frame();
	}
}
