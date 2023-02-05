package actions;

import base.Base;
import locators.ToolTips_locators;
import utilities.CommonUtilities;

public class ToolTips extends Base{
	ToolTips_locators tt = new ToolTips_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void hover_over_button() {
		cu.action().moveToElement(tt.hoverOverBtn()).build().perform();
	}
	
	public void hover_over_textbox() {
		cu.action().moveToElement(tt.hoverOverTextbox()).build().perform();
	}
}
