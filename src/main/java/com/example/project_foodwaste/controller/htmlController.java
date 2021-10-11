package com.example.project_foodwaste.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class htmlController {
    @GetMapping("/templates/petition_submissions")
    public String petition(@RequestParam String fName, @RequestParam String lName) {
        System.out.println(fName + " " + lName);
        return "petition_submissions";
    }


    @GetMapping("/{path}")
    public String genericTemplateReturner (@PathVariable String path){
        System.out.println(path);
        return path;

    }

}