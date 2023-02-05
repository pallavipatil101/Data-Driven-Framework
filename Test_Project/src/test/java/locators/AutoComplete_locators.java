package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class AutoComplete_locators extends Base {
	
	public WebElement singleColor() {
		return driver.findElement(By.xpath("//*[@id='autoCompleteSingleContainer']/div/div[1]"));
	}
	
	public WebElement multipleColors() {
		return driver.findElement(By.xpath("//*[@id='autoCompleteMultipleContainer']/div/div[1]"));
	}
	
	public WebElement frame() {
		return driver.findElement(By.name("aswift_0"));
	}
	
	public WebElement multiBlue() {
		return driver.findElement(By.id("react-select-5-option-0"));
	}
	
	public WebElement multiBlack() {
		return driver.findElement(By.id("react-select-5-option-1"));
	}
	
	
	public WebElement singleRed() {
		return driver.findElement(By.id("react-select-6-option-0"));
	}
	
	public WebElement singleGreen() {
		return driver.findElement(By.id("react-select-6-option-1"));
	}
	
	public WebElement singlePurple() {
		return driver.findElement(By.id("react-select-6-option-2"));
	}
}
