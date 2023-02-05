package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;
import locators.Alerts_locators;
import utilities.CommonUtilities;

public class Alerts extends Base {
	
	Alerts_locators a = new Alerts_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void click_on_simple_alert() {
		a.simpleAlert().click();
	}
	
	public void handle_simple_alert() {
		cu.switch_to_alert().accept();
	}

	public void click_on_delay_alert() {
		a.delayAlert().click();
	}
	
	public void handle_delay_alert() {
		cu.waiting().until(ExpectedConditions.alertIsPresent());
		cu.switch_to_alert().accept();
	}
	
	public void click_on_confirm_alert() {
		a.confirmAlert().click();
	}
	
	public void handle_confirm_alert() {
		cu.switch_to_alert().accept();
	}
	
	public void verify_confirm_alert_msg() {
		cu.verify_texts_equal("You selected Ok",a.confirmAlertMsg());
	}
	
	public void click_on_prompt_alert() {
		a.promptAlert().click();
	}
	
	public void handle_prompt_alert() {
		Alert alert = cu.switch_to_alert();
		alert.sendKeys("Hello");
		alert.accept();
	}
	
	public void verify_prompt_alert_msg() {
		cu.verify_texts_equal("You entered Hello",a.promptAlertMsg());
	}
	
}
