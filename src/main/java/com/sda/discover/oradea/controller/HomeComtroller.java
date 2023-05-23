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

    @GetMapping("/contactHotel")
    public String contactHotelGet(Model model) {
        return "contactHotel";
    }

    @GetMapping("/createRestaurant")
    public String createRestaurant(Model model){
        Restaurant restaurant = new Restaurant();
        model.addAttribute("restaurant", restaurant);
        return "createRestaurant";
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


    @GetMapping("/attraction/{attractionId}")
    public String getAttractionById(@PathVariable(value = "attractionId") int attractionId, Model model){
        Optional<Attraction> optionalAttraction = attractionService.findById(attractionId);
        if(optionalAttraction.isEmpty()){
            return "error";
        }
        Attraction attraction = optionalAttraction.get();
        model.addAttribute("attraction", attraction);
        return "viewAttraction";
    }

    @GetMapping("/contactAttraction")
    public String contactAttractionGet(Model model) {
        return "contactAttraction";
    }

    @GetMapping("/createReview")
    public String createReview(Model model){
        Review review = new Review();
        model.addAttribute("review", review);
        return "createReview";
    }
    @GetMapping("/review/{reviewId}")
    public String getReviewById(@PathVariable(value = "reviewId") int reviewId, Model model){
        Optional<Review> optionalReview = reviewService.findById(reviewId);
        if(optionalReview.isEmpty()){
            return "error";
        }
        Review review = optionalReview.get();
        model.addAttribute("review", review);
        return "viewReview";
    }
}
