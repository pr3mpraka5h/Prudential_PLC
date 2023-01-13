package com.test.functions;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;


public class UI_functions {
	
	public static WebDriver selenium_properties(WebDriver Driver)
	{
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			Driver = new ChromeDriver(options);
			
		return Driver;
	}
	
	public static void mouse_click(WebDriver Driver, By element)
	{
		Actions act = new Actions(Driver);
		WebElement Com = Driver.findElement(element);
		act.moveToElement(Com).click().perform();
	}
	
	
	public static void submit(WebDriver Driver, By element)
	{
		Driver.findElement(element).submit();
	}
	
	public static void SendKeys(WebDriver Driver,By element,String Key)
	{
		Driver.findElement(element).sendKeys(Key);
	}
	
	public static void Cleartext(WebDriver Driver,By element)
	{
		Driver.findElement(element).clear();
	}
	
	public static String Gettext(WebDriver Driver, By element)
	{
		return(	Driver.findElement(element).getText());
	}

	public static void Keyactions_Enter(WebDriver Driver, By element)
	{
		Driver.findElement(element).sendKeys(Keys.RETURN);
	}

	public static void Select_visibleText(WebDriver Driver, By element,String visibletext_value)
	{
		Select WE_SO= new Select(Driver.findElement(element));
		WE_SO.selectByVisibleText(visibletext_value);
	}
	
	public static void wait_visibleelement(WebDriver Driver, By element)
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(Driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public static List FindElements(WebDriver Driver, By element)
	{
		List elements;
		try {
			elements=Driver.findElements(element);
		}catch(Exception e)
		{
			System.out.println("Exception occured");
			elements=null;
		}
		return elements;
	}

	
	public static void Fwait(WebDriver driver,By element)
	{
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
				
				
				 WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
				     public WebElement apply(WebDriver driver) {
				       return driver.findElement(element);
				     }
				   });
	}
}
