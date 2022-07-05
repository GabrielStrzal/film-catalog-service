package com.desj.filmcatalogservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Schema(name = "Film")
public class FilmDTO {

    public Long id;
    public String titre;
    public String description;
    public List<ActeurDTO> acteurs = null;
}
