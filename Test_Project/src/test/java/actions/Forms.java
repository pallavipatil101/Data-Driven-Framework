package actions;

import base.Base;
import locators.Forms_page_locators;
import utilities.CommonUtilities;

public class Forms extends Base{
	Forms_page_locators fpl = new Forms_page_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public PracticeForm navigate_to_practiceform() {
		cu.scroll_to_element(fpl.practiceForm());
		fpl.practiceForm().click();
		return new PracticeForm();
	}
}
