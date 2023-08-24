package com.innovation.microservice_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}