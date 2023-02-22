package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class LeftPanelLocators extends Base{
	
	public WebElement Elements() {
		return driver.findElement(By.xpath("//*[text() = 'Elements']"));
	}
	
	public WebElement Forms() {
		return driver.findElement(By.xpath("//*[text() = 'Forms']"));
	}
	
	public WebElement Alerts_Frames_Windows() {
		return driver.findElement(By.xpath("//*[text() = 'Alerts, Frame & Windows']"));
	}
	
	public WebElement Widgets() {
		return driver.findElement(By.xpath("//*[text() = 'Widgets']"));
	}
	
	public WebElement Interactions() {
		return driver.findElement(By.xpath("//*[text() = 'Interactions']"));
	}
}
