package com.devsuperior.devpesquisa.repositories;

import com.devsuperior.devpesquisa.entities.Record;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
    
}
