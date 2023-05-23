package com.sda.discover.oradea.controller;

import com.sda.discover.oradea.model.Attraction;
import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.service.AttractionService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AttractionController {
    private final AttractionService attractionService;

    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }



  /*  @ModelAttribute("hotel")
    public Hotel getHotel() {
        return new Hotel();
    }*/

    @GetMapping("/createAttraction")
    public String showCreateAttractionPage(Model model) {
        Attraction attraction = new Attraction();
        model.addAttribute("attraction", attraction);
        return "createAttraction";
    }

    @PostMapping("/createAttraction")
    public String createAttraction(
            @ModelAttribute("attraction")
            @Valid
            Attraction attraction,
            BindingResult result
    ) {
        if(result.hasErrors()){
            return "/createAttraction";
        }

        attractionService.save(attraction);

        return "redirect:/createAttraction?success";

    }



}
