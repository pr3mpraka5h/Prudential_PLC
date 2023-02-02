package com.test.StepDef.Google;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zealie 
{
	static WebDriver driver = null;
	static By Country_Filter= By.xpath("//*[@class='pi pi-filter-icon pi-filter ng-tns-c73-5']");
	static By Coutnry_Dropdown=By.xpath("//*[@id='pr_id_5_label']");
	static By Coutnry_Droplist=By.xpath("//*[@class='p-dropdown-items ng-star-inserted']//li");
	static By Coutnry_text=By.xpath("//*[@class='p-inputtext p-component p-element ng-star-inserted']");
	static By apply=By.xpath("//*[@class='p-element p-button-sm ng-tns-c73-5 p-button p-component ng-star-inserted']");
	static By Date_sort=By.xpath("//*[@psortablecolumn='date']//*[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']");
	static By table_content=By.xpath("//*[@class='p-element p-datatable-tbody']/tr");
	
	
	
	
	public static void main(String a[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		driver = new ChromeDriver(options);
		
		driver.get("https://primeng.org/table");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		assertEquals(title, "PrimeNG","Page Title validation Failed");
		
		Thread.sleep(5000);
		WebElement wb=driver.findElement(Country_Filter);
		wb.click();
		
		wb=driver.findElement(Coutnry_Dropdown);
		wb.click();
		Thread.sleep(1000);
		
		List<WebElement> l=driver.findElements(Coutnry_Droplist);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText().toString());
			
			if(l.get(i).getText().toString().compareTo("Ends with")==0)
				l.get(i).click();
		}
		
		driver.findElement(Coutnry_text).sendKeys("A");
		
		wb=driver.findElement(apply);
		wb.click();
		
		wb=driver.findElement(Date_sort);
		wb.click();
		
		
		l=driver.findElements(table_content);
		List<WebElement> row=null;
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText().toString());
			if(l.get(i).getText().toString().contains("Stephen Shaw"))
			{
				row=l.get(i).findElements(By.xpath(".//td"));
				assertEquals(row.get(2).getText().toString(),"Colombia","Country Mismatch");
				assertEquals(row.get(3).getText().toString(),"Stephen Shaw","Name Mismatch");
				assertEquals(row.get(5).getText().toString(),"$96,709.00","Balance Mismatch");
				assertEquals(row.get(6).getText().toString(),"PROPOSAL","Activity Mismatch");
				break;
			}
//			if(l.get(i).getText().toString().compareTo("Ends with")==0)
//				l.get(i).click();
		}
		driver.quit();
	}
}
