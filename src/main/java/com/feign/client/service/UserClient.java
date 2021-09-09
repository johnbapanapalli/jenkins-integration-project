package com.feign.client.service;

import com.feign.client.model.UserResponseItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com/", name = "USER-CLIENT")
public interface UserClient {

    @GetMapping("/users")
    public List<UserResponseItem> getAllUsers();

}
