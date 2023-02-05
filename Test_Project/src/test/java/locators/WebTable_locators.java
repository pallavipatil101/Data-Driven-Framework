package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class WebTable_locators extends Base {

	public List<WebElement> tableRow1(){
		return driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div"));
	}
	
	public WebElement editRow1() {
		return driver.findElement(By.id("edit-record-1"));
	}
	
	public WebElement deleteRow1() {
		return driver.findElement(By.id("delete-record-1"));
	}
	
	public List<WebElement> tableRow2(){
		return driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div"));
	}
	
	public WebElement editRow2() {
		return driver.findElement(By.id("edit-record-2"));
	}
	
	public WebElement deleteRow2() {
		return driver.findElement(By.id("delete-record-2"));
	}
	
	public List<WebElement> tableRow3(){
		return driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div"));
	}
	
	public WebElement editRow3() {
		return driver.findElement(By.id("edit-record-3"));
	}
	
	public WebElement deleteRow3() {
		return driver.findElement(By.id("delete-record-3"));
	}
	
	public WebElement firstName() {
		return driver.findElement(By.id("firstName"));
	}
	
	public WebElement lastName() {
		return driver.findElement(By.id("lastName"));
	}
	
	public WebElement email() {
		return driver.findElement(By.id("userEmail"));
	}
	
	public WebElement age() {
		return driver.findElement(By.id("age"));
	}
	
	public WebElement salary() {
		return driver.findElement(By.id("salary"));
	}
	
	public WebElement department() {
		return driver.findElement(By.id("department"));
	}
	
	public WebElement submitBtn() {
		return driver.findElement(By.id("submit"));
	}
}
