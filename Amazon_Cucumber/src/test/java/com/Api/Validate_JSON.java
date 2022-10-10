package com.Api;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Validate_JSON {

	public static void main(String[] args) throws IOException, ParseException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\Amazon_Cucumber\\src\\test\\java\\com\\Api\\Payload.json");
		FileReader reader = new FileReader(f);
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(reader);
			JSONObject jsonObject = (JSONObject) parse;
			Object object = jsonObject.get("id");
			System.out.println("id :" + object.toString());
			Object object2 = jsonObject.get("name");
			System.out.println("Name :" + object2.toString());
			Object object3 = jsonObject.get("year");
			System.out.println("Year :" + object3.toString());
			Object object4 = jsonObject.get("color");
			System.out.println("Color :" + object4.toString());
			Object object5 = jsonObject.get("pantone_value");
			System.out.println("Pantone_value :" + object5.toString());
		
	}
}
