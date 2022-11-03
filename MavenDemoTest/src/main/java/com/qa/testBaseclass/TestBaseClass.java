
package com.qa.testBaseclass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver.Timeouts;

import com.qa.testutil.TestUtil;

public class TestBaseClass 
{
	public  static WebDriver driver;
	public static Properties prop;
	public void testbase()
	{
		try
		{
			prop = new Properties();
			FileInputStream fip = new FileInputStream(System.getProperty("user.dir")+ "/MavenDemoTest/src/main/java/"
					+ "config/config.properties");
					
					//("C:\\Users\\91629\\eclipse-workspace\\MavenDemoTest\\config.properties");
			prop.load(fip);
						//WebDriver driver = new ChromeDriver();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("URL"));

	}
	

}
