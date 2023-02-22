package testcases;

import org.testng.annotations.Test;

import actions.Elements;
import actions.UploadDownload;
import base.Base;

public class UploadDownload_Test extends Base{
	UploadDownload ud = new UploadDownload();
		
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to Upload-Download under Elements")
	public void navigateToButtons() {
		//HomePage hp = new HomePage();	
		//hp.navigate_to_Elements().navigate_to_uploaddownload();
		Elements el = new Elements();
		el.navigate_to_uploaddownload();
	}
	
	@Test(priority = 1, description = "Upload a textfile")
	public void uploadFile() {
		ud.upload();
		ud.verify_upload_successful();
	}
	
	@Test(priority = 2, description = "Download the file")
	public void downloadFile() {
		ud.download();
	}
}
