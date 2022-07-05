package com.desj.filmcatalogservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class Film {

    public Long id;
    public String titre;
    public String description;
    public List<Acteur> acteurs = null;
}
