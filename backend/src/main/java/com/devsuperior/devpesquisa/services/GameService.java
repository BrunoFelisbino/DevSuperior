package com.devsuperior.devpesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.devpesquisa.dto.GameDTO;
import com.devsuperior.devpesquisa.entities.Game;
import com.devsuperior.devpesquisa.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
        List<Game> list = repository.findAll();
        return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
    }
    
}
