package com.tech.dslist.dto;

import com.tech.dslist.entity.GameList;

public record GameListDTO(
        Long id,
        String name
) {

    public GameListDTO(GameList entity){
        this(entity.getId(), entity.getName());
    }
}
