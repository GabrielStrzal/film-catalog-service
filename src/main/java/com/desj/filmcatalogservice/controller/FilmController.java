package com.desj.filmcatalogservice.controller;

import com.desj.filmcatalogservice.dto.FilmDTO;
import com.desj.filmcatalogservice.service.FilmService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/film")
public class FilmController {

    @Autowired
    private FilmService filmService;


    @Operation(summary = "Get a film by id")
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<FilmDTO> getFilm(@PathVariable long id) {
        return new ResponseEntity<>(filmService.findFilmById(id), HttpStatus.OK);
    }

    @Operation(summary = "Get all films  - Option not in requirements")
    @GetMapping("/")
    public List<FilmDTO> getFilms() {
        return filmService.getAllFilms();
    }

    @Operation(summary = "Save a film")
    @PostMapping("/")
    public @ResponseBody
    ResponseEntity<FilmDTO> postFilm(@RequestBody FilmDTO filmDTO) {
        return new ResponseEntity<>(filmService.saveFilm(filmDTO), HttpStatus.CREATED);
    }
}
