package testcases;


import org.testng.annotations.Test;

import actions.HomePage;
import actions.PracticeForm;
import base.Base;
import utilities.ExcelDataProvider;

public class PracticeForm_Test extends Base{
	PracticeForm pf = new PracticeForm();
	
	@Test(priority = 0)
	public void navigate_to_practiceform() {
		HomePage hp = new HomePage();
		hp.navigate_to_forms().navigate_to_practiceform();
	}
	
	@Test(priority = 1)
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
	
	@Test(priority = 2)
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
	
	/*@Test(priority = 2, dataProvider="practiceformDP" , dataProviderClass = ExcelDataProvider.class)
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
