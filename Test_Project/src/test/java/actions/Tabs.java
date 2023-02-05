package actions;

import org.openqa.selenium.WebElement;

import base.Base;
import locators.Tabs_locators;

public class Tabs extends Base{
	
	Tabs_locators tl = new Tabs_locators();
	
	public void switchTabs() {
		for(WebElement tab : tl.tabsList())
		{
			if(tab.getText().equals("Origin"))
			{
				tab.click();
			}
		}
	}
}
