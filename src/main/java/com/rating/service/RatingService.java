package com.rating.service;

import com.rating.entity.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating createRating(Rating rating);

    //get all ratings
    List<Rating> getAllRating();

    //get all by user id
    List<Rating> getRatingByUserId(String userId);

    //get all hotel
    List<Rating> getRatingByHotelId(String hotelId);

}
