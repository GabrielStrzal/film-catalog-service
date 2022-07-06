package com.desj.filmcatalogservice.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Acteur")
public class ActeurDTO {

    private Long id;
    private String nom;
    private String prenom;
}
