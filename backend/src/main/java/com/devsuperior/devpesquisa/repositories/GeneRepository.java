package com.devsuperior.devpesquisa.repositories;

import com.devsuperior.devpesquisa.entities.Genre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneRepository extends JpaRepository<Genre, Long> {
    
}
