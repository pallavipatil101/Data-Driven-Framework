package actions;

import base.Base;
import locators.CheckBox_locators;
import utilities.CommonUtilities;

public class CheckBox extends Base{
	CheckBox_locators cpl = new CheckBox_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void click_Checkbox() {
		if(!cpl.checkbox().isSelected())
		{
			cpl.checkbox().click();
		}
	}
	
	public void verify_Selected_CheckBox() {
		cu.verify_texts_equal("You have selected :", cpl.chechbox_Result());
	}
}
