package com.amaris.training.service.mapper;

import com.amaris.training.doman.Catalog;
import com.amaris.training.dto.CatalogDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CatalogMapper {

    Catalog toCatalog(CatalogDto catalogRequest);

    CatalogDto toResponse(Catalog catalog);

    Catalog toCatalog(@MappingTarget Catalog catalog, CatalogDto catalogRequest);
}
