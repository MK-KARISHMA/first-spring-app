package com.firstrpringboot.example.first_spring_app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/demo/apis")
public class DemoController {

    @GetMapping("/d1")
    public String getDemo1() {
        System.out.println("This is first demo API - printing in server console");
        return "This is first demo API - returns to the user";
    }

    @GetMapping("/d2")
    public String getDemo2() {
        System.out.println("This is second demo API - printing in server console");
        return "This is second demo API - returns to the user";
    }
}
