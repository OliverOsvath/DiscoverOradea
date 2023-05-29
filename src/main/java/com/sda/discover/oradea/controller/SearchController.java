package com.sda.discover.oradea.controller;

import com.sda.discover.oradea.controller.dto.SearchDto;
import com.sda.discover.oradea.model.Attraction;
import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.model.Restaurant;
import com.sda.discover.oradea.service.AttractionService;
import com.sda.discover.oradea.service.HotelService;
import com.sda.discover.oradea.service.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class SearchController {


    private final HotelService hotelService;
    private final RestaurantService restaurantService;
    private final AttractionService attractionService;

    public SearchController(HotelService hotelService, RestaurantService restaurantService, AttractionService attractionService) {
        this.hotelService = hotelService;
        this.restaurantService = restaurantService;
        this.attractionService = attractionService;
    }

    @GetMapping("/search")
    public String showHotel(@ModelAttribute(name = "searchQuery")SearchDto searchDto, Model model) {
        List<Hotel> hotels = hotelService.search(searchDto.getValue());
        List<Attraction> attractions = attractionService.search(searchDto.getValue());
        List<Restaurant> restaurants = restaurantService.search(searchDto.getValue());



        model.addAttribute("hotels", hotels);
        model.addAttribute("attraction", attractions);
        model.addAttribute("restaurant", restaurants);

        return "searchList";// add correct name
    }
}
