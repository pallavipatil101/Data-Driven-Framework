package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Sortable_locators extends Base{

	public List<WebElement> sortableTabsList() {
		return driver.findElements(By.xpath("//*[@class='nav nav-tabs']/a"));
	}
	
	public List<WebElement> sortableListElements() {
		return driver.findElements(By.xpath("//*[@id='demo-tabpane-list']/div/div"));
	}
	
	public List<WebElement> sortableGridElements() {
		return driver.findElements(By.xpath("//*[@id='demo-tabpane-grid']/div/div/div"));
	}
}
