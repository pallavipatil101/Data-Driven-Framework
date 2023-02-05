package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Modals_locators extends Base {
	
	public WebElement smallModal() {
		return driver.findElement(By.id("showSmallModal"));
	}
	
	public WebElement closeSmallModal() {
		return driver.findElement(By.id("closeSmallModal"));
	}
	
	public WebElement largeModal() {
		return driver.findElement(By.id("showLargeModal"));
	}
	
	public WebElement closeLargeModal() {
		return driver.findElement(By.id("closeLargeModal"));
	}
	
	public WebElement smallModaltext() {
		return driver.findElement(By.xpath("//div[@class = 'modal-body']"));
	}
	
	public WebElement largeModaltext() {
		return driver.findElement(By.xpath("//*[@class = 'modal-body']/p"));
	}
}
