package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class DatePicker_locators extends Base{
	
	public WebElement calender1() {
		return driver.findElement(By.id("datePickerMonthYearInput"));
	}
	
	public WebElement calender1MonthSelect() {
		return driver.findElement(By.xpath("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
	}
	
	public WebElement calender1YearSelect() {
		return driver.findElement(By.xpath("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
	}
	
	public WebElement calender1Date() {
		return driver.findElement(By.xpath("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));
		//return driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']/option"));
	}
	
	public WebElement calender2() {
		return driver.findElement(By.id("dateAndTimePickerInput"));
	}
	
	public WebElement calender2MonthBtn() {
		return driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]"));
	}
	
	public List<WebElement> calender2MonthList() {
		return driver.findElements(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div"));
	}
	
	public WebElement calender2YearBtn() {
		return driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]"));
	}
	
	public WebElement calender2YearArrow() {
		return driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[13]/a"));
	}
	
	public List<WebElement> calender2YearList() {
		return driver.findElements(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div"));
	}
	
	public WebElement calender2Date() {
		return driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));
	}
	
	public List<WebElement> calender2TimeList(){
		return driver.findElements(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li"));
	}
}
