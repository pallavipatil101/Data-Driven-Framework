package testcases;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.Test;

import actions.BrokenLinks;
import actions.HomePage;
import base.Base;

public class BrokenLinks_Test extends Base{
	BrokenLinks bl = new BrokenLinks();
	
	@Test(priority = 0)
	public void navigate_to_BrokenLinks() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_broken_links();
	}
	
	@Test(priority = 1)
	public void findBrokenLink() {
		bl.findBrokenLink();
	}
	
	@Test(priority = 2)
	public void findBrokenImages() throws ClientProtocolException, IOException {
		bl.findBrokenImages();
	}
	
}
