package com.sda.discover.oradea.controller;

import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private ReviewService reviewService;
    @GetMapping("/viewHotel")
    public String showViewHotelPage(Hotel hotel){
        return "viewHotel";
    }




}
