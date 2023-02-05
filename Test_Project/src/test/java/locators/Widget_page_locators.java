package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Widget_page_locators extends Base{
	
	public WebElement accordian() {
		return driver.findElement(By.xpath("//*[@class = 'text'][text()='Accordian']"));
	}
	
	public WebElement autoComplete() {
		return driver.findElement(By.xpath("//*[@class = 'text'][text()='Auto Complete']"));
	}
	
	public WebElement datePicker() {
		return driver.findElement(By.xpath("//*[@class = 'text'][text()='Date Picker']"));
	}
	
	public WebElement slider() {
		return driver.findElement(By.xpath("//*[@class = 'text'][text()='Slider']"));
	}
	
	public WebElement progreeBar() {
		return driver.findElement(By.xpath("//*[@class = 'text'][text()='Progress Bar']"));
	}
	
	public WebElement tabs() {
		return driver.findElement(By.xpath("//*[@class = 'text'][text()='Tabs']"));
	}
	
	public WebElement toolTips() {
		return driver.findElement(By.xpath("//*[@class = 'text'][text()='Tool Tips']"));
	}
	
	public WebElement menu() {
		return driver.findElement(By.xpath("//*[@class = 'text'][text()='Menu']"));
	}
	
	public WebElement selectMenu() {
		return driver.findElement(By.xpath("//*[@class = 'text'][text()='Select Menu']"));
	}
}
