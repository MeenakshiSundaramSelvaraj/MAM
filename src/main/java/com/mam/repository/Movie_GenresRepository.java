package com.mam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mam.model.Movie_Genres;

@Repository
@Transactional
public interface Movie_GenresRepository extends JpaRepository<Movie_Genres, Long> {

}
