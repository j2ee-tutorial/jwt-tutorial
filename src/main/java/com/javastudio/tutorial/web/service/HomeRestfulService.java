package com.javastudio.tutorial.web.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestfulService {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello world!";
    }

}
