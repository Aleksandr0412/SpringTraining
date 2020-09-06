package org.vtb.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.vtb.entities.Furniture;
import org.vtb.exceptions.ResourceNotFoundException;
import org.vtb.services.FurnitureService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/furniture")
@AllArgsConstructor
public class FurnitureController {

    @Autowired
    private FurnitureService furnitureService;

    @GetMapping("/{id}")
    public Furniture getBookById(@PathVariable Long id) {
        return furnitureService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Such furniture not found"));
    }

    @GetMapping()
    public List<Furniture> findAll() {
        return furnitureService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        furnitureService.deleteById(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Furniture createNewFurniture(@RequestBody Furniture furniture) {
        if (furniture.getId() != null) {
            furniture.setId(null);
        }
        return furnitureService.saveOrUpdate(furniture);
    }

    @DeleteMapping
    public void deleteAllFurniture() {
        furnitureService.deleteAll();
    }
}
