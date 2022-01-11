package com.singsuyash;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @GetMapping(path = "v1/hello")
    public String getHello() {
        return "Hello, World";
    }
}
