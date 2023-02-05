package testcases;

import org.testng.annotations.Test;

import actions.WebTable;
import actions.HomePage;
import base.Base;
import utilities.ExcelDataProvider;

public class Webtable_Test extends Base{
	public WebTable wt = new WebTable();
	
	@Test(priority = 0, enabled = true)
	public void navigate_to_webtable() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_webtable();
	}
	
	@Test(priority = 1)
	public void printRow1() {
		wt.print_Row1();
		wt.click_on_editrow1();
	}
	
	@Test(priority = 2, enabled = false)
	public void edit_Row1() {
		wt.click_on_editrow1();
		wt.edit_Row1();
	}
	
	@Test(priority = 2, dataProvider="webtableDP" , dataProviderClass = ExcelDataProvider.class, enabled = true)
	public void edit_Row1(String label, String value) {
		wt.edit_Row(label, value);
	}
	
	@Test(priority = 3)
	public void submit_Data() {
		wt.submit_form();
	}
	
	@Test(priority = 4)
	public void verify_Edits_to_Row1() {
		wt.verify_edit();
	}
}
