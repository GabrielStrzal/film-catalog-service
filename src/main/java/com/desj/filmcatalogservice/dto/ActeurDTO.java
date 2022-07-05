package com.desj.filmcatalogservice.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Acteur")
public class ActeurDTO {

    public Long id;
    public String nom;
    public String prenom;
}
