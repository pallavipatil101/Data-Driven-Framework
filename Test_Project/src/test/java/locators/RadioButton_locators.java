package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class RadioButton_locators extends Base {
	public List<WebElement> radioButtonsList() {
		return driver.findElements(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div/label"));
	}
	public WebElement radioButtonResult() {
		//return driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/p/span"));
		return driver.findElement(By.xpath("//*[@class = 'text-success']"));
	}
}
