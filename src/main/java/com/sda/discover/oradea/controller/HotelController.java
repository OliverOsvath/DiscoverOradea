package com.sda.discover.oradea.controller;

import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.service.HotelService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class HotelController {
    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/createHotel")
    public String showCreateHotelPage(Model model) {
        Hotel hotel = new Hotel();
        model.addAttribute("hotel", hotel);
        return "createHotel";
    }

    @PostMapping("/createHotel")
    public String createHotel(
            @ModelAttribute("hotel")
            @Valid
            Hotel hotel,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "/createHotel";
        }

        hotelService.save(hotel);

        return "redirect:/index";

    }

    @GetMapping("/viewHotel/{hotelId}")
    public String getHotelById(@PathVariable(value = "hotelId") int hotelId, Model model) {
        Optional<Hotel> optionalHotel = hotelService.findById(hotelId);
        if (optionalHotel.isEmpty()) {
            return "error";
        }
        Hotel hotel = optionalHotel.get();
        model.addAttribute("hotel", hotel);
        return "viewHotel";
    }


    @GetMapping(value = {"/", "/index", "/home"})
    public String showIndexWithAllHotels(Model model) {
        List<Hotel> hotels = hotelService.findAll();

        model.addAttribute("hotels", hotels);
        return "index";
    }

}
