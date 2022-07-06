package com.desj.filmcatalogservice.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class FilmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "acteurs",
            joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "acteur_id", referencedColumnName = "id"))
    private List<ActeurEntity> acteurs;
}
