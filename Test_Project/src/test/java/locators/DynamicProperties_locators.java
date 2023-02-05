package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class DynamicProperties_locators extends Base{
	
	public WebElement disabledBtn() {
		return driver.findElement(By.id("enableAfter"));
	}
	
	public WebElement colorChangeBtn() {
		return driver.findElement(By.id("colorChange"));
	}
	
	public WebElement invisibleBtn() {
		return driver.findElement(By.id("visibleAfter"));
	}
}
