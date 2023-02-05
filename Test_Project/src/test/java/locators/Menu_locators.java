package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Menu_locators extends Base{
	
	public WebElement menu1() {
		return driver.findElement(By.linkText("Main Item 1"));
	}
	
	public WebElement menu3() {
		return driver.findElement(By.linkText("Main Item 3"));
	}
	
	public WebElement menu2() {
		return driver.findElement(By.linkText("Main Item 2"));
	}
	
	public WebElement menu2_Item1() {
		return driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[1]/a"));
	}
	
	public WebElement menu2_Item2() {
		return driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[2]/a"));
	}
	
	public WebElement menu2_Submenu() {
		return driver.findElement(By.linkText("SUB SUB LIST »"));
	}
	
	public WebElement submenu_Item1() {
		return driver.findElement(By.linkText("Sub Sub Item 1"));
	}
	
	public WebElement submenu_Item2() {
		return driver.findElement(By.linkText("Sub Sub Item 2"));
	}
	
}
