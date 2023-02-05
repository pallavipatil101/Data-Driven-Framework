package actions;

import org.openqa.selenium.WebElement;

import base.Base;
import locators.Links_locators;

public class Links extends Base {
	Links_locators lpl = new Links_locators();
	
	public void click_Links() {
		
		for(WebElement link : lpl.linksList())
		{
			link.click();
		}
		
		handleWindows();
		driver.switchTo().window(parentwindow);
	}
	
	
}
