package com.example.project_foodwaste.controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

@Controller
public class htmlController {



    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/info")
    public String info() {
        return "info";
    }

    @GetMapping("/text.html")
    public String text() {
        return "text";
    }



    @GetMapping("/templates/petition_submissions")

    public String petition(@RequestParam String fName, @RequestParam String lName) {
        System.out.println(fName + " " + lName);
        return "petition_submissions";
    }


    @GetMapping("/responsibility")
    public String responsibility() {
        return "responsibility";
    }
    @GetMapping("/test")
    public String xxx() {
        return "scroll";
    }

    @GetMapping("/what_we_do")
    public String whatWeDo() {
        return "what_we_do";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/credits")
    public String credits() {
        return "credits";
    }

        @GetMapping("/{path}")
        public String genericTemplateReturner (@PathVariable String path){
            System.out.println(path);
            return "path";

        }

    }