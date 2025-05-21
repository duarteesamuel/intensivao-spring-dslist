package com.tech.dslist.controller;

import com.tech.dslist.dto.GameListDTO;
import com.tech.dslist.dto.GameMinDTO;
import com.tech.dslist.service.GameListService;
import com.tech.dslist.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lists")
@RequiredArgsConstructor
public class GameListController {

    private final GameListService gameListService;

    private final GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> getAllGameLists(){

        return ResponseEntity.status(HttpStatus.OK).body(gameListService.getAllGameLists());
    }

    @GetMapping("/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> getByList(@PathVariable Long listId){

        return ResponseEntity.status(HttpStatus.OK).body(gameService
                .findGameByList(listId));
    }
}
