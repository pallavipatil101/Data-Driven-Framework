package actions;

import base.Base;
import locators.Frames_locators;
import utilities.CommonUtilities;

public class Frames extends Base{
	Frames_locators fl = new Frames_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void switch_to_frame1() {
		//switch_to_frame(fl.frame1());
		cu.switch_to_frame(fl.frame1());
	}
	
	public void verify_frame1_heading() {
		//verify_texts_equal("This is a sample page", fl.frame1Heading());
		cu.verify_texts_equal("This is a sample page", fl.frame1Heading());
	}
	
	public void switch_to_frame2() {
		//switch_to_frame(fl.frame2());
		cu.switch_to_frame(fl.frame2());
	}
	
	public void verify_frame2_heading() {
		//verify_texts_equal("This is a sample page", fl.frame2Heading());
		cu.verify_texts_equal("This is a sample page", fl.frame2Heading());
	}
	
	public void switch_to_original_frame() {
		//switch_to_frame();
		cu.switch_to_frame();
	}
}
