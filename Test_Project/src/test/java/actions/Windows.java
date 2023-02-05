package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;
import locators.Windows_locators;
import utilities.CommonUtilities;

public class Windows extends Base{
	Windows_locators wl = new Windows_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void open_new_tab() {
		wl.newTab().click();
	}
	
	public void verify_newtab_heading() {
		cu.verify_texts_equal("This is a sample page", wl.newTabHeading());
	}
	
	public void open_new_window() {
		wl.newWindow().click();
	}
	
	public void verify_newwindow_heading() {
		cu.verify_texts_equal("This is a sample page", wl.newWindowHeading());
		driver.close();
	}
	
	public void open_msg_window() {
		wl.messageWindow().click();
	}
		
	public void verify_msgwindow_heading() {
		cu.waiting().until(ExpectedConditions.visibilityOf(wl.msgWindowHeading()));
		cu.verify_texts_equal("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.", wl.msgWindowHeading());
	}
	
	public void switch_to_newwindow() {
		handleWindows();
		driver.switchTo().window(childwindow);
	}
	
	public void switch_to_parentwindow() {
		driver.switchTo().window(parentwindow);
	}
}

