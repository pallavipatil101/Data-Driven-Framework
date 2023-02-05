package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Home_page_locators extends Base {
	
	public WebElement element() {
		return driver.findElement(By.xpath("//*[@class='card mt-4 top-card'][1]"));
	}
	
	public WebElement forms() {
		return driver.findElement(By.xpath("//*[@class='card mt-4 top-card'][2]"));
	}
	
	public WebElement alerts_frames_windows() {
		return driver.findElement(By.xpath("//*[@class='card mt-4 top-card'][3]"));
	}
	
	public WebElement widgets() {
		return driver.findElement(By.xpath("//*[@class='card mt-4 top-card'][4]"));
	}
	
	public WebElement interactions() {
		return driver.findElement(By.xpath("//*[@class='card mt-4 top-card'][5]"));
	}
}
