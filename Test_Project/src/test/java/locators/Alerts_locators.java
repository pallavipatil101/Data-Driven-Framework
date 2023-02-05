package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Alerts_locators extends Base{
	
	public WebElement simpleAlert() {
		return driver.findElement(By.id("alertButton"));
	}
	
	public WebElement delayAlert() {
		return driver.findElement(By.id("timerAlertButton"));
	}
	
	public WebElement confirmAlert() {
		return driver.findElement(By.id("confirmButton"));
	}
	
	public WebElement confirmAlertMsg() {
		return driver.findElement(By.id("confirmResult"));
	}
	
	public WebElement promptAlert() {
		return driver.findElement(By.id("promtButton"));
	}
	
	public WebElement promptAlertMsg() {
		return driver.findElement(By.id("promptResult"));
	}
}
