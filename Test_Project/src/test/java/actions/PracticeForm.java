package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import base.Base;
import locators.PracticeForm_locators;
import utilities.CommonUtilities;
import utilities.ExcelReader;

public class PracticeForm extends Base{
	
	CommonUtilities cu = new CommonUtilities();
	ExcelReader e = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/Data_DemoQA.xlsx");
	PracticeForm_locators pfl = new PracticeForm_locators();
	public Select select;
	
	public void verify_name_label() {
		cu.verify_texts_equal("Name", pfl.name_label() );
	}
	
	public void verify_email_label() {
		cu.verify_texts_equal("Email", pfl.email_label() );
	}
	
	public void verify_gender_label() {
		cu.verify_texts_equal("Gender", pfl.gender_label() );
	}
	
	public void verify_mobile_label() {
		cu.verify_texts_equal("Mobile(10 Digits)", pfl.mobile_label() );
	}
	
	public void verify_birthdate_label() {
		cu.verify_texts_equal("Date of Birth", pfl.birthdate_label() );
	}
	
	public void verify_subjects_label() {
		cu.verify_texts_equal("Subjects", pfl.subject_label() );
	}
	
	public void verify_hobbies_label() {
		cu.verify_texts_equal("Hobbies", pfl.hobbies_label() );
	}
	
	public void verify_photo_label() {
		cu.verify_texts_equal("Picture", pfl.photo_label() );
	}
	
	public void verify_address_label() {
		cu.verify_texts_equal("Current Address", pfl.address_label() );
	}
	
	/*public void enter_first_name(String label, String value) {
		if(label.contains("First"))
		{
			send(pfl.firstName(), value);
		}
	}
	
	public void enter_last_name(String label, String value) {
		if(label.contains("Last"))
		{
			send(pfl.lastName(), value);
		}
	}
	
	public void enter_email(String label, String value) {
		if(label.contains("Email"))
		{
			send(pfl.email(), value);
		}
	}
	
	public void enter_mobile(String label, String value) {
		if(label.contains("Mobile"))
		{
			send(pfl.mobile(), value);
		}
	}
	
	public void enter_address(String label, String value) {
		if(label.contains("Address"))
		{
			send(pfl.address(), value);
		}
	}*/
	
	public void enter_first_name() {
		cu.send(pfl.firstName(), e.getCellData("Form", "Values", 1));
	}
	
	public void enter_last_name() {
		cu.send(pfl.lastName(), e.getCellData("Form", "Values", 2));
	}
	
	public void enter_email() {
		cu.send(pfl.email(), e.getCellData("Form", "Values", 3));
	}
	
	public void enter_mobile() {
		cu.send(pfl.mobile(), e.getData("Form", "Values", 4));
	}
	
	public void enter_address() {
		cu.scroll_to_element(pfl.address());
		cu.send(pfl.address(), e.getCellData("Form", "Values", 6));
	}
	
	
	public void select_gender() {
		for(WebElement g : pfl.genderRadio())
		{
			if(g.getAttribute("value").equals("Female"))
			{
				if(!g.isSelected())
				{
					
					cu.action().moveToElement(g).click().build().perform();
				}
			}
		}
	}
	
	public void select_birthdate() {
		cu.scroll_to_element(pfl.address());
		pfl.calender().click();
		cu.select_Drop_Down(pfl.birthMonthDrop()).selectByVisibleText("March");
		cu.select_Drop_Down(pfl.birthYearDrop()).selectByVisibleText("1996");
		
		cu.action().moveToElement(pfl.birthDate()).click().build().perform();
	}
	
	public void select_hobbies() {
		for(WebElement hobby : pfl.hobbiesCheckbox())
		{
			if(hobby.getAttribute("value").equals("2")||hobby.getAttribute("value").equals("3"))
			{
				if(!hobby.isSelected())
				{
					cu.action().moveToElement(hobby).click().build().perform();
					
				}
			}
		}
	}
	
	public void upload_photo() {
		cu.send(pfl.uploadPhoto(), System.getProperty("user.dir")+"/src/test/resources/UploadPhoto.jpeg");
	}
	
	public void select_subjects() {
		cu.scroll_to_element(pfl.subject());
		cu.action().moveToElement(pfl.subject()).click().sendKeys("m").build().perform();
		cu.scroll_to_element(pfl.maths());
		cu.action().moveToElement(pfl.maths()).click().build().perform();
		cu.action().moveToElement(pfl.subject()).click().sendKeys("m").build().perform();
		cu.action().moveToElement(pfl.chemistry()).click().build().perform();
	}
}
