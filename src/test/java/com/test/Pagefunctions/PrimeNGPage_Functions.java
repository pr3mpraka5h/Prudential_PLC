package com.test.Pagefunctions;

import static org.testng.Assert.assertEquals;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.PageProperties.PrimeNG_Properties;
import com.test.constants.EnvironmentConstants;
import com.test.functions.UI_functions;

public class PrimeNGPage_Functions 
{
	
	public static WebDriver PrimeNGpageInvoke(WebDriver driver)
	{
		
		driver=UI_functions.selenium_properties(driver);
		driver.get(EnvironmentConstants.GoogleURL);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://primeng.org/table");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		assertEquals(title, "PrimeNG","Page Title validation Failed");	
	
		return driver;
	}
	
	
	public static WebDriver CountryFilter(WebDriver driver,String type,String Keyword) throws InterruptedException
	{
		WebElement wb=driver.findElement(PrimeNG_Properties.Country_Filter);
		wb.click();
		wb=driver.findElement(PrimeNG_Properties.Coutnry_Dropdown);
		wb.click();
		Thread.sleep(1000);
		List<WebElement> l=driver.findElements(PrimeNG_Properties.Coutnry_Droplist);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText().toString());
			if(l.get(i).getText().toString().compareTo(type)==0)
				l.get(i).click();
		}
		driver.findElement(PrimeNG_Properties.Coutnry_text).sendKeys(Keyword);
		wb=driver.findElement(PrimeNG_Properties.apply);
		wb.click();
		return driver;
	}
	
	public static WebDriver DateSort_asc(WebDriver driver)
	{
		WebElement wb= driver.findElement(PrimeNG_Properties.Date_sort);
		wb.click();
		
		return driver;
	}
	
	

	public static WebDriver Table_validation(WebDriver driver,String Keyword)
	{
		List<WebElement> l=driver.findElements(PrimeNG_Properties.table_content);
		List<WebElement> row=null;
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText().toString());
			if(l.get(i).getText().toString().contains(Keyword))
			{
				row=l.get(i).findElements(By.xpath(".//td"));
//				assertEquals(row.get(2).getText().toString(),"Colombia","Country Mismatch");
				assertEquals(row.get(3).getText().toString(),Keyword,"Name Mismatch");
//				assertEquals(row.get(5).getText().toString(),"$96,709.00","Balance Mismatch");
//				assertEquals(row.get(6).getText().toString(),"PROPOSAL","Activity Mismatch");
				break;
			}
		}
		return driver;
	}
	
}
