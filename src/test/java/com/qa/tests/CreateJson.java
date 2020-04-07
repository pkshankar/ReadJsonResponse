package com.qa.tests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.pojo.Guest;
import com.qa.pojo.User;

public class CreateJson {

	@Test
	public void createJson() throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		Guest guest = new Guest(100,"Jon",873,false, true);
		User user = new User(true, guest);
		String jsonString = mapper.writeValueAsString(user);
		System.out.println(jsonString);
		
	}

}
