package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class ToolTips_locators extends Base{
	
	public WebElement hoverOverBtn() {
		return driver.findElement(By.id("toolTipButton"));
	}
	
	public WebElement hoverOverTextbox() {
		return driver.findElement(By.id("toolTipTextField"));
	}
}
