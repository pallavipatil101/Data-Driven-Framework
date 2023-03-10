package testcases;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.Test;

import actions.BrokenLinks;
import actions.Elements;
import base.Base;

public class BrokenLinks_Test extends Base{
	BrokenLinks bl = new BrokenLinks();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to broken links under Elements")
	public void navigate_to_BrokenLinks() {
		//HomePage hp = new HomePage();	
		//hp.navigate_to_Elements().navigate_to_broken_links();
		Elements el = new Elements();
		el.navigate_to_broken_links();
	}
	
	@Test(priority = 1, description = "Find broken link among two present links")
	public void findBrokenLink() {
		bl.findBrokenLink();
	}
	
	@Test(priority = 2, description = "Find broken image among two present images")
	public void findBrokenImages() throws ClientProtocolException, IOException {
		bl.findBrokenImages();
	}
	
}
