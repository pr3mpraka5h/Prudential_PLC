package com.test.StepDef.Google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.functions.UI_functions;

import cucumber.api.java.en.Given;

public class myyoutube1 {
	
	
static WebDriver drvier=null;
	
	static By play=By.xpath("//*[@class='ytp-play-button ytp-button']");
	static By mute=By.xpath("//*[@class='ytp-mute-button ytp-button']");
	static By searchbar1233=By.xpath("//*[@id='search-input']");
	static By searchbar123=By.xpath("//*[@class='ytd-searchbox']");
	static By searchbar1111=By.xpath("//*[@class='ytd-searchbox-spt']");
	
	static By searchbar=By.xpath("//*[@name='search_query']");
	
	
	
	int count=0;
	@Given("Provided 1Youtube1")
	public void provided_1youtube1() throws InterruptedException {
		
		while(true)
		{
		
		drvier=UI_functions.selenium_properties(drvier);
		drvier.get("https://www.youtube.com");
		

		drvier.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		drvier.manage().window().maximize();
		Thread.sleep(2000);
		UI_functions.wait_visibleelement(drvier, searchbar);
		
		UI_functions.SendKeys(drvier, searchbar, "live&beyourself");
		UI_functions.mouse_click(drvier, searchbar);
		UI_functions.Keyactions_Enter(drvier, searchbar);
		
		By pa =By.xpath("//*[@class='style-scope ytd-page-manager']/div[@id='container']//*[@id='contents' and @class='style-scope ytd-section-list-renderer']//*[@id='contents' and @class='style-scope ytd-item-section-renderer']");
		
		Thread.sleep(2000);
		WebElement p=drvier.findElement(pa);
	      List<WebElement> d = p.findElements(By.xpath(".//*"));
	      for ( WebElement j : d ) {
	         System.out.println(j.getText().toString());
	         
	         if(j.getText().toString().equals("Live&BeYourself")) {
	        	 j.click();
	        	 break;
	         }
	      }

	      By file=By.xpath("//*[@id='video-title' and @title='Love Story of Dog']");
	      By file1=By.xpath("//*[@id='scroll-container' and @class='style-scope yt-horizontal-list-renderer']//*[contains(text(),'Love Story of Dog')]");
	      
	    
	      Thread.sleep(2000);
	      UI_functions.mouse_click(drvier, file1);
	      Thread.sleep(1000);
	      UI_functions.mouse_click(drvier, mute);

	      Thread.sleep(35000);
		  drvier.quit();
		System.out.println(count+1);
		}
		
	}


}
