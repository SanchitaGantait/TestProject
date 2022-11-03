package com.qa.testutil;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBaseclass.TestBaseClass;

public class TestUtil extends TestBaseClass 
{
	
	static JavascriptExecutor js;
	static WebDriverWait wait;
	
	public static void scrollToJavaClasses(WebElement webelement) 
	{
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",webelement );
	} 
	public static void ExplicitWaitElementClickable(WebElement webelement) 
	{
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(webelement));
	       System.out.println("Element is clickable");
	       webelement.click();
	}
}
