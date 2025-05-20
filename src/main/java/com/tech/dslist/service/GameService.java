package com.tech.dslist.service;

import com.tech.dslist.dto.GameMinDTO;
import com.tech.dslist.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
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
