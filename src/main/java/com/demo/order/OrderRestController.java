package com.demo.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {
    @GetMapping("/info") 
    public String info(@Value("${server.port}") String port) {
        return "Order Service 기본 동작 Port : {" + port + "}";
    }
}
