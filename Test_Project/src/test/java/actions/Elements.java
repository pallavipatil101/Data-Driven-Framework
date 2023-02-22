package actions;

import base.Base;
import locators.Elements_page_locators;
import locators.LeftPanel_Locators;
import utilities.CommonUtilities;

public class Elements extends Base{
	
	Elements_page_locators epl = new Elements_page_locators();
	CommonUtilities cu = new CommonUtilities();
	LeftPanel_Locators leftPanel = new  LeftPanel_Locators();

	public TextBox navigate_to_textBox() {
		epl.get_textBox().click();
		return new TextBox();
	}
	
	public CheckBox navigate_to_checkbox() {
		epl.get_CheckBox().click();
		return new CheckBox();
	}
	
	public RadioButton navigate_to_radioButtons() {
		epl.get_RadioButton().click();
		return new RadioButton();
	}
	
	public WebTable navigate_to_webtable() {
		cu.scroll_to_element(epl.get_WebTables());
		epl.get_WebTables().click();
		return new WebTable();
	}
	
	public Buttons navigate_to_buttons() {
		cu.scroll_to_element(epl.get_Buttons());
		epl.get_Buttons().click();
		return new Buttons();
	}
	
	public Links navigate_to_links() {
		cu.scroll_to_element(epl.get_Links());
		epl.get_Links().click();
		return new Links();
	}
	
	public BrokenLinks navigate_to_broken_links() {
		cu.scroll_to_element(epl.get_BrokenLinks());
		epl.get_BrokenLinks().click();
		return new BrokenLinks();
	}
	
	public UploadDownload navigate_to_uploaddownload() {
		cu.scroll_to_element(epl.get_UploadDownload());
		epl.get_UploadDownload().click();
		return new UploadDownload();
	}
	
	public DynamicProperties navigate_to_dynamic_properties() {
		cu.scroll_to_element(epl.get_DynamicProperties());
		epl.get_DynamicProperties().click();
		return new DynamicProperties();
	}
	
}
