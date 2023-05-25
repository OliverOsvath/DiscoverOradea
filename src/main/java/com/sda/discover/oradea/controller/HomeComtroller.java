package com.sda.discover.oradea.controller;

import com.sda.discover.oradea.model.Attraction;
import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.model.Restaurant;
import com.sda.discover.oradea.model.Review;
import com.sda.discover.oradea.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class HomeComtroller {

    @Autowired
    private ReviewService reviewService;
    @GetMapping("/viewHotel")
    public String showViewHotelPage(Hotel hotel){
        return "viewHotel";
    }




}
