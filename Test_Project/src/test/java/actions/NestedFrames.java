package actions;

import base.Base;
import locators.NestedFrames_locators;
import utilities.CommonUtilities;

public class NestedFrames extends Base {
	NestedFrames_locators nf = new NestedFrames_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void switch_to_outer_frame() {
		cu.switch_to_frame(nf.parentFrame());
	}
	
	public void verify_outer_frame_text() {
		cu.verify_texts_equal("Parent frame", nf.parentFrameText());
	}
	
	public void switch_to_inner_frame() {
		cu.switch_to_frame(0);
	}
	
	public void verify_inner_frame_text() {
		cu.verify_texts_equal("Child Iframe", nf.childFrameText());
	}
	
	public void switch_to_original_frame() {
		cu.switch_to_frame();
	}
}
