package com.desj.filmcatalogservice.mapper;

import com.desj.filmcatalogservice.dto.FilmDTO;
import com.desj.filmcatalogservice.entity.FilmEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FilmMapper {


    FilmDTO toFilmDto(FilmEntity filmEntity);

    @Mapping(target = "id", ignore = true)
    FilmEntity toFilmEntity(FilmDTO filmDTO);

    List<FilmDTO> toFilmDtoList(List<FilmEntity> filmEntities);
}
