package com.mam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mam.model.Director;

@Repository
@Transactional
public interface DirectorRepository extends JpaRepository<Director, Long> {

}