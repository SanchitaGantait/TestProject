package com.qa.testPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.page.HomePage;
import com.qa.testBaseclass.TestBaseClass;

public class HomePageTest extends TestBaseClass 
{
	public HomePageTest() {
		super();
	}
	
	HomePage homePage;
	
	
	@Test(priority=1)
	public void verifyHomePage(){
		String homePageTitle = homePage.verifyHomePage();
		Assert.assertEquals(homePageTitle, "W3 school Home Title not matched");
	}
	@Test(priority=2)
	public void verifyLearnJavaPage()
	{
		homePage.clickOnTutorials();
		homePage.clickOnLearnJava();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
