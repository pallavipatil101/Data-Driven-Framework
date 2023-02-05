package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class LeftPanel_Locators extends Base{
	
	public WebElement elements() {
		return driver.findElement(By.xpath("//*[text() = 'Elements']"));
	}
	
	public WebElement forms() {
		return driver.findElement(By.xpath("//*[text()='Forms']"));
	}
	
	public WebElement alertFrameWindows() {
		return driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']"));
	}
	
	public WebElement widgets() {
		return driver.findElement(By.xpath("//*[text()='Widgets']"));
	}
	
	public WebElement interactions() {
		return driver.findElement(By.xpath("//*[text()='Interactions']"));
	}
}
