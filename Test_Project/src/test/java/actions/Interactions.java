package actions;

import base.Base;
import locators.Interactions_page_locators;
import utilities.CommonUtilities;

public class Interactions extends Base{
	Interactions_page_locators ipl = new Interactions_page_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public Sortable navigate_to_sortable() {
		cu.scroll_to_element(ipl.sortable());
		ipl.sortable().click();
		return new Sortable();
	}
	
	public Selectable navigate_to_selectable() {
		cu.scroll_to_element(ipl.selectable());
		ipl.selectable().click();
		return new Selectable();
	}
	
	public Resizable navigate_to_resizable() {
		cu.scroll_to_element(ipl.resizable());
		ipl.resizable().click();
		return new Resizable();
	}
	
	public Droppable navigate_to_droppable() {
		cu.scroll_to_element(ipl.droppable());
		ipl.droppable().click();
		return new Droppable();
	}
	
	public Draggable navigate_to_draggable() {
		cu.scroll_to_element(ipl.draggable());
		ipl.draggable().click();
		return new Draggable();
	}
	
}
