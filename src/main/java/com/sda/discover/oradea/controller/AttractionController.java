package com.sda.discover.oradea.controller;

import com.sda.discover.oradea.model.Attraction;
import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.model.Restaurant;
import com.sda.discover.oradea.service.AttractionService;
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
public class AttractionController {
    private final AttractionService attractionService;

    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @ModelAttribute("attraction")
    public Attraction getAttraction(){
        return new Attraction();
    }


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

        return "redirect:/viewAttraction";

    }

    @GetMapping("/viewAttraction/{attractionId}")
    public String getAttractionById(@PathVariable(value = "attractionId") int attractionId, Model model){
        Optional<Attraction> optionalAttraction = attractionService.findById(attractionId);
        if(optionalAttraction.isEmpty()){
            return "error";
        }
        Attraction attraction = optionalAttraction.get();
        model.addAttribute("attraction", attraction);
        return "viewAttraction";
    }
    @GetMapping("/viewAttraction")
    public String showAllAttractions(Model model) {
        List<Attraction> attractions = attractionService.findAll();
        model.addAttribute("attractions", attractions);
        return "viewAttraction";
    }
}
