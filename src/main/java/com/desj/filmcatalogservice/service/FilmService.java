package com.desj.filmcatalogservice.service;

import com.desj.filmcatalogservice.dto.FilmDTO;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
    public FilmDTO findFilmById(long filmId) {
        //TODO
        FilmDTO foundFilmDTO = new FilmDTO();
        foundFilmDTO.setId(filmId);
        return foundFilmDTO;
        //return repository.findById(id).orElseThrow(() -> new FilmNotFoundException());
    }

    public Iterable<FilmDTO> getAllFilms() {
        return null;
        //return repository.findAll();
    }

    public FilmDTO saveFilm(FilmDTO filmDTO) {
        //TODO save in repository
        //repository.save(film);
        return filmDTO;
    }
}
