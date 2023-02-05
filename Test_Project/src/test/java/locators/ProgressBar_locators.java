package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class ProgressBar_locators extends Base {
	
	public WebElement startStopBtn() {
		return driver.findElement(By.id("startStopButton"));
	}
	
	public WebElement trackProgress() {
		return driver.findElement(By.xpath("//*[@id = 'progressBar']/div"));
	}
}
