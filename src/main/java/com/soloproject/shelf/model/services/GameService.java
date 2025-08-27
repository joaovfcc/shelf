package com.soloproject.shelf.model.services;
import com.soloproject.shelf.model.dto.GameMinDTO;
import com.soloproject.shelf.model.entitites.Game;
import com.soloproject.shelf.model.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    }

}
