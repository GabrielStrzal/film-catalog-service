package com.desj.filmcatalogservice.controller;

import com.desj.filmcatalogservice.model.Film;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/film")
public class FilmController {

    @GetMapping("/{id}")
    public Film film(@PathVariable long id) {
        //TODO
        Film foundFilm = new Film();
        foundFilm.setId(id);
        return foundFilm;
        //return repository.findById(id).orElseThrow(() -> new FilmNotFoundException());
    }

    //Option endpoint for getting all Films in the database
    @GetMapping("/")
    public Iterable<Film> films(){
        return null;
        //return repository.findAll();
    }

    @PostMapping("/")
    public @ResponseBody ResponseEntity<Film> postFilm(@RequestBody Film film) {
        //TODO save in repository
        //repository.save(film);
        return new ResponseEntity<>(film, HttpStatus.CREATED);
    }
}
