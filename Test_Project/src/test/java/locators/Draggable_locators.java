package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Draggable_locators extends Base{
	
	public List<WebElement> draggableTabsList(){
		return driver.findElements(By.xpath("//*[@class='nav nav-tabs']/a"));
	}
	
	public WebElement draggableSimple() {
		return driver.findElement(By.id("dragBox"));
	}
	
	public WebElement draggableXAxis() {
		return driver.findElement(By.id("restrictedX"));
	}
	
	public WebElement draggableYAxis() {
		return driver.findElement(By.id("restrictedY"));
	}
	
	public WebElement draggableBoxContained() {
		return driver.findElement(By.xpath("//*[@id='containmentWrapper']/div"));
	}
	
	public WebElement draggablePageContained() {
		return driver.findElement(By.xpath("//*[@id='draggableExample-tabpane-containerRestriction']/div[2]/span"));
	}
	
	public WebElement draggableCursorCenter() {
		return driver.findElement(By.id("cursorCenter"));
	}
	
	public WebElement draggableCursorTopLeft() {
		return driver.findElement(By.id("cursorTopLeft"));
	}
	
	public WebElement draggableCursorBottom() {
		return driver.findElement(By.id("cursorBottom"));
	}
}
