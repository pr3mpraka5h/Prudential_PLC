package com.test.Pagefunctions;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.functions.UI_functions;
import com.test.PageProperties.GooglePage_Properties;
import com.test.constants.*;

public class GooglePage_functions {
	
	public static WebDriver googlePageInvoke(WebDriver driver)
	{
		driver=UI_functions.selenium_properties(driver);
		driver.get(EnvironmentConstants.GoogleURL);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Google"))
		System.out.println("Page successfully invoked");
		else
			{
			System.out.println("Google title validation failed");
			System.exit(0);
			}
		return driver;
	}
	
	public static WebDriver googlesearch(WebDriver driver,String keyword)
	{
		UI_functions.Fwait(driver, GooglePage_Properties.Searchbar);
		UI_functions.SendKeys(driver, GooglePage_Properties.Searchbar, keyword);
		UI_functions.Keyactions_Enter(driver, GooglePage_Properties.Searchbar);
		return driver;
	}
	
	
	
	public static WebDriver googleValidate_navigate(WebDriver driver,String keyword)
	{
		String Actual=null;
		UI_functions.Fwait(driver, GooglePage_Properties.Prudential_1st_Occurance);
		Actual=UI_functions.Gettext(driver, GooglePage_Properties.Prudential_1st_Occurance);
		
		assertEquals(Actual, keyword,"Failed to Populate the expected URL on top");
		UI_functions.mouse_click(driver,  GooglePage_Properties.Prudential_1st_Occurance);
		return driver;
	}
	
	public static WebDriver Pagevalidate(WebDriver driver,String keyword)
	{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		assertEquals(title, keyword,"Failed to Open Prudential home page");
		return driver;
	}
	
	
	public static WebDriver googlesearchbar_textenter(WebDriver driver,String keyword) throws InterruptedException
	{
		UI_functions.Fwait(driver, GooglePage_Properties.Searchbar);
		UI_functions.SendKeys(driver, GooglePage_Properties.Searchbar, keyword);
		Thread.sleep(1000);
		return driver;
	}
	
	public static WebDriver Autopopulate_validate(WebDriver driver,String keyword) 
	{
		List<WebElement>  l= driver.findElements(GooglePage_Properties.Autopopulate_list);
		for(int i=0;i<l.size();i++) 
		{
			if(!l.get(i).getText().contains(keyword))
				System.out.println(l.get(i).getText() + "missed to have the keyword");
		}
		return driver;
	}
	
	public static WebDriver select_from_autopopulate(WebDriver driver,String keyword) 
	{
		List<WebElement>  l= driver.findElements(GooglePage_Properties.Autopopulate_list);
		
		if(l.get(0).getText().equals(keyword))
			l.get(0).click();
		else
			System.out.println("First populated value is not matching with FullKeyword");
		
		return driver;
	}
}
