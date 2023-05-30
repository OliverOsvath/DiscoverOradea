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
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController {


    private final HotelService hotelService;
    private final RestaurantService restaurantService;
    private final AttractionService attractionService;


    public SearchController(HotelService hotelService, RestaurantService restaurantService, AttractionService attractionService) {
        this.hotelService = hotelService;
        this.restaurantService = restaurantService;
        this.attractionService = attractionService;
    }

    @ModelAttribute("searchDto")
    public SearchDto searchDto() {
        return new SearchDto();
    }


    @GetMapping
    public String search(@ModelAttribute(name = "searchDto") SearchDto searchDto, Model model) {

        List<Hotel> hotels = hotelService.search(searchDto.getValue());
        List<Attraction> attractions = attractionService.search(searchDto.getValue());
        List<Restaurant> restaurants = restaurantService.search(searchDto.getValue());

        model.addAttribute("hotels", hotels);
        model.addAttribute("attractions", attractions);
        model.addAttribute("restaurants", restaurants);

        return "searchResults";
    }

}
