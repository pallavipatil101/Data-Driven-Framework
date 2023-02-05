package actions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import base.Base;
import locators.BrokenLinks_locators;
import testcases.Accordian_Test;

public class BrokenLinks extends Base{
	
	public Logger log = LogManager.getLogger(Accordian_Test.class.getName());
	BrokenLinks_locators bll = new BrokenLinks_locators();
	String url = "";
	HttpURLConnection httpcon = null;
	int respCode;
	String respMsg = "";
	
	public void findBrokenLink() {
		for(WebElement link : bll.linksList())
		{
			url = link.getAttribute("href");
			if(url == null || url.isEmpty())
			{
				System.out.println("URL is either not configured for anchor tag or it is empty");
				log.info("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			
			try 
			{
				httpcon = (HttpURLConnection)(new URL(url).openConnection());
				httpcon.connect();
				respMsg = httpcon.getResponseMessage();
				respCode = httpcon.getResponseCode();

				if(respCode >= 400)
				{
					System.out.println(url+"--"+respCode+"--"+respMsg+"--is a broken link.");
					log.info(url+"--"+respCode+"--"+respMsg+"--is a broken link.");
				}
				else
				{
					System.out.println(url+"--"+respCode+"--"+respMsg+"--is a NOT a broken link.");
					log.info(url+"--"+respCode+"--"+respMsg+"--is a NOT a broken link.");
				}
			} 
			catch (IOException e) 
			{				
				e.printStackTrace();
			} 
		}
	}
	
	public void findBrokenImages() {
		for(WebElement img : bll.images()) {
			if (img.getAttribute("naturalWidth").equals("0"))
		    {
		        System.out.println(img.getAttribute("src") + " is a broken image.");
		    }
			else {
				System.out.println(img.getAttribute("src") + " is not a broken image.");
			}
		}
		
	}
}
