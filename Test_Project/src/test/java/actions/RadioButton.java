package actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import base.Base;
import locators.RadioButton_locators;
import utilities.CommonUtilities;

public class RadioButton extends Base{
	CommonUtilities cu = new CommonUtilities();
	RadioButton_locators rpl = new RadioButton_locators();
	Logger log = LogManager.getLogger(RadioButton.class.getName());
	
	public void click_RadioButton() {
		for(WebElement radio : rpl.radioButtonsList())
		{
			if(radio.getAttribute("for").equals("yesRadio"))
			{
				if(!radio.isSelected())
				{
					radio.click();
				}
			}
		}
	}
	
	public void verify_Radio_Result() {
		cu.verify_texts_equal("Yes",rpl.radioButtonResult());
	}
	
	public void verify_Disabled_Radio() {
		for(WebElement radio : rpl.radioButtonsList())
		{
			if(radio.getAttribute("class").contains("disabled"))
			{
				log.info(radio.getAttribute("for")+" is disabled.");
				System.out.println(radio.getAttribute("for")+" is disabled.");
			}
		}
	}
}
