package testcases;

import org.testng.annotations.Test;

import actions.ProgressBar;
import actions.Widgets;
import base.Base;

public class ProgressBar_Test extends Base{
	ProgressBar pb = new ProgressBar();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to ProgressBar under Widgets")
	public void navigate_to_progressbar() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_widgets().navigate_to_progressbar();
		Widgets widget = new Widgets();
		widget.navigate_to_progressbar();
	}
	
	@Test(priority = 1, description = "Verify progress before starting")
	public void track_progress_before_start() {
		pb.track_progress_before();
	}
	
	@Test(priority = 2, description = "Click on start button")
	public void click_on_start() {
		pb.start();
	}
	
	@Test(priority = 3, description = "Click on stop button")
	public void click_on_stop() {
		pb.stop();
	}
	
	@Test(priority = 4, description = "Tract progress and compare to progress before starting")
	public void compare_progress() {
		pb.compare_progress();
	}
}
