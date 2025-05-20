package com.tech.dslist.dto;

import com.tech.dslist.entity.Game;

public record GameMinDTO(
        Long id,
        String title,
        Integer year,
        String imgUrl,
        String shortDescription) {


    public GameMinDTO(Game entity){
        this(entity.getId(), entity.getTitle(), entity.getYear(), entity.getImgUrl(), entity.getShortDescription());
    }
}
