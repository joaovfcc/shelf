package com.soloproject.shelf.model.repositories;

import com.soloproject.shelf.model.entitites.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
