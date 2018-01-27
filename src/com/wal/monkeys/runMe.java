package com.wal.monkeys;

import java.io.File;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class runMe {

	public static void main(String[] args) {
		
		Schedule schedule = new Schedule();

		schedule = fileToObject();
		
		String jsonString = objectToString(schedule);
		
		stringToObject(jsonString);
		
		objectToFile(schedule);
		
		//processJsonPayload();
	}
	
	
	// COnvert Json file to Java Object 
	private static Schedule fileToObject() {
		ObjectMapper objectMapper = new ObjectMapper();
		
		Schedule schedule = new Schedule();
		
		try {
			schedule = objectMapper.readValue(new File("/exercise/sts-workspace/StatusIO/resources/json/jsonIn.json"), 
					 Schedule.class);
			
			System.out.println("Object 'Schedule()' has been created from Json file: "+schedule.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (schedule);
	}
	
	// Convert Java Object to Json String
	private static String objectToString(Schedule schedule) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String jsonString = null;
		
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		
		try {
			jsonString = objectMapper.writeValueAsString(schedule);
			
			System.out.println("Converted Java Object 'Schedule()' to String: "+jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (jsonString);
		
	}
		
	// Write Java Object to Json file
	private static void objectToFile(Schedule schedule)
	{
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
				
		File file = new File("/exercise/sts-workspace/StatusIO/resources/json/jsonOut.json");
		
		try {
			// This writes to the file
			objectMapper.writeValue(file, schedule);
			
			System.out.println("Java Object 'Schedule()' has been written as Json file. "+ '\n' +
								"See the file 'jsonOut.json' at: /exercise/sts-workspace/StatusIO/resources/json/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Convert Json String to Java Object
	private static Schedule stringToObject(String jsonString) {
		
		Schedule schedule = new Schedule();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			schedule = objectMapper.readValue(jsonString, Schedule.class);
			
			System.out.println("Converted JSON string to an object Schedule(): " +schedule.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (schedule);
		
	}

	// This method will read the json payload from json clinet, convert it as java object and print it as string.
	private static Response processJsonPayload() {
		ObjectMapper objectMapper = new ObjectMapper();
		Client client = ClientBuilder.newClient();
		Response response = client.target("<<Your URL>>")
  			  .request(MediaType.APPLICATION_JSON_TYPE)
  			  .header("<<Your Key>>", "<<Your Value>>")
  			  .header("<<Your Key>>", "<<Your Value>>")
  			  .get();  
		//<<Your Object>> obj = new <<Your Object>>();
		try {
			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
			//obj = objectMapper.readValue(response.readEntity(String.class), Schedule.class);
    			//String jsonInString = objectMapper.writeValueAsString(obj);
    			//System.out.println("Json String From Java Object: "+jsonInString);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (response);
		
	}

}
