package org.Pojo;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPass extends BaseClass{

	public UserPass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement txtUsername;
	
	@FindBy(name="password")
	private WebElement txtPass;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashBoardBtn;
}
