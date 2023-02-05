package actions;

import base.Base;
import locators.Widget_page_locators;
import utilities.CommonUtilities;

public class Widgets extends Base {

	Widget_page_locators wpl = new Widget_page_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public Accordian navigate_to_accordian() {
		cu.scroll_to_element(wpl.accordian());
		wpl.accordian().click();
		return new Accordian();
	}
	
	public AutoComplete navigate_to_autocomplete() {
		cu.scroll_to_element(wpl.autoComplete());
		wpl.autoComplete().click();
		return new AutoComplete();
	}
	
	public DatePicker navigate_to_datepicker() {
		cu.scroll_to_element(wpl.datePicker());
		wpl.datePicker().click();
		return new DatePicker();
	}
	
	public Slider navigate_to_slider() {
		cu.scroll_to_element(wpl.slider());
		wpl.slider().click();
		return new Slider();
	}
	
	public ProgressBar navigate_to_progressbar() {
		cu.scroll_to_element(wpl.progreeBar());
		wpl.progreeBar().click();
		return new ProgressBar();
	}
	
	public Tabs navigate_to_tabs() {
		cu.scroll_to_element(wpl.tabs());
		wpl.tabs().click();
		return new Tabs();
	}
	
	public ToolTips navigate_to_tooltips() {
		cu.scroll_to_element(wpl.toolTips());
		wpl.toolTips().click();
		return new ToolTips();
	}
	
	public Menu navigate_to_menu() {
		cu.scroll_to_element(wpl.menu());
		wpl.menu().click();
		return new Menu();
	}
	
	public SelectMenu navigate_to_selectmenu() {
		cu.scroll_to_element(wpl.selectMenu());
		wpl.selectMenu().click();
		return new SelectMenu();
	}
}
