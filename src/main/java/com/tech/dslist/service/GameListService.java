package com.tech.dslist.service;

import com.tech.dslist.dto.GameListDTO;
import com.tech.dslist.dto.GameMinDTO;
import com.tech.dslist.exception.GameNotFound;
import com.tech.dslist.repository.GameListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameListService {

    private final GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> getAllGameLists(){

        List<GameListDTO> games = gameListRepository.findAll()
                .stream()
                .map(GameListDTO::new)
                .toList();

        if(games.isEmpty()){
            throw new GameNotFound("No game list found.");
        }

        return games;
    }
}
