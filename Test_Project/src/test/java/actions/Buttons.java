package actions;

import base.Base;
import locators.Buttons_locators;
import utilities.CommonUtilities;

public class Buttons extends Base {

	Buttons_locators bpl = new Buttons_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void click_DoubledClick_Btn() {
		cu.action().doubleClick(bpl.doubleClickBtn()).build().perform();
	}
	
	public void click_RightClick_Btn() {
		cu.action().contextClick(bpl.rightClickBtn()).build().perform();
	}
	
	public void click_Dynamic_Btn() {
		cu.action().moveToElement(bpl.dynamicBtn()).click().build().perform();
	}
	
	public void verify_Double_Click() {
		//scroll_to_element(bpl.dynamicClickMsg());
		cu.verify_texts_equal("You have done a double click", bpl.doubleClickMsg());
	}
	
	public void verify_Right_Click() {
		cu.verify_texts_equal("You have done a right click", bpl.rightClickMsg());
	}

	public void verify_Dynamic_Click() {
		cu.verify_texts_equal("You have done a dynamic click", bpl.dynamicClickMsg());
	}
	
}
