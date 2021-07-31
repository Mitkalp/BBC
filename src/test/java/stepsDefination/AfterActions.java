package stepsDefination;

import org.openqa.selenium.WebDriver;
import utill.SeleniumDriver;

public class AfterActions {

	
	public void closing() {
		
		
	WebDriver driver =	SeleniumDriver.getDriver();
	
	SeleniumDriver.tearDown();
	}
}
