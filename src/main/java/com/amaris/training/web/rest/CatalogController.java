package com.amaris.training.web.rest;

import com.amaris.training.dto.CatalogDto;
import com.amaris.training.service.CatalogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogs")
public class CatalogController {
    final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @PostMapping
    ResponseEntity<CatalogDto> createCatalog(@RequestBody CatalogDto catalogDto){
        CatalogDto catalog= catalogService.createCatalog(catalogDto);
        return new ResponseEntity(catalog,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    ResponseEntity<String> updateCatalog(@RequestBody CatalogDto catalogDto,@PathVariable Long id){
        catalogService.updateCatalog(catalogDto,id);
        return new ResponseEntity<>("Update catalog successfully",null,HttpStatus.OK);
    }

    @GetMapping
    List<CatalogDto> getAllCatalog(){
        return catalogService.getAllCatalog();
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteCatalog(@PathVariable Long id){
        if(catalogService.deleteCatalog(id)){
            return new ResponseEntity<>("Delete successfully",null,HttpStatus.OK);
        }
        return new ResponseEntity<>("Delete fail",null,HttpStatus.BAD_REQUEST);
    }
}
