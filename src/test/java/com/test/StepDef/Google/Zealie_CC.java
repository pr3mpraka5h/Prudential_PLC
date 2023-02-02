package com.test.StepDef.Google;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.test.PageProperties.PrimeNG_Properties;
import com.test.Pagefunctions.PrimeNGPage_Functions;

public class Zealie_CC 
{
	static WebDriver driver;
	
	@Given("^Provided with PrimeNG Page Details$")
	public void provided_with_PrimeNG_Page_Details() throws Throwable {
		driver=PrimeNGPage_Functions.PrimeNGpageInvoke(driver);
	}

	@When("^I Navigate to PrimeNG page$")
	public void i_Navigate_to_PrimeNG_page() throws Throwable {
//		driver=PrimeNGPage_Functions.PrimeNGpageInvoke(driver);
	}

	@When("^Perform Country Filter with \"([^\"]*)\" Alogn with \"([^\"]*)\" Serchkeyword$")
	public void perform_Country_Filter_with_Alogn_with_Serchkeyword(String Filter, String SearchKey) throws Throwable {
		driver=PrimeNGPage_Functions.CountryFilter(driver,Filter,SearchKey);
	}

	@When("^Sort Date with ascending$")
	public void sort_Date_with_ascending() throws Throwable {
		driver=PrimeNGPage_Functions.DateSort_asc(driver);
	}

	@Then("^Validate table content with \"([^\"]*)\"$")
	public void validate_table_content_with(String ValidaationKey) throws Throwable {
		driver=PrimeNGPage_Functions.Table_validation(driver, ValidaationKey);
		driver.quit();
	}

}
