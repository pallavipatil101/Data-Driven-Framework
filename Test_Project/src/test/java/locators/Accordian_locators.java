package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Accordian_locators extends Base{
	
	public WebElement heading1() {
		return driver.findElement(By.id("section1Heading"));
	}
	
	public WebElement heading1Msg() {
		return driver.findElement(By.xpath("//*[@id='section1Content']/p"));
	}
	
	public WebElement heading2() {
		return driver.findElement(By.id("section2Heading"));
	}
	
	public WebElement heading2Msg() {
		return driver.findElement(By.xpath("//*[@id='section2Content']/p[1]"));
	}
	
	public WebElement heading3() {
		return driver.findElement(By.id("section3Heading"));
	}
	
	public WebElement heading3Msg() {
		return driver.findElement(By.xpath("//*[@id='section3Content']/p"));
	}
}
