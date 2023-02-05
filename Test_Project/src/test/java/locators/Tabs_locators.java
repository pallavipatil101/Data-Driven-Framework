package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Tabs_locators extends Base{

	public List<WebElement> tabsList(){
		return driver.findElements(By.xpath("//*[@class ='nav nav-tabs']/a"));
	}
}
