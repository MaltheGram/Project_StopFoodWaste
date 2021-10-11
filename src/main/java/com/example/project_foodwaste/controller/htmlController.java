package com.example.project_foodwaste.controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

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