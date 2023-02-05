package actions;

import base.Base;
import locators.Modals_locators;
import utilities.CommonUtilities;

public class Modals extends Base {
	Modals_locators md = new Modals_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void open_small_modal() {
		md.smallModal().click();
	}
	
	public void verify_small_modal_text() {
		cu.scroll_to_element(md.smallModaltext());
		cu.verify_texts_equal("This is a small modal. It has very less content", md.smallModaltext());
	}
	
	public void close_small_modal() {
		md.closeSmallModal().click();
	}
	
	public void open_large_modal() {
		md.largeModal().click();
	}
	
	public void verify_large_modal_text() {
		cu.scroll_to_element(md.largeModaltext());
		cu.isTrue(md.largeModaltext().getText().contains("Lorem Ipsum is simply dummy text"));
	}
	
	public void close_large_modal() {
		md.closeLargeModal().click();
	}
}
