package testcases;

import org.testng.annotations.Test;

import actions.UploadDownload;
import actions.HomePage;
import base.Base;

public class UploadDownload_Test extends Base{
	UploadDownload ud = new UploadDownload();
		
	@Test(priority = 0)
	public void navigateToButtons() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_uploaddownload();
	}
	
	@Test(priority = 1)
	public void uploadFile() {
		ud.upload();
	}
	
	@Test(priority = 2)
	public void downloadFile() {
		ud.download();
	}
}
