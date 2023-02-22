package actions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.Base;
import locators.Droppable_locators;
import utilities.CommonUtilities;

public class Droppable extends Base{
	CommonUtilities cu = new CommonUtilities();
	Droppable_locators drop = new Droppable_locators();
	public String locBefore;
	public String locAfter;
	
	
	public void simple_drag_drop() {
		cu.verify_texts_equal("Drop here", drop.droppedMessageSimple());
		cu.action().dragAndDrop(drop.draggableSimple(), drop.droppableSimple()).build().perform();
	}
	
	public void verify_simple_drop_successful() {
		cu.verify_texts_equal("Dropped!", drop.droppedMessageSimple());
	}
	
	public void switch_to_accept_tab() {
		for(WebElement tab : drop.droppableTabsList())
		{
			if(tab.getText().equals("Accept"))
			{
				tab.click();
			}
		}
	}
	
	public void not_acceptable_drop() {
		cu.verify_texts_equal("Drop here", drop.droppedMessageAccept());
		cu.action().dragAndDrop(drop.draggableNotAcceptable(), drop.droppableAccept()).build().perform();
	}
	
	public void verifropy_not_accepted_drop() {
		cu.verify_texts_equal("Drop here", drop.droppedMessageAccept());
	}
	
	public void acceptable_drop() {
		cu.verify_texts_equal("Drop here", drop.droppedMessageAccept());
		cu.action().dragAndDrop(drop.draggableAcceptable(), drop.droppableAccept()).build().perform();
	}
	
	public void verify_drag_accepted() {
		cu.verify_texts_equal("Dropped!", drop.droppedMessageAccept());
	}
	
	public void switch_to_propagation_tab() {
		for(WebElement tab : drop.droppableTabsList())
		{
			if(tab.getText().equals("Prevent Propogation"))
			{
				tab.click();
			}
		}
	}
	
	public void greedy_inner_drop() {
		cu.scroll_to_element(drop.droppableInnerGreedy());
		cu.verify_texts_equal("Inner droppable (greedy)", drop.innerGreedyMessage());
		cu.action().dragAndDrop(drop.draggablePreventPropagation(), drop.droppableInnerGreedy()).build().perform();
	}
	
	public void verify_greedy_inner_text() {
		cu.scroll_to_element(drop.innerGreedyMessage());
		cu.verify_texts_equal("Dropped!", drop.innerGreedyMessage());
	}
	
	public void verify_greedy_outer_text() {
		cu.verify_texts_equal("Outer droppable", drop.outerGreedyMessage());
	}
	
	public void not_greedy_inner_drop() {
		cu.scroll_to_element(drop.droppableOuterNotGreedy());
		cu.verify_texts_equal("Inner droppable (not greedy)", drop.innerNotGreedyMessage());
		cu.action().dragAndDrop(drop.draggablePreventPropagation(), drop.droppableInnerNotGreedy()).build().perform();
	}
	
	public void verify_not_greedy_inner_text() {
		cu.verify_texts_equal("Dropped!", drop.innerNotGreedyMessage());
	}
	
	public void verify_not_greedy_outer_text() {
		cu.verify_texts_equal("Dropped!", drop.outerNotGreedyMessage());
	}
	
	public void switch_to_revert_tab() {
		for(WebElement tab : drop.droppableTabsList())
		{
			if(tab.getText().equals("Revert Draggable"))
			{
				tab.click();
			}
		}
	}
	
	public void revertable_drag_location_before() {
		locBefore = drop.draggableRevertable().getAttribute("style");
	}
	
	public void revertable_drag() {
		cu.scroll_to_element(drop.draggableRevertable());
		cu.action().dragAndDrop(drop.draggableRevertable(), drop.droppableRevert()).build().perform();
	}
	
	public void revertable_drag_location_after() {
		locAfter = drop.draggableRevertable().getAttribute("style");
	}
	
	public void verify_revertable_drag_location() {
		Assert.assertNotEquals(locBefore, locAfter);
	}

	public void not_revertable_drag_location_before() {
		locBefore = drop.draggableNotRevertable().getAttribute("style");
	}
	
	public void not_revertable_drag() {
		cu.action().dragAndDrop(drop.draggableNotRevertable(), drop.droppableRevert()).build().perform();
	}
	
	public void not_revertable_drag_location_after() {
		locAfter = drop.draggableNotRevertable().getAttribute("style");
	}

	public void verify_not_revertable_drag_location() {
		Assert.assertNotEquals(locBefore, locAfter);
	}
}
