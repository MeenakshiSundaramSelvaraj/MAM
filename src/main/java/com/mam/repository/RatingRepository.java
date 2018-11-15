package com.mam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mam.model.Rating;

@Repository
@Transactional
public interface RatingRepository extends JpaRepository<Rating, Long> {

}
