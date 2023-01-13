package com.test.StepDef.Google;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.test.constants.EnvironmentConstants;
import com.test.functions.API_functions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;

public class GoogleAPI {
	
	String access_token=EnvironmentConstants.Gmail_accesstoken;
	String Base_path=EnvironmentConstants.Gmail_URI;
	String UserID=EnvironmentConstants.User_ID;
	String response=null;
	String label_List=null;
	String label_ID=null;
	String mes_ID=null;
	
	@Given("Provided with accesstoken to access mypersonal gmail")
	public void provided_with_accesstoken_to_access_mypersonal_gmail() throws IOException {
		response=API_functions.FetchMessage(Base_path, access_token,UserID);
		
		JsonPath js = new JsonPath(response);
		assertNotNull("Failed to fetch mail ID", js.getString("messages[0].id"));
	}

	@When("I perform search the list of labels available in my gmail")
	public void i_perform_search_the_list_of_labels_available_in_my_gmail() throws IOException {
		label_List=API_functions.FetchLabel_list(Base_path, access_token, UserID);
	}
	
	@Then("^validate the actual count is matching against \"(.*)\"$")
	public void validate_the_actual_count_is_matching_against(String count) {
		
		JSONObject jsnobject = new JSONObject(label_List);
		JSONArray jsonArray = jsnobject.getJSONArray("labels");
		assertEquals(count, String.valueOf(jsonArray.length()),"Label count not matching");
	}

	@Then("^Verify the list contains \"(.*)\" keyword in it$")
	public void verify_the_list_contains_keyword_in_it(String keyword) {
		
		boolean res=false;
		
		JSONObject jsnobject = new JSONObject(label_List);
		JSONArray jsonArray = jsnobject.getJSONArray("labels");

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject item = jsonArray.getJSONObject(i);
			if(item.getString("name").contains("Unicef"))
			{
				res=true;
				break;
			}
		}
		assertEquals(res, true,"Unicef not found in label list");
		
	}

	@Then("^Find the respective labelID for \"(.*)\" label$")
	public void find_the_respective_label_id_for_label(String key) {
		
		JSONObject jsnobject = new JSONObject(label_List);
		JSONArray jsonArray = jsnobject.getJSONArray("labels");

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject item = jsonArray.getJSONObject(i);
			if(item.getString("name").contains("Unicef"))
			{
				label_ID=item.getString("id");
				break;
			}
		}
		assertNotNull("Failed to LabelID for UNICEF Label", label_ID);
	}

	@Then("Verify all the mail inside unicef is read")
	public void verify_all_the_mail_inside_unicef_is_read() throws IOException {
		response=API_functions.Label_Details(Base_path, access_token,UserID,label_ID);
		
		JsonPath js = new JsonPath(response);
		assertEquals(js.getString("messagesUnread"),"0","Unread Message count in the provided label is not 0");
	}

	@When("^I search for the latest mail from \"(.*)\" in inbox$")
	public void i_search_for_the_latest_mail_from_in_inbox(String key) throws IOException {
		response=API_functions.filtermail(Base_path, access_token,UserID,"INBOX",key);
	}

	@Then("^Using its ID validate its subject contains \"(.*)\"$")
	public void using_its_id_validate_its_subject_contains(String key) throws JSONException, IOException {

	JsonPath js = new JsonPath(response);
	response=API_functions.FetchMessage_detail(Base_path, access_token,UserID,js.getString("messages[0].id"));
	
	js = new JsonPath(response);
	assertTrue("Failed to match the content on the mail", js.getString("snippet").contains(key));
	}
}
