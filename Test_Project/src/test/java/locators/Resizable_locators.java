package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Resizable_locators extends Base {

	public WebElement resize1() {
		return driver.findElement(By.xpath("//*[@id='resizableBoxWithRestriction']/span"));
	}
	
	public WebElement resize2() {
		return driver.findElement(By.xpath("//*[@id='resizable']/span"));
	}
}
