package com.qa.tests;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.pojo.Guest;
import com.qa.pojo.User;

public class TestJson {

	@Test
	public void readJsonResponse() {
		String filePath = "C:\\Users\\pkshank\\eclipse-workspace\\ReadJsonResponse\\src\\main\\java\\com\\qa\\jsonfile\\user.json";
		User user = new User();
		Guest guest = new Guest();
		ObjectMapper mapper = new ObjectMapper();
		File file = new File(filePath);
		try {
			user = mapper.readValue(file, User.class);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("IS AUTHORISED : " + user.isAuthorized());
		System.out.println("CHATNUMBER : " + user.getGuest().getChatNumber());
		System.out.println("USERNAME : " + user.getGuest().getUsername());
		System.out.println("GUEST ID : " + user.getGuest().getGuestId());
		System.out.println("PRIMARY : " + user.getGuest().isPrimary());
		System.out.println("COPPA RESTRICTED : " + user.getGuest().isCoppaRestricted());
	}
}
