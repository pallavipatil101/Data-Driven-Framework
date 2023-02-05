package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Frames_locators extends Base{

	public WebElement frame1() {
		return driver.findElement(By.id("frame1"));
	}
	
	public WebElement frame1Heading() {
		return driver.findElement(By.id("sampleHeading"));
	}
	
	public WebElement frame2() {
		return driver.findElement(By.id("frame2"));
	}
	
	public WebElement frame2Heading() {
		return driver.findElement(By.id("sampleHeading"));
	}
}
