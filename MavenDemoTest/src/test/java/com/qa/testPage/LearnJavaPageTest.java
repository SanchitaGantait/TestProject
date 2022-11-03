package com.qa.testPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.page.LearnJavaPage;

public class LearnJavaPageTest 
{
	public LearnJavaPageTest() {
		super();
	}
	LearnJavaPage learnJavaPage;
	
	@Test(priority=1)
	public void verifyLearnJavaPage()
	{
		boolean flag = learnJavaPage.verifyLearnJavaPage();
		Assert.assertTrue(flag);
	}
	@Test(priority=2)
	public void getTopicsofLearnJava()
	{
		learnJavaPage.getTopicsofLearnJava();
	}
	

}
