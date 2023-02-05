package testcases;

import org.testng.annotations.Test;

import actions.DynamicProperties;
import actions.HomePage;
import base.Base;

public class DynamicProperties_Test extends Base{
	
	DynamicProperties dp = new DynamicProperties();
	
	@Test(priority = 0)
	public void navigateToDynamicProperties() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_dynamic_properties();
	}
	
	@Test(priority = 1)
	public void verifyDisabledBtn() {
		dp.verify_Disabled_Btn();
	}
	
	@Test(priority = 2)
	public void buttonColorBefore() {
		dp.btn_Color_Before();
	}
	
	@Test(priority = 3)
	public void verifyEnabledBtn() {
		dp.wait_Five_Seconds();
		dp.verify_Enabled_Btn();
	}
	
	@Test(priority = 4)
	public void verifyBtnColorChange() {
		dp.verify_Button_Color_Change();
	}
	
	@Test(priority = 5)
	public void verifyVisibilityOfInvisibleBtn() {
		dp.verify_Visible_Btn();
	}
}
