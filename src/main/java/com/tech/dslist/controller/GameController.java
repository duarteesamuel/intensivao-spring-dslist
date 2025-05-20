package com.tech.dslist.controller;

import com.tech.dslist.dto.GameMinDTO;
import com.tech.dslist.entity.Game;
import com.tech.dslist.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> getAllGames(){

        return ResponseEntity.status(HttpStatus.OK).body(gameService
                .getAllGames());
    }
}
