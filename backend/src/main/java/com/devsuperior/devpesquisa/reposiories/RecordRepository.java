package com.devsuperior.devpesquisa.reposiories;

import com.devsuperior.devpesquisa.entities.Record;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Integer> {
    
}
