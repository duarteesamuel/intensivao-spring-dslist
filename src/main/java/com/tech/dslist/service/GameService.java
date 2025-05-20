package com.tech.dslist.service;

import com.tech.dslist.dto.GameDTO;
import com.tech.dslist.dto.GameMinDTO;
import com.tech.dslist.exception.GameNotFound;
import com.tech.dslist.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> getAllGames(){
        return gameRepository.findAll().stream().map(GameMinDTO::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){

        return new GameDTO(
                gameRepository.findById(id).orElseThrow(() -> new GameNotFound("Game with id " + id + " not found."))
        );
    }
}
