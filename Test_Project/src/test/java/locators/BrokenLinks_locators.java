package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class BrokenLinks_locators extends Base{
	
	public List<WebElement> images(){
		return driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img"));
	}
	
	public List<WebElement> linksList() {
		return driver.findElements(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/a"));
	}
}
