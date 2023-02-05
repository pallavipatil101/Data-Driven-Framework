package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Windows_locators extends Base {

	public WebElement newTab() {
		return driver.findElement(By.id("tabButton"));
	}
	
	public WebElement newTabHeading() {
		return driver.findElement(By.id("sampleHeading"));
	}
	
	public WebElement newWindow() {
		return driver.findElement(By.id("windowButton"));
	}
	
	public WebElement newWindowHeading() {
		return driver.findElement(By.id("sampleHeading"));
	}
	
	public WebElement messageWindow() {
		return driver.findElement(By.id("messageWindowButton"));
	}
	
	public WebElement msgWindowHeading() {
		return driver.findElement(By.xpath("html/body"));
	}
}
