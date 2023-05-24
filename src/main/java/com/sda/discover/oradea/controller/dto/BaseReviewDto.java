package com.sda.discover.oradea.controller.dto;


import com.sda.discover.oradea.model.Guest;
import com.sda.discover.oradea.model.Review;

public class BaseReviewDto {
    private Guest firstName;
    private Guest lastName;
    private Guest nationality;
    private Review comment;
    private Review score;

    public BaseReviewDto() {
    }

    public BaseReviewDto(
            Guest firstName,
            Guest lastName,
            Guest nationality,
            Review comment,
            Review score
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.comment = comment;
        this.score = score;
    }

    public Guest getFirstName() {
        return firstName;
    }

    public void setFirstName(Guest firstName) {
        this.firstName = firstName;
    }

    public Guest getLastName() {
        return lastName;
    }

    public void setLastName(Guest lastName) {
        this.lastName = lastName;
    }

    public Guest getNationality() {
        return nationality;
    }

    public void setNationality(Guest nationality) {
        this.nationality = nationality;
    }

    public Review getComment() {
        return comment;
    }

    public void setComment(Review comment) {
        this.comment = comment;
    }

    public Review getScore() {
        return score;
    }

    public void setScore(Review score) {
        this.score = score;
    }
}
