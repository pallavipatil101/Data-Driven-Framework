package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.ProgressBar;
import base.Base;

public class ProgressBar_Test extends Base{
	ProgressBar pb = new ProgressBar();
	
	@Test(priority = 0)
	public void navigate_to_progressbar() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_progressbar();
	}
	
	@Test(priority = 1)
	public void track_progress_before_start() {
		pb.track_progress_before();
	}
	
	@Test(priority = 2)
	public void click_on_start() {
		pb.start();
	}
	
	@Test(priority = 3)
	public void click_on_stop() {
		pb.stop();
	}
	
	@Test(priority = 4)
	public void compare_progress() {
		pb.compare_progress();
	}
}
