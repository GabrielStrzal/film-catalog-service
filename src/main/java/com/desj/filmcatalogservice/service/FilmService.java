package com.desj.filmcatalogservice.service;

import com.desj.filmcatalogservice.dto.FilmDTO;
import com.desj.filmcatalogservice.entity.FilmEntity;
import com.desj.filmcatalogservice.exception.FilmNotFoundException;
import com.desj.filmcatalogservice.mapper.FilmMapper;
import com.desj.filmcatalogservice.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private FilmMapper filmMapper;

    public FilmDTO findFilmById(long filmId) throws FilmNotFoundException {
        FilmEntity filmEntity = filmRepository.findById(filmId).orElseThrow(FilmNotFoundException::new);
        return filmMapper.toFilmDto(filmEntity);
    }

    public List<FilmDTO> getAllFilms() {
        return filmMapper.toFilmDtoList(filmRepository.findAll());
    }

    public FilmDTO saveFilm(FilmDTO filmDTO) {
        FilmEntity filmEntity = filmMapper.toFilmEntity(filmDTO);
        return filmMapper.toFilmDto(filmRepository.save(filmEntity));
    }
}
