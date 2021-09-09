package com.feign.client;

import com.feign.client.model.UserResponseItem;
import com.feign.client.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients
public class FeignClientApplication {
    @Autowired
    UserClient userClient;

    @GetMapping("/getAllUsers")
    public List<UserResponseItem> getAllEmployess() {
        return userClient.getAllUsers();
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }

}
