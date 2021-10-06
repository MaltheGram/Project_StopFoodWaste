package com.example.project_foodwaste.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class htmlController {



    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/info")
    public String info(){
        return "info";
    }
    @GetMapping("/text.html")
    public String text(){
        return "text";
    }


    @GetMapping("/responsibility")
    public String responsibility(){
        return "responsibility";
    }
    @GetMapping("/what_we_do")
    public String whatWeDo(){
        return "what_we_do";
    }
    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
    @GetMapping("/credits")
    public String credits(){
        return "credits";
    }




}
