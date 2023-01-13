package com.test.StepDef.Google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.PageProperties.GooglePage_Properties;
import com.test.Pagefunctions.GooglePage_functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleUI 
{
	static WebDriver driver;
	String Keyword=null;
	String title="Prudential plc: Celebrating life";
	String home_title="Celebrating life – Prudential plc";
	
	@Given("^Provided with search keyword \"(.*)\"$")
	public void provided_with_search_keyword(String arg1) {
		Keyword=arg1;
		driver=GooglePage_functions.googlePageInvoke(driver);
	}

	@When("Perform search operation for the given keyword on google")
	public void perform_search_operation_for_the_given_keyword_on_google() {
		driver=GooglePage_functions.googlesearch(driver,Keyword);
	}

	@Then("Verify the top response as expected and Navigate")
	public void verify_the_top_response_as_expected_and_navigate() {
		driver=GooglePage_functions.googleValidate_navigate(driver, title);
	}
	
	@And("Verify that the landed page is PrudentialPLC homepage")
	public void verify_that_the_landed_page_is_prudential_plc_homepage() {
		driver=GooglePage_functions.Pagevalidate(driver, home_title);
	}
	
	@Then("Close the browser and Quit the Driver")
	public void close_the_browser_and_quit_the_driver() {
		driver.quit();
	}
	
	@When("Enter keyword should auto populate all relavant suggestions")
	public void enter_keyword_should_auto_populate_all_relavant_suggestions() throws InterruptedException {
		driver=GooglePage_functions.googlesearchbar_textenter(driver, Keyword);
	}

	@Then("Validate all the recommended list contains the provided keyword or not")
	public void validate_all_the_recommended_list_contains_the_provided_keyword_or_not() {
		driver=GooglePage_functions.Autopopulate_validate(driver, Keyword);
	}

	@Then("^Choose \"(.*)\" from the recommandation and validate the populated top response$")
	public void choose_from_the_recommandation_and_validate_the_populated_top_response(String full_key) {
		driver=GooglePage_functions.select_from_autopopulate(driver, full_key);
	}


	

}
