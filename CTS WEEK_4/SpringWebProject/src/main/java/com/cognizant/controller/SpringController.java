package com.cognizant.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
    @RestController
    public class SpringController {
        @GetMapping("/")
        public  String sayHello(){
            return "Hello I'm Spring Web Project";
        }
    }

