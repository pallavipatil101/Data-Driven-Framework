package testcases;

import org.testng.annotations.Test;

import actions.Droppable;
import actions.HomePage;
import base.Base;

public class Droppable_Test extends Base{
	Droppable dr = new Droppable();
	
	@Test(priority = 0)
	public void navigate_to_droppable() {
		HomePage hp = new HomePage();
		hp.navigate_to_interactions().navigate_to_droppable();
	}
	
	@Test(priority = 1)
	public void simple_drag_drop() {
		dr.simple_drag_drop();
		dr.verify_simple_drop_successful();
	}
	
	@Test(priority = 2)
	public void accept_tab_dragdrop() {
		dr.switch_to_accept_tab();
		dr.not_acceptable_drop();
		dr.verifropy_not_accepted_drop();
		dr.acceptable_drop();
		dr.verify_drag_accepted();
	}
	
	@Test(priority = 3)
	public void prevent_propagation_tab_dragdrop() {
		dr.switch_to_propagation_tab();
		dr.greedy_inner_drop();
		dr.verify_greedy_inner_text();
		dr.verify_greedy_outer_text();
		dr.not_greedy_inner_drop();
		dr.verify_not_greedy_inner_text();
		dr.verify_not_greedy_outer_text();
	}
		
	@Test(priority = 4)
	public void revert_draggable_tab_dragdrop() {
		dr.switch_to_revert_tab();
		dr.revertable_drag_location_before();
		dr.revertable_drag();
		dr.revertable_drag_location_after();
		dr.verify_revertable_drag_location();	
		dr.not_revertable_drag_location_before();
		dr.not_revertable_drag();
		dr.not_revertable_drag_location_after();
		dr.verify_not_revertable_drag_location();

	}
}
