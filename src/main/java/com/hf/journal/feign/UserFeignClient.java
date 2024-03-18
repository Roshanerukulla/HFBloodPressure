package com.hf.journal.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HFUSER1", url = "http://localhost:8081") // Name of the microservice to communicate with
public interface UserFeignClient {

    @GetMapping("/api/users/{userId}/id") // Endpoint in the User microservice
    Long getUserDetails(@PathVariable Long userId);
}
