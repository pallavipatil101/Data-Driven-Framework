package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Buttons_locators extends Base {
	
	public WebElement doubleClickBtn() {
		return driver.findElement(By.id("doubleClickBtn"));
	}
	
	public WebElement rightClickBtn() {
		return driver.findElement(By.id("rightClickBtn"));
	}
	
	public WebElement dynamicBtn() {
		return driver.findElement(By.xpath("//button[text()='Click Me']"));
	}
	
	public WebElement doubleClickMsg() {
		return driver.findElement(By.id("doubleClickMessage"));
	}
	
	public WebElement rightClickMsg() {
		return driver.findElement(By.id("rightClickMessage"));
	}
	
	public WebElement dynamicClickMsg() {
		return driver.findElement(By.id("dynamicClickMessage"));
	}
	
	
}
