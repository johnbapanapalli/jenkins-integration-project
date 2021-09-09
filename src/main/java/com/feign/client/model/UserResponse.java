package com.feign.client.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse{

	@JsonProperty("UserResponse")
	private List<UserResponseItem> userResponse;

	public List<UserResponseItem> getUserResponse(){
		return userResponse;
	}
}