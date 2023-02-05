package actions;

import base.Base;
import locators.Resizable_locators;
import utilities.CommonUtilities;

public class Resizable extends Base{
	Resizable_locators rl = new  Resizable_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void resizable_box_contained() {
		cu.scroll_to_element(rl.resize1());
		cu.action().moveToElement(rl.resize1()).clickAndHold().build().perform();
		cu.action().dragAndDropBy(rl.resize1(), 160, 160).build().perform();
	}
	
	public void resizable_page_contained() {
		cu.scroll_to_element(rl.resize2());
		cu.action().moveToElement(rl.resize2()).clickAndHold().build().perform();
		cu.action().dragAndDropBy(rl.resize2(), 150, 200).build().perform();
	}
}
