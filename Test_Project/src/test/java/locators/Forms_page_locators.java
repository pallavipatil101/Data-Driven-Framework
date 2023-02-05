package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Forms_page_locators extends Base {
	
	public WebElement practiceForm() {
		return driver.findElement(By.xpath("//span[text()='Practice Form']"));
	}
}
