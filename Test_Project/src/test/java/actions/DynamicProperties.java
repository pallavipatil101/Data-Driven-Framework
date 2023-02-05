package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;
import locators.DynamicProperties_locators;
import utilities.CommonUtilities;

public class DynamicProperties extends Base{
	public String colorBefore;
	DynamicProperties_locators dpl = new DynamicProperties_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void verify_Disabled_Btn() {
		cu.isFalse(dpl.disabledBtn().isEnabled());
	}
	
	public void btn_Color_Before() {
		colorBefore = dpl.colorChangeBtn().getCssValue("color");
	}
	
	public void wait_Five_Seconds() {
		cu.waiting().until(ExpectedConditions.elementToBeClickable(dpl.disabledBtn()));
	}
	
	public void verify_Enabled_Btn() {
		cu.isTrue(dpl.disabledBtn().isEnabled());
	}
	
	public void verify_Button_Color_Change() {
		String colorAfter = dpl.colorChangeBtn().getCssValue("color");
		cu.verify_texts_notEqual(colorBefore, colorAfter);
	}
	
	public void verify_Visible_Btn() {
		cu.isTrue(dpl.invisibleBtn().isDisplayed());
	}
	
	
}
