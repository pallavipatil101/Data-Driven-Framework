package actions;
import org.openqa.selenium.Keys;
import base.Base;
import locators.AutoComplete_locators;
import utilities.CommonUtilities;

public class AutoComplete extends Base{
	
	AutoComplete_locators ac = new AutoComplete_locators();
	CommonUtilities cu = new CommonUtilities();
	
	public void go_to_multi_colors_textbox() {
		cu.action().moveToElement(ac.multipleColors()).click().sendKeys("B").build().perform();
	}
	
	public void select_first_color() {
		cu.action().keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	}
	
	public void select_second_color() {
		cu.action().moveToElement(ac.multipleColors()).click().sendKeys("B").build().perform();
		cu.action().keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	}
	
	public void go_to_single_color_textbox() {
		cu.action().moveToElement(ac.singleColor()).click().sendKeys("R").build().perform();
	}
	
	public void select_single_color() {
		cu.action().keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	}

	
}
