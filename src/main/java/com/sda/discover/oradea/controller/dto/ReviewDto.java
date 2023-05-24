package com.sda.discover.oradea.controller.dto;


public class ReviewDto {
    private String guestFirstName;
    private String guestLastName;
    private String guestNationality;
    private String reviewComment;
    private int reviewScore;

    public ReviewDto() {
    }

    public ReviewDto(
            String guestFirstName,
            String guestLastName,
            String guestNationality,
            String reviewComment,
            int reviewScore
    ) {
        this.guestFirstName = guestFirstName;
        this.guestLastName = guestLastName;
        this.guestNationality = guestNationality;
        this.reviewComment = reviewComment;
        this.reviewScore = reviewScore;
    }

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }

    public void setGuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }

    public String getGuestNationality() {
        return guestNationality;
    }

    public void setGuestNationality(String guestNationality) {
        this.guestNationality = guestNationality;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }
}