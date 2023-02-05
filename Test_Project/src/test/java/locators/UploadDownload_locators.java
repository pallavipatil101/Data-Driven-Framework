package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class UploadDownload_locators extends Base {
	
	public WebElement upload() {
		return driver.findElement(By.id("uploadFile"));
	}
	
	public WebElement download() {
		return driver.findElement(By.id("downloadButton"));
	}
}
