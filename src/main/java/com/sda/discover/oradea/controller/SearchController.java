package com.sda.discover.oradea.controller;


import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.repository.HotelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Controller
public class SearchController {

    @Autowired
    private final HotelRepository hotelRepository;

    public SearchController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }


    @GetMapping("/hotel")
    public ModelAndView showHotel(@RequestParam Optional<String> search) {
        ModelAndView modelAndView = new ModelAndView("hotel/list");

        List<Hotel> listHotels = new ArrayList<>();

        if (search.isPresent()) {
            try {
                Optional<Hotel> hotel = hotelRepository.findById(Integer.valueOf(search.get()));
                if (hotel.isPresent()) {
                    listHotels.add(hotel.get());
                }
            } catch (NumberFormatException nfe) {
                modelAndView.addObject("incorrect_number", true);
                System.out.println("Not a valid number");
            }
            if (listHotels.isEmpty()) {
                modelAndView.addObject("empty_result", true);
            }
            modelAndView.addObject("search", search.get());
        } else {
            listHotels = hotelRepository.findAll();
        }
        return modelAndView;
    }
}
