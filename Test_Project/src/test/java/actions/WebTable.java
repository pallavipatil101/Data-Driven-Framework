package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;
import locators.WebTable_locators;
import utilities.CommonUtilities;
import utilities.ExcelReader;

public class WebTable extends Base {
	CommonUtilities cu = new CommonUtilities();
	WebTable_locators wpl = new WebTable_locators();
	ExcelReader e = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/Data_DemoQA.xlsx");
	
	public void print_Row1() {
		for(WebElement row : wpl.tableRow1())
		{
			System.out.print(row.getText()+"--");
		}
		System.out.println();
	}
	
	public void click_on_editrow1() {
		wpl.editRow1().click();
	}
	
	public void edit_Row1() {
		cu.waiting().until(ExpectedConditions.elementToBeClickable(wpl.firstName()));
		wpl.firstName().clear();
		cu.send(wpl.firstName(), e.getCellData("Table", "Values", 1) );
		wpl.lastName().clear();
		cu.send(wpl.lastName(), e.getCellData("Table", "Values", 2));
		wpl.email().clear();
		cu.send(wpl.email(), e.getCellData("Table", "Values", 3));
		wpl.age().clear();
		cu.send(wpl.age(),e.getData("Table", "Values", 4));
		wpl.salary().clear();
		cu.send(wpl.salary(), e.getData("Table", "Values", 5));
		wpl.department().clear();
		cu.send(wpl.department(), e.getCellData("Table", "Values", 6));
	}
	
	public void submit_form() {
		wpl.submitBtn().click();
	}
	
	public void verify_edit() {
		for(WebElement row : wpl.tableRow1())
		{
			System.out.print("--"+row.getText());
		}
		System.out.println();
	}
	
	public void edit_Row(String label, String value) {
		cu.waiting().until(ExpectedConditions.elementToBeClickable(wpl.firstName()));
		
		if(label.contains("First"))
		{
			wpl.firstName().clear();
			cu.send(wpl.firstName(), value);			
		}
		
		if(label.contains("Last"))
		{
			wpl.lastName().clear();
			cu.send(wpl.lastName(), value);	
		}
		
		if(label.contains("mail"))
		{
			wpl.email().clear();
			cu.send(wpl.email(), value);			
		}
		
		if(label.contains("age"))
		{
			wpl.age().clear();
			cu.send(wpl.age(), value);	
		}
		
		if(label.contains("Salary"))
		{
			wpl.salary().clear();
			cu.send(wpl.salary(), value);	
		}
		
		if(label.contains("Depart"))
		{
			wpl.department().clear();
			cu.send(wpl.department(), value);	
		}
		
		
	}
	
}
