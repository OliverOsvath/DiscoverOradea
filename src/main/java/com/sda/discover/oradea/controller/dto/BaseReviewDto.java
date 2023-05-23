package com.sda.discover.oradea.controller.dto;

import com.sda.discover.oradea.model.Guest;
import com.sda.discover.oradea.model.Review;

public class BaseReviewDto {

    private Guest guest;
    private Review review;

    public BaseReviewDto(Guest guest, Review review) {
        this.guest = guest;
        this.review = review;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
