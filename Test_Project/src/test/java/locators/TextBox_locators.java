package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class TextBox_locators extends Base{

	public WebElement fullName_label() {
		return driver.findElement(By.xpath("//*[@id='userName-label']"));
	}
	
	public WebElement email_label() {
		return driver.findElement(By.id("userEmail-label"));
	}
	
	public WebElement currentAddress_label() {
		return driver.findElement(By.id("currentAddress-label"));
	}
	
	public WebElement permanentAddress_label() {
		return driver.findElement(By.id("permanentAddress-label"));
	}
	
	public WebElement userName() {
		return driver.findElement(By.id("userName"));
	}
	
	public WebElement userEmail() {
		return driver.findElement(By.id("userEmail"));
	}
	
	public WebElement currentAddress() {
		return driver.findElement(By.id("currentAddress"));
	}
	
	public WebElement permanentAddress() {
		return driver.findElement(By.id("permanentAddress"));
	}
	
	public WebElement submitBtn() {
		return driver.findElement(By.id("submit"));
	}
	
	public WebElement submittedName() {
		return driver.findElement(By.id("name"));
	}
	
	public WebElement submittedEmail() {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement submittedCurrentAddress() {
		return driver.findElement(By.xpath("//*[@id= 'currentAddress' and @class = 'mb-1']"));
	}
	
	public WebElement submittedPermanentAddress() {
		return driver.findElement(By.xpath("//*[@id= 'permanentAddress' and @class = 'mb-1']"));
	}
}
