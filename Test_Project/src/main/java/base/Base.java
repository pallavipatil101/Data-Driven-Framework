package base;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver driver;
	public String parentwindow;
	public String childwindow;
	public Properties pro;
	
	@BeforeTest
	//@BeforeClass
	public void setup() throws IOException {
		pro = new Properties();
		String path = System.getProperty("user.dir")+"/src/main/resources/Config.properties";
		FileInputStream fin = new FileInputStream(path);
		pro.load(fin);
		
		String browserName = pro.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");

			String downloadPath = System.getProperty("user.dir")+"/DownloadedFiles";
			//Setting download path to the project download folder
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadPath);
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("prefs", chromePrefs);
			
			//Block pop-ups
			chromeOptions.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
			
			driver = new ChromeDriver(chromeOptions);		
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver");
			driver = new FirefoxDriver();
		} 
		
	    driver.manage().window().maximize();
	    
	    if(driver == null) { System.out.println("driver is null...!"); }
	    
	    driver.get(pro.getProperty("baseurl"));
	}
	
	public void handleWindows() {
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> iterator = windowids.iterator();
		parentwindow = iterator.next();
		childwindow = iterator.next();
	}
	
	@AfterTest
	//@AfterClass
	public void teardown() {
		driver.quit();
	}
}
