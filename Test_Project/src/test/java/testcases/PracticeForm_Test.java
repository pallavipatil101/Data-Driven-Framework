package testcases;


import org.testng.annotations.Test;

import actions.LeftPanel;
import actions.PracticeForm;
import base.Base;

public class PracticeForm_Test extends Base{
	PracticeForm pf = new PracticeForm();
	
	@Test(priority = 0, groups = { "Navigation" } , description = "Navigate to Forms and then navigate to PracticeForm under it.")
	public void navigate_to_practiceform() {
		//HomePage hp = new HomePage();
		//hp.navigate_to_forms().navigate_to_practiceform();
		LeftPanel leftPanel = new LeftPanel();
		leftPanel.navigate_to_forms().navigate_to_practiceform();
	}
	
	@Test(priority = 1, description = "Verify labels of all form fields amd options")
	public void verify_labels() {
		pf.verify_name_label();
		pf.verify_email_label();
		pf.verify_gender_label();
		pf.verify_mobile_label();
		pf.verify_birthdate_label();
		pf.verify_subjects_label();
		pf.verify_hobbies_label();
		pf.verify_photo_label();
		pf.verify_address_label();
	}
	
	@Test(priority = 2, description = "Fill the form")
	public void enter_form_data() {
		pf.enter_first_name();
		pf.enter_last_name();
		pf.enter_email();
		pf.select_gender();
		pf.enter_mobile();
		pf.select_birthdate();
		pf.select_hobbies();
		pf.upload_photo();
		pf.enter_address();
		pf.select_subjects();
	}
	
	@Test(priority = 3, description = "Verify entered form data")
	public void verify_entered_form_data() {
		pf.verify_entered_name();
		pf.verify_entered_email();
		pf.verify_selected_gender();
		pf.verify_entered_mobile();
		pf.verify_selected_birthdate();
		pf.verify_selected_hobbies();
		pf.verify_entered_address();
		pf.verify_selected_subjects();
	}
	
	/*@Test(priority = 2, dataProvider="practiceformDP" , dataProviderClass = ExcelDataProvider.class, description = "Fill the form")
	public void enter_form_data(String label, String value) {
		pf.enter_first_name(label, value);
		pf.enter_last_name(label, value);
		pf.enter_email(label, value);
		pf.enter_mobile(label, value);
		pf.enter_address(label, value);
		pf.select_gender();
		pf.select_birthdate();
		pf.select_hobbies();
		pf.upload_photo();
		pf.select_subjects();
	}*/
}
