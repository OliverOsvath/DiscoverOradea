package com.sda.discover.oradea.controller;

import com.sda.discover.oradea.model.Attraction;
import com.sda.discover.oradea.model.Restaurant;
import com.sda.discover.oradea.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }



    @GetMapping("/createRestaurant")
    public String showCreateRestaurantPage(Model model) {
        Restaurant restaurant = new Restaurant();
        model.addAttribute("restaurant", restaurant);
        return "createRestaurant";
    }

    @PostMapping("/createRestaurant")
    public String createRestaurant(
            @ModelAttribute("restaurant")
            @Valid
            Restaurant restaurant,
            BindingResult result
    ) {
        if(result.hasErrors()){
            return "/createRestaurant";
        }

        restaurantService.save(restaurant);

        return "redirect:/createRestaurant?success";

    }
    @GetMapping("/restaurant/{restaurantId}")
    public String getRestaurantById(@PathVariable(value = "restaurantId") int restaurantId, Model model){
        Optional<Restaurant> optionalRestaurant = restaurantService.findById(restaurantId);
        if(optionalRestaurant.isEmpty()){
            return "error";
        }
        Restaurant restaurant = optionalRestaurant.get();
        model.addAttribute("restaurant", restaurant);
        return "viewRestaurant";
    }

    @GetMapping("/contactRestaurant")
    public String contactRestaurantGet(Model model) {
        return "contactRestaurant";
    }


}
