package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import base.Base;

public class CommonUtilities extends Base{
	public String parentwindow;
	public String childwindow;
	Assertion softAssert = new SoftAssert();
	public void scroll_to_element(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void verify_texts_equal(String expected, WebElement element) {
		String actual = element.getText();
		softAssert.assertEquals(actual, expected );		
	}
	
	public void verify_texts_notEqual(String expected, String actual) {
		softAssert.assertNotEquals(actual, expected );
	}
	
	public void isTrue(Boolean value) {
		softAssert.assertTrue(value);
	}
	
	public void isFalse(Boolean value) {
		softAssert.assertTrue(!value);
	}
	
	public void send(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public Actions action() {
		Actions action = new Actions(driver);
		return action;
	}
	
	public Select select_Drop_Down(WebElement element) {
		Select select = new Select(element);
		return select;
	}
	
	public WebDriverWait waiting() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait;
	}
	
	public void waitImplicitly() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public Alert switch_to_alert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	
	public void switch_to_frame(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void switch_to_frame(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switch_to_frame() {
		driver.switchTo().defaultContent();
	}
	
	public void handleWindows() {
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> iterator = windowids.iterator();
		parentwindow = iterator.next();
		childwindow = iterator.next();
	}
	
	public String takeScreenshot(String testName) throws IOException {
		
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir")+"/screenshots/"+testName+".png";
		FileUtils.copyFile(SourceFile,new File(destinationFilePath));
		return destinationFilePath;
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
}
