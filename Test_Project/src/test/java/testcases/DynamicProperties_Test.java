package testcases;

import org.testng.annotations.Test;

import actions.DynamicProperties;
import actions.Elements;
import base.Base;

public class DynamicProperties_Test extends Base{
	
	DynamicProperties dp = new DynamicProperties();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to dynamic properties under Elements")
	public void navigateToDynamicProperties() {
		//HomePage hp = new HomePage();	
		//hp.navigate_to_Elements().navigate_to_dynamic_properties();
		Elements el = new Elements();
		el.navigate_to_dynamic_properties();
	}
	
	@Test(priority = 1, description = "Verify if disabled button is really disabled")
	public void verifyDisabledBtn() {
		dp.verify_Disabled_Btn();
	}
	
	@Test(priority = 2, description = "Verify color of color-changing button before the changes")
	public void buttonColorBefore() {
		dp.btn_Color_Before();
	}
	
	@Test(priority = 3, description = "Verify if disabled button is enabled after 5 seconds")
	public void verifyEnabledBtn() {
		dp.wait_Five_Seconds();
		dp.verify_Enabled_Btn();
	}
	
	@Test(priority = 4, description = "Verify if color-changing button changed its color after 5 seconds")
	public void verifyBtnColorChange() {
		dp.verify_Button_Color_Change();
	}
	
	@Test(priority = 5, description = "Verify if invisible button is viable after 5 seconds")
	public void verifyVisibilityOfInvisibleBtn() {
		dp.verify_Visible_Btn();
	}
}
