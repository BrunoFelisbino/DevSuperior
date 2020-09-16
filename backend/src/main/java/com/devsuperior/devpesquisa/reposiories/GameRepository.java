package com.devsuperior.devpesquisa.reposiories;

import com.devsuperior.devpesquisa.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
    
}
