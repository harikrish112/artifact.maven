package org.StepDefinition;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class LaunchBrowser extends BaseClass{

	public static WebDriver driver;
	
	@Before
	public void beforeMethod() {
		
   launchBrowser();
	maximize();
	loadUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@After
private void afterMethod() {
	toQuit();
}

}