package com.tech.dslist.service;

import com.tech.dslist.dto.GameMinDTO;
import com.tech.dslist.entity.Game;
import com.tech.dslist.exception.GameNotFound;
import com.tech.dslist.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public List<GameMinDTO> getAllGames(){
        return gameRepository.findAll().stream().map(GameMinDTO::new)
                .collect(Collectors.toList());
    }

}
