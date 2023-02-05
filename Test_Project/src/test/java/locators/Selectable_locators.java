package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Selectable_locators extends Base {

	public List<WebElement> selectableTabsList() {
		return driver.findElements(By.xpath("//*[@class = 'nav nav-tabs']/a"));
	}
	
	public List<WebElement> selectableListElements() {
		return driver.findElements(By.xpath("//*[@id='verticalListContainer']/li"));
	}
	
	public List<WebElement> selectableGridElements() {
		return driver.findElements(By.xpath("//*[@id='gridContainer']//descendant::li"));
	}
}
