package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class CheckBox_locators extends Base{
	public WebElement checkbox() {
		return driver.findElement(By.className("rct-checkbox"));
	}
	
	public WebElement chechbox_Result() {
		return driver.findElement(By.xpath("//*[@id=\"result\"]/span[1]"));
		}
}
