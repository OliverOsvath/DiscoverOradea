package com.sda.discover.oradea.controller;


import com.sda.discover.oradea.controller.dto.ReviewDto;
import com.sda.discover.oradea.model.Review;
import com.sda.discover.oradea.service.ReviewService;
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
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @GetMapping("/createReview")
    public String showCreateReviewPage(Model model){
        ReviewDto baseReviewDto = new ReviewDto();
        model.addAttribute("review", baseReviewDto);
        return "createReview";
    }
    @PostMapping("/createReview")
    public String createReview(
            @ModelAttribute("review")
            @Valid ReviewDto review,
            BindingResult result
    ) {
        if(result.hasErrors()){
            return "createReview";
        }

        reviewService.save(
                review.getGuestFirstName(),
                review.getGuestLastName(),
                review.getGuestNationality(),
                review.getReviewComment(),
                review.getReviewScore()
        );

        return "redirect:/viewReview";

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
