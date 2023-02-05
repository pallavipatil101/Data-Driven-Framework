package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Links_locators extends Base{
	
	public List<WebElement> linksList() {
		return driver.findElements(By.cssSelector("p>a"));
	}
	
	public WebElement apiResponse() {
		return driver.findElement(By.id("linkResponse"));
	}
	
	
}
