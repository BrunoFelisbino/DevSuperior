package com.devsuperior.devpesquisa.reposiories;

import com.devsuperior.devpesquisa.entities.enums.Platform;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatformRepository extends JpaRepository<Platform, Integer> {
    
}
