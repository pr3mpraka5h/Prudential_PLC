package com.test.StepDef.Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.functions.UI_functions;

import cucumber.api.java.en.Given;

public class myyoutube {
	
	static WebDriver drvier=null;
	
	static By play=By.xpath("//*[@class='ytp-play-button ytp-button']");
	static By mute=By.xpath("//*[@class='ytp-mute-button ytp-button']");
	
	int count=0;
	
	
	@Given("Provided Youtube")
	public void provided_youtube() throws InterruptedException {
		while(true)
		{
//			UI_functions.SendKeys(drvier, play, "F5");
			drvier=UI_functions.selenium_properties(drvier);
			drvier.get("https://www.youtube.com/watch?v=htL-p5PFAqk&t=6s");
			
			drvier.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			drvier.manage().window().maximize();
			
			Thread.sleep(5000);
			
			UI_functions.mouse_click(drvier, mute);
			UI_functions.mouse_click(drvier, play);
			
			Thread.sleep(35000);
			drvier.quit();
			System.out.println(count+1);
		}
		
	}
}


