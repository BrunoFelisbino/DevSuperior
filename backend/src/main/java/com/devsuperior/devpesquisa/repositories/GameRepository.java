package com.devsuperior.devpesquisa.repositories;

import com.devsuperior.devpesquisa.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    
    
}
