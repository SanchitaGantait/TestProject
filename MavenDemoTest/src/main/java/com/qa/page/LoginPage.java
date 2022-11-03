package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBaseclass.TestBaseClass;

public class LoginPage extends TestBaseClass
{
	@FindBy(xpath ="")
	WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void Login()
	{
		//no login criteria has been given with username and password
		
		
	}

}
