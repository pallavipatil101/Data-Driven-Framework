package testcases;

import org.testng.annotations.Test;

import actions.Buttons;
import actions.HomePage;
import base.Base;

public class Buttons_Test extends Base {
	public Buttons btn = new Buttons();
	
	@Test(priority = 0)
	public void navigateToButtons() {
		HomePage hp = new HomePage();	 
		hp.navigate_to_Elements().navigate_to_buttons();
	}
	
	
	@Test(priority = 1)
	public void doubleClick() {
		btn.click_DoubledClick_Btn();
		btn.verify_Double_Click();
	}
	
	@Test(priority = 2)
	public void rightClick() {
		btn.click_RightClick_Btn();
		btn.verify_Right_Click();
	}
	
	@Test(priority = 3)
	public void dynamicClick() {
		btn.click_Dynamic_Btn();
		btn.verify_Dynamic_Click();
	}
}
