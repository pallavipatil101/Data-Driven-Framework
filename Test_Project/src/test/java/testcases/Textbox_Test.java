package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import actions.TextBox;
import actions.HomePage;
import base.Base;
import utilities.ExcelDataProvider;

public class Textbox_Test extends Base{
	public TextBox tb = new TextBox();
	Logger log = LogManager.getLogger(Textbox_Test.class.getName());
	
	@Test(priority =0, groups = { "Navigation" } , description = "Navigate to Elements and then to textbox")
	public void navigate_to_textbox() {
		
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_textBox();
		log.info("Navigated to Elements page and then to textbox");
	}
	
	@Test(priority = 1, description = "Verify labels of all textboxes")
	public void verify_labels() {
		tb.verify_FullName_label();
		tb.verify_Email_label();
		tb.verify_Current_Address_Label();
		tb.verify_Permanent_Address_Label();
		log.info("Verified the textbox labels");
	}
	
	@Test(priority = 2, dataProvider="textboxDP" , dataProviderClass = ExcelDataProvider.class, description = "Fill the textboxes")
	public void enter_data(String label, String value) {
		tb.enter_FirstName(label, value);
		tb.enter_Email(label, value);
		tb.enter_CurrentAddress(label, value);
		tb.enter_PermanentAddress(label, value);
		log.info("Entered data into textboxes");
	}
	
	
	@Test(priority = 3, description = "Verify data entered into textboxes")
	public void verify_entered_data() {
		tb.verify_name_entered_successfully();
		tb.verify_email_entered_successfully();
		tb.verify_address1_entered_successfully();
		tb.verify_address2_entered_successfully();
		log.info("Verified that data has been successfully entered into textboxes");
	}
	
	@Test(priority = 4, description = "Click on submit button")
	public void click_submit() {
		tb.click_Submit_Btn();
		log.info("Submit the data by clicking submit button");
	}
	
	@Test(priority = 5, description = "Verify if data is submitted successfully")
	public void verify_submitted_data() {
		tb.verify_Submitted_Name();
		tb.verify_Submitted_Email();
		tb.verify_Submitted_CurrentAddress();
		tb.verify_Submitted_PermanentAddress();
		log.info("Verified if data has been submitted successfully");
	}
}
