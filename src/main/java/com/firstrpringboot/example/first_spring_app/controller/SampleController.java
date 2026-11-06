package com.firstrpringboot.example.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/s1")
    public String getSample1() {
        System.out.println("This is first sample API - printing in server console");
        return "This is first sample API - returns to the user";
    }

    @GetMapping("/s2")
    public String getSample2() {
        System.out.println("This is second sample API - printing in server console");
        return "This is second sample API - returns to the user";
    }


}
