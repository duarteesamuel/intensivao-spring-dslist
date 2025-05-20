package com.tech.dslist.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_games")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private Long id;

    @Column(name = "game_title")
    private String title;

    @Column(name = "game_year")
    private Integer year;

    @Column(name = "game_genre")
    private String genre;

    @Column(name = "game_score")
    private Double score;

    @Column(name = "game_platforms")
    private String platforms;

    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

}
