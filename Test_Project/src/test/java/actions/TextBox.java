package actions;

import base.Base;
import locators.TextBox_locators;
import utilities.CommonUtilities;
import utilities.ExcelReader;

public class TextBox extends Base{
	CommonUtilities cu = new CommonUtilities();
	TextBox_locators tpl = new TextBox_locators();
	ExcelReader e = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/Data_DemoQA.xlsx");
	
	public void verify_FullName_label() {
		cu.verify_texts_equal("Full Name", tpl.fullName_label());
	}
	
	public void verify_Email_label() {
		cu.verify_texts_equal("Email", tpl.email_label());
	}
	
	public void verify_Current_Address_Label() {
		cu.verify_texts_equal("Current Address", tpl.currentAddress_label());
	}
	
	public void verify_Permanent_Address_Label() {
		cu.verify_texts_equal("Permanent Address", tpl.permanentAddress_label());
	}
	
	public void enter_FirstName(String label, String value) {
		if(label.contains("Name"))
		{
			cu.send(tpl.userName(), value);
		}
	}
	
	public void enter_Email(String label, String value) {
		if(label.contains("Email"))
		{
			cu.send(tpl.userEmail(), value);
		}
	}
	
	public void enter_CurrentAddress(String label, String value) {
		if(label.contains("Current"))
		{
			cu.send(tpl.currentAddress(), value);
		}
	}
	
	public void enter_PermanentAddress(String label, String value) {
		if(label.contains("Permanent"))
		{
			cu.send(tpl.permanentAddress(), value);
		}
	}
	
	public void verify_name_entered_successfully() {
		cu.verify_texts_equal("Pallavi Patil", tpl.userName());
	}
	
	public void verify_email_entered_successfully() {
		cu.verify_texts_equal("pallavi.patil@joshsoftware.com", tpl.userEmail());
	}

	public void verify_address1_entered_successfully() {
		cu.verify_texts_equal("Pune", tpl.currentAddress());
	}

	public void verify_address2_entered_successfully() {
		cu.verify_texts_equal("Miraj", tpl.permanentAddress());
	}
	
	public void click_Submit_Btn() {
		cu.scroll_to_element(tpl.submitBtn());
		tpl.submitBtn().click();
	}
	
	
	public void verify_Submitted_Name() {
		cu.scroll_to_element(tpl.submittedCurrentAddress());
		cu.verify_texts_equal("Name:Pallavi Patil", tpl.submittedName());
	}
	
	public void verify_Submitted_Email() {
		cu.verify_texts_equal("Email:pallavi.patil@joshsoftware.com", tpl.submittedEmail());
	}
	
	public void verify_Submitted_CurrentAddress() {
		cu.verify_texts_equal("Current Address :Pune", tpl.submittedCurrentAddress());
	}
	
	public void verify_Submitted_PermanentAddress() {
		cu.verify_texts_equal("Permananet Address :Miraj", tpl.submittedPermanentAddress());
	}
	
	
	
	public void enter_UserData() {
		cu.send(tpl.userName(), "Pallavi Patil");
		cu.send(tpl.userEmail(), "pallavi.patil@joshsoftware.com");
		cu.send(tpl.currentAddress(), "Pune");
		cu.send(tpl.permanentAddress(), "Miraj");
	}
	
	public void verify_Submitted_Data() {
		cu.scroll_to_element(tpl.submittedCurrentAddress());
		cu.verify_texts_equal("Name:Pallavi Patil", tpl.submittedName());
		cu.verify_texts_equal("Email:pallavi.patil@joshsoftware.com", tpl.submittedEmail());
		cu.verify_texts_equal("Current Address :Pune", tpl.submittedCurrentAddress());
		cu.verify_texts_equal("Permananet Address :Miraj", tpl.submittedPermanentAddress());
	}
}
