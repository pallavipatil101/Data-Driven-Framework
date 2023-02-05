package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class PracticeForm_locators extends Base{
	
	public WebElement name_label() {
		return driver.findElement(By.id("userName-label"));
	}
	
	public WebElement email_label() {
		return driver.findElement(By.id("userEmail-label"));
	}

	public WebElement gender_label() {
		return driver.findElement(By.xpath("//*[@id='genterWrapper']/div[1]"));
	}
	
	public WebElement mobile_label() {
		return driver.findElement(By.id("userNumber-label"));
	}
	
	public WebElement birthdate_label() {
		return driver.findElement(By.id("dateOfBirth-label"));
	}

	public WebElement subject_label() {
		return driver.findElement(By.xpath("//*[@id = 'subjectsWrapper']/div/label"));
	}
	
	public WebElement hobbies_label() {
		return driver.findElement(By.xpath("//*[@id = 'hobbiesWrapper']/div/label"));
	}
	
	public WebElement photo_label() {
		return driver.findElement(By.xpath("//*[@id=\"subjects-label\" and text() = 'Picture']"));
	}

	public WebElement address_label() {
		return driver.findElement(By.id("currentAddress-label"));
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
	
	public WebElement mobile() {
		return driver.findElement(By.id("userNumber"));
	}
	
	public WebElement address() {
		return driver.findElement(By.id("currentAddress"));
	}
	
	public WebElement uploadPhoto() {
		return driver.findElement(By.id("uploadPicture"));
	}
	
	public WebElement subject() {
		return driver.findElement(By.xpath("//*[@id='subjectsContainer']/div/div[1]"));
	}
	
	public WebElement maths() {
		return driver.findElement(By.id("react-select-2-option-0"));
	}
	
	public WebElement chemistry() {
		return driver.findElement(By.id("react-select-2-option-1"));
	}
	
	public List<WebElement> genderRadio(){
		return driver.findElements(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div/input"));
	}
	
	public List<WebElement> hobbiesCheckbox(){
		return driver.findElements(By.xpath("//*[@id=\"hobbiesWrapper\"]/div/div/input"));
	} 
	
	public WebElement calender() {
		return driver.findElement(By.id("dateOfBirthInput"));
	}
	
	public WebElement birthMonthDrop() {
		return driver.findElement(By.xpath("//select[@class = 'react-datepicker__month-select']"));
	}
	
	public WebElement birthYearDrop() {
		return driver.findElement(By.xpath("//select[@class = 'react-datepicker__year-select']"));
	}
	
	public WebElement birthDate() {
		return driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));
	}
	
}
