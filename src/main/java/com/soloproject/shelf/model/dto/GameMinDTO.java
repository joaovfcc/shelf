package com.soloproject.shelf.model.dto;

import com.soloproject.shelf.model.entities.Game;

public class GameMinDTO {

    private Long id;
    private String tittle;
    private Integer year;
    private String imageUrl;
    private String shortDescription;

    public GameMinDTO() {}

    public GameMinDTO(Game entity) {
        id = entity.getID();
        tittle = entity.getTitle();
        year = entity.getYear();
        imageUrl = entity.getImageUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public Integer getYear() {
        return year;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
