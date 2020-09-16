package com.devsuperior.devpesquisa.reposiories;

import com.devsuperior.devpesquisa.entities.Genre;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneRepository extends JpaRepository<Genre, Integer> {
    
}
