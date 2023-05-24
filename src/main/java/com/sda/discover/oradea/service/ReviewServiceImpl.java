package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Guest;
import com.sda.discover.oradea.model.Review;
import com.sda.discover.oradea.repository.GuestRepository;
import com.sda.discover.oradea.repository.ReviewRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService{

    private final ReviewRepository reviewRepository;
    private final GuestRepository guestRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository, GuestRepository guestRepository) {
        this.reviewRepository = reviewRepository;
        this.guestRepository = guestRepository;
    }


    @Override
    public Review create(String comment, int score) {
        Review review = new Review(comment, score);
        return reviewRepository.save(review);
    }
    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Optional<Review> findById(int id) {
        return reviewRepository.findById(id);
    }
    @Override
    public void save(String guestFirstName,
                     String guestLastName,
                     String guestNationality,
                     String reviewComment,
                     int reviewScore) {
        Guest guest = new Guest(guestFirstName,guestLastName,guestNationality);
        guestRepository.save(guest);
        Review review = new Review(reviewComment, reviewScore);
        review.setGuest(guest);
        reviewRepository.save(review);
    }

    @Override
    public void delete(int id) {
        reviewRepository.deleteById(id);
    }
}
