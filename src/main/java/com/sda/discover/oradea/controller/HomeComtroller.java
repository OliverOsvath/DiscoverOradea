package com.sda.discover.oradea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeComtroller {
    @GetMapping(value = {"/","/index","/home"})
    public String showIndexPage(){
        return "index";
    }
}
