package com.qa.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBaseclass.TestBaseClass;
import com.qa.testutil.TestUtil;

public class LearnJavaPage extends TestBaseClass
{
	@FindBy(xpath="//span[text()='Tutorial']")
	WebElement javaTutoialHeader;
	
	@FindBy(xpath="//h2[text()='Java Classes']")
	WebElement lblJavaClasses;
	
	  
	public LearnJavaPage() 
	{
		PageFactory.initElements(driver, this);
	}
		
	public boolean verifyLearnJavaPage() 
	{
		return javaTutoialHeader.isDisplayed();
	}
		
	public void getTopicsofLearnJava() 
	{
		TestUtil.scrollToJavaClasses(lblJavaClasses);
		List<WebElement> listtopics = driver.findElements(By.xpath(lblJavaClasses+"/following-sibling::a"));
        System.out.println(listtopics.size());

        for (WebElement webElement : listtopics) 
        {
            String name = webElement.getText();
            System.out.println(name);
        }
	}
		
		

}
