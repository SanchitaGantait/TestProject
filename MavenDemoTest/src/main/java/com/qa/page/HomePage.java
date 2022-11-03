package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBaseclass.TestBaseClass;
import com.qa.testutil.TestUtil;

public class HomePage extends TestBaseClass {
	
	@FindBy(xpath="//a[@id='navbtn_tutorials']")
	WebElement lnkTutorials;
	
	@FindBy(xpath="")
	WebElement lnkLearnJava;
	
	  
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePage() 
	{
		return driver.getTitle();
	}
	
	public void clickOnTutorials() 
	{
		lnkTutorials.click();
	}
	
	public void clickOnLearnJava() 
	{
		TestUtil.ExplicitWaitElementClickable(lnkLearnJava);
	}
	
	
	

}
