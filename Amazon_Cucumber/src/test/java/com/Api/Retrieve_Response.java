package com.Api;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Retrieve_Response {

@Test
public void demo() {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification request = RestAssured.given();
	Response response =  request.get("/api/register");
	 String statusLine = response.getStatusLine();
	 System.out.println("StatusLine :"+statusLine );
	  String responseBody = response.getBody().asString();
	 System.out.println(responseBody);
	 int statusCode = response.getStatusCode();
	 Assert.assertEquals(200, statusCode);
	 System.out.println("Validation Succesfully");
	
}
	
}
