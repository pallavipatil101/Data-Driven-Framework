package actions;

import base.Base;
import locators.UploadDownload_locators;
import utilities.CommonUtilities;

public class UploadDownload extends Base{
	UploadDownload_locators upl = new UploadDownload_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void upload() {
		cu.send(upl.upload(), System.getProperty("user.dir")+"/src/test/resources/UploadFile.txt");
	}
	
	public void verify_upload_successful() {
		cu.isTrue(upl.uploadedFile().getText().contains("fakepath"));
	}
	
	public void download() {
		upl.download().click();
	}
}
