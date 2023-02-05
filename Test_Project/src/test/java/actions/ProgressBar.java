package actions;

import base.Base;
import locators.ProgressBar_locators;
import utilities.CommonUtilities;

public class ProgressBar extends Base{
	CommonUtilities cu = new CommonUtilities();
	ProgressBar_locators ps = new ProgressBar_locators();
	public String progressBefore;
	
	public void track_progress_before() {
		progressBefore = ps.trackProgress().getAttribute("aria-valuenow");
	}
	
	public void start() {
		cu.scroll_to_element(ps.trackProgress());
		cu.action().moveToElement(ps.startStopBtn()).click().build().perform();
	}
	
	public void stop() {
		cu.waitImplicitly();
		cu.action().moveToElement(ps.startStopBtn()).click().build().perform();
	}
	
	public void compare_progress() {
		String progressAfter = ps.trackProgress().getAttribute("aria-valuenow");
		cu.verify_texts_notEqual(progressBefore, progressAfter);
		System.out.println(progressBefore+"---"+progressAfter);
	}
}
