package testcases;

import org.testng.annotations.Test;

import actions.TextBox;
import actions.HomePage;
import base.Base;
import utilities.ExcelDataProvider;

public class Textbox_Test extends Base{
	public TextBox tb = new TextBox();
	
	@Test(priority =0)
	public void navigate_to_textbox() {
		
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_textBox();		
	}
	
	@Test(priority = 1)
	public void verify_labels() {
		tb.verify_FullName_label();
		tb.verify_Email_label();
		tb.verify_Current_Address_Label();
		tb.verify_Permanent_Address_Label();
	}
	
	@Test(priority = 2, dataProvider="textboxDP" , dataProviderClass = ExcelDataProvider.class)
	public void enter_data(String label, String value) {
		tb.enter_FirstName(label, value);
		tb.enter_Email(label, value);
		tb.enter_CurrentAddress(label, value);
		tb.enter_PermanentAddress(label, value);
	}
	
	@Test(priority = 3)
	public void click_submit() {
		tb.click_Submit_Btn();
	}
	
	@Test(priority = 4)
	public void verify_submitted_data() {
		tb.verify_Submitted_Name();
		tb.verify_Submitted_Email();
		tb.verify_Submitted_CurrentAddress();
		tb.verify_Submitted_PermanentAddress();
	}
}
