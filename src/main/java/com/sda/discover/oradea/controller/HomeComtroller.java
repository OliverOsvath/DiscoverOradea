package com.sda.discover.oradea.controller;

import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class HomeComtroller {

    @Autowired
    private HotelService hotelService;
    @Autowired
    private RestaurantService restaurantService;
    @Autowired
    private GuestService guestService;
    @Autowired
    private AttractionService attractionService;
    @Autowired
    private ReviewService reviewService;

    @GetMapping(value = {"/","/index","/home"})
    public String showIndexPage(){
        return "index";
    }

    @GetMapping("/create")
    public String createHotel(Model model){
        Hotel hotel = new Hotel();
        model.addAttribute("hotel", hotel);
        return "create";
    }

    @GetMapping("/hotel/{hotelId}")
    public String getHotelById(@PathVariable(value = "hotelId") int hotelId, Model model){
        Optional<Hotel> optionalHotel = hotelService.findById(hotelId);
        if(optionalHotel.isEmpty()){
            return "error";
        }
        Hotel hotel = optionalHotel.get();
        model.addAttribute("hotel", hotel);
        return "viewHotel";
    }

    @GetMapping("/contact")
    public String contactGet(Model model) {
        return "contact";
    }
}
