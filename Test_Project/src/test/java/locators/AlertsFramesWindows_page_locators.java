package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class AlertsFramesWindows_page_locators extends Base {
	
	public WebElement windows() {
		return driver.findElement(By.xpath("//*[@class = 'text'] [text()='Browser Windows']"));
	}
	
	public WebElement alerts() {
		return driver.findElement(By.xpath("//*[@class = 'text'] [text()='Alerts']"));
	}

	public WebElement frames() {
		return driver.findElement(By.xpath("//*[@class = 'text'] [text()='Frames']"));
	}
	
	public WebElement nested_frames() {
		return driver.findElement(By.xpath("//span[@class = 'text'] [text()='Nested Frames']"));
	}
	
	public WebElement modals() {
		return driver.findElement(By.xpath("//*[@class = 'text'] [text()='Modal Dialogs']"));
	}
}
