package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Interactions_page_locators extends Base{
	
	public WebElement sortable() {
		return driver.findElement(By.xpath("//span[@class='text'][text()= 'Sortable']"));
	}
	
	public WebElement selectable() {
		return driver.findElement(By.xpath("//span[@class='text'][text()= 'Selectable']"));
	}
	
	public WebElement resizable() {
		return driver.findElement(By.xpath("//span[@class='text'][text()= 'Resizable']"));
	}
	
	public WebElement droppable() {
		return driver.findElement(By.xpath("//span[@class='text'][text()= 'Droppable']"));
	}
	
	public WebElement draggable() {
		return driver.findElement(By.xpath("//span[@class='text'][text()= 'Dragabble']"));
	}
	
	
}
