package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Elements_page_locators extends Base {
	
//	WebDriver driver = driver;
	
	public WebElement get_textBox() {
		return driver.findElement(By.xpath("//*[text()='Text Box']"));
	}
	
	public WebElement get_CheckBox() {
		return driver.findElement(By.xpath("//*[text()='Check Box']"));
	}
	
	public WebElement get_RadioButton() {
		return driver.findElement(By.xpath("//*[text()='Radio Button']"));
	}

	public WebElement get_WebTables() {
		return driver.findElement(By.xpath("//*[text()='Web Tables']"));
	}
	
	public WebElement get_Buttons() {
		return driver.findElement(By.xpath("//*[text()='Buttons']"));
	}
	
	public WebElement get_Links() {
		return driver.findElement(By.xpath("//*[text()='Links']"));
	}
	
	public WebElement get_BrokenLinks() {
		return driver.findElement(By.xpath("//*[text()='Broken Links - Images']"));
	}
	
	public WebElement get_UploadDownload() {
		return driver.findElement(By.xpath("//*[text()='Upload and Download']"));
	}
	
	public WebElement get_DynamicProperties() {
		return driver.findElement(By.xpath("//*[text()='Dynamic Properties']"));
	}
	
}
