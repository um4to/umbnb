package com.um.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class HomeController {
    @GetMapping(value = "/")
    public String index(){
        return "Welcome to Umbnb";
    }
}
