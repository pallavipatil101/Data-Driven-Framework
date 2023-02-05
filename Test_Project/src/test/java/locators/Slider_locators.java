package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class Slider_locators extends Base{

		public WebElement sliderButton() {
			return driver.findElement(By.xpath("//input[@class = 'range-slider range-slider--primary']"));
		}
		
		public WebElement sliderValue() {
			return driver.findElement(By.id("sliderValue"));
		}
}
