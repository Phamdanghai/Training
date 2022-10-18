package com.amaris.training.service.impl;

import com.amaris.training.doman.Account;
import com.amaris.training.doman.Catalog;
import com.amaris.training.dto.CatalogDto;
import com.amaris.training.repository.CatalogRepository;
import com.amaris.training.service.CatalogService;
import com.amaris.training.service.mapper.CatalogMapper;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CatalogServiceImpl implements CatalogService {
    final CatalogRepository catalogRepository;
    final CatalogMapper catalogMapper;

    public CatalogServiceImpl(CatalogRepository catalogRepository, CatalogMapper catalogMapper) {
        this.catalogRepository = catalogRepository;
        this.catalogMapper = catalogMapper;
    }

    @Override
    public CatalogDto createCatalog(CatalogDto catalogDto) {
        Catalog catalog = catalogMapper.toCatalog(catalogDto);
        Optional<Catalog> catalogOptional = catalogRepository.findByCatalogID(catalogDto.getCatalogID());
        if(catalogOptional.isPresent()){
            throw new NotFoundException("catalog is exist");
        }
        catalog.setCreateDate(LocalDateTime.now());
//        catalog.setCreateByUser();
        catalogRepository.save(catalog);
        return catalogMapper.toResponse(catalog);
    }

    @Override
    public CatalogDto updateCatalog(CatalogDto catalogDto, Long id) {
        Catalog catalog = catalogRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Not found catalog")
        );
        catalog.setUpdateDate(LocalDateTime.now());
        catalogMapper.toCatalog(catalog,catalogDto);
        catalogRepository.save(catalog);
        return catalogMapper.toResponse(catalog);
    }

    @Override
    public List<CatalogDto> getAllCatalog() {
        List<Catalog> catalogList = catalogRepository.findAll();
        if(catalogList.isEmpty()){
            throw  new NotFoundException("Not found catalog");
        }
        List<CatalogDto> catalogDtoList = new ArrayList<>();
        catalogList.forEach(catalog -> catalogDtoList.add(catalogMapper.toResponse(catalog)));
        return catalogDtoList;
    }

    @Override
    public boolean deleteCatalog(Long id) {
        Catalog catalog = catalogRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Not found account")
        );
        catalogRepository.delete(catalog);
        return true;
    }
}
