package com.mam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mam.model.Movie_Actor;

@Repository
@Transactional
public interface Movie_ActorRepository extends JpaRepository<Movie_Actor, Long> {

}
