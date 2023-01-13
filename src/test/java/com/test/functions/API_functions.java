package com.test.functions;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.LogManager;
import org.apache.log4j.spi.LoggerRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class API_functions {
	
	public static String FetchMessage(String URI, String token, String user_ID) throws IOException {
		
		String getTokenResponse =
			given()
			.relaxedHTTPSValidation()
			.log()
			.all()
			.baseUri(URI)
			.header("Authorization", "Bearer " + token + "")
			.header("Content-Type", "application/json")
			.header("Accept", "application/json")
			.when()
			.get(user_ID+"/messages")
			.then()
			.extract().asString();
		
		return getTokenResponse;
	}
	
	public static String FetchLabel_list(String URI, String token, String user_ID) throws IOException {
		
		String getTokenResponse =
			given()
			.relaxedHTTPSValidation()
			.log()
			.all()
			.baseUri(URI)
			.header("Authorization", "Bearer " + token + "")
			.header("Content-Type", "application/json")
			.header("Accept", "application/json")
			.when()
			.get(user_ID+"/labels")
			.then()
			.extract().asString();
		
		return getTokenResponse;
	}

	
	public static String Label_Details(String URI, String token, String user_ID, String labelId) throws IOException {
		
		String getTokenResponse =
			given()
			.relaxedHTTPSValidation()
			.log()
			.all()
			.baseUri(URI)
			.header("Authorization", "Bearer " + token + "")
			.header("Content-Type", "application/json")
			.header("Accept", "application/json")
			.when()
			.get(user_ID+"/labels/"+labelId)
			.then()
			.extract().asString();
		
		return getTokenResponse;
	}

	public static String filtermail(String URI, String token, String user_ID, String group, String Key) throws IOException {
		
		String getTokenResponse =
			given()
			.relaxedHTTPSValidation()
			.log()
			.all()
			.baseUri(URI)
			.header("Authorization", "Bearer " + token + "")
			.header("Content-Type", "application/json")
			.header("Accept", "application/json")
			.queryParam("id", group)
			.queryParam("q", Key)
			.when()
			.get(user_ID+"/messages/")
			.then()
			.extract().asString();
		
		return getTokenResponse;
	}
	
public static String FetchMessage_detail(String URI, String token, String user_ID,String Msg_ID) throws IOException {
		
		String getTokenResponse =
			given()
			.relaxedHTTPSValidation()
			.log()
			.all()
			.baseUri(URI)
			.header("Authorization", "Bearer " + token + "")
			.header("Content-Type", "application/json")
			.header("Accept", "application/json")
			.when()
			.get(user_ID+"/messages/"+Msg_ID)
			.then()
			.extract().asString();
		
		return getTokenResponse;
	}
	
}
