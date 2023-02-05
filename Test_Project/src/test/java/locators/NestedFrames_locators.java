package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class NestedFrames_locators extends Base {
	
	public WebElement parentFrame() {
		return driver.findElement(By.id("frame1"));
	}
	
	public WebElement parentFrameText() {
		return driver.findElement(By.xpath("//*[text() = 'Parent frame']"));
	}
	
	public WebElement childFrame() {
		return driver.findElement(By.name("Child Iframe"));
	}
	
	public WebElement childFrameText() {
		return driver.findElement(By.xpath("//*[text() = 'Child Iframe']"));
	}
}
