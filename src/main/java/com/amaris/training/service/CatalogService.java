package com.amaris.training.service;

import com.amaris.training.dto.CatalogDto;
import com.amaris.training.dto.request.RegisterAccount;
import com.amaris.training.dto.response.AccountResponse;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CatalogService {
    CatalogDto createCatalog(CatalogDto catalogDto);

    CatalogDto updateCatalog(CatalogDto catalogDto,Long id);

    List<CatalogDto> getAllCatalog();

    boolean deleteCatalog( Long id);
}
