package testcases;

import org.testng.annotations.Test;

import actions.Buttons;
import actions.Elements;
import base.Base;

public class Buttons_Test extends Base {
	public Buttons btn = new Buttons();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to buttons under Elements")
	public void navigateToButtons() {
		//HomePage hp = new HomePage();	 
		//hp.navigate_to_Elements().navigate_to_buttons();
		Elements el = new Elements();
		el.navigate_to_buttons();
	}
	
	
	@Test(priority = 1, description = "Double click the first button and verify if click is successful")
	public void doubleClick() {
		btn.click_DoubledClick_Btn();
		btn.verify_Double_Click();
	}
	
	@Test(priority = 2, description = "Right click the second button and verify if click is successful")
	public void rightClick() {
		btn.click_RightClick_Btn();
		btn.verify_Right_Click();
	}
	
	@Test(priority = 3, description = "click the third button and verify if click is successful")
	public void dynamicClick() {
		btn.click_Dynamic_Btn();
		btn.verify_Dynamic_Click();
	}
}
