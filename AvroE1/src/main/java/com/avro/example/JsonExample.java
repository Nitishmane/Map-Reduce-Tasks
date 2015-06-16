package com.avro.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			createJsonData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readJsonData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void createJsonData() throws IOException
	{
		JSONObject obj = new JSONObject(); 
		obj.put("id", "24");
		obj.put("name", "NItish");
		obj.put("designation", "Student");
		obj.put("mgrid", "101");
		obj.put("hiredate", "06/19/2015");
		obj.put("salary", "100000");
		obj.put("commission", "500");
		obj.put("deptid", "10");
		FileWriter writer = new FileWriter("abc.json");
		
		writer.write(obj.toJSONString());
		writer.flush();
		writer.close();
		
		
	}
	
	public  static void readJsonData () throws IOException, ParseException
	{
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader("abc.json");
			Object obj = parser.parse(reader);
			JSONObject jsondata = (JSONObject)obj;
			String id1 = (String) jsondata.get("id");
			System.out.println("id : "+id1);
			String loc = (String) jsondata.get("location");
			System.out.println("Location : "+loc);
			JSONArray arr = (JSONArray) jsondata.get("State");
			Iterator<String> it = arr.iterator();
			while (it.hasNext()) {
				System.out.println(" State : " + it.next());
				
			}
		
	}

}
