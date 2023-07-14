package com.devchales.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devchales.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
