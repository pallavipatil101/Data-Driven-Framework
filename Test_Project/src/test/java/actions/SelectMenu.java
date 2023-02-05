package actions;

import org.openqa.selenium.WebElement;
import base.Base;
import locators.SelectMenu_locators;
import utilities.CommonUtilities;

public class SelectMenu extends Base{
	SelectMenu_locators sm = new SelectMenu_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void select_dropdown() {
		cu.select_Drop_Down(sm.selectDropDown()).selectByVisibleText("Aqua");
	}
	
	public void standard_multi_select() {
		cu.select_Drop_Down(sm.standardMultiSelectDropDown()).selectByVisibleText("Volvo");
		cu.select_Drop_Down(sm.standardMultiSelectDropDown()).selectByVisibleText("Audi");
	}
	
	public void multi_select() {
		cu.scroll_to_element(sm.multiSelectDropDown());
		sm.multiSelectDropDown().click();
		sm.blue().click();
		sm.green().click();
	}
	
	public void value_dropdown() {
		cu.scroll_to_element(sm.valueDropDown());
		sm.valueDropDown().click();
		for(WebElement val : sm.valueDropOptionsList())
		{
		try{
			if(val.getText().equals("Group 2, option 1"))
			{
				val.click();
			}
		}
		catch(org.openqa.selenium.StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		}
	}
	
	public void one_dropdown() {
		cu.scroll_to_element(sm.oneDropDown());
		sm.oneDropDown().click();
		for(WebElement val : sm.oneDropOptionsList())
		{
		try{
			if(val.getText().equals("Ms."))
			{
				val.click();
			}
		}
		catch(org.openqa.selenium.StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		}
	}	
}
