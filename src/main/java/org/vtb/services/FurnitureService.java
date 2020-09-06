package org.vtb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vtb.entities.Furniture;
import org.vtb.repositories.FurnitureRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FurnitureService {
    private FurnitureRepository furnitureRepository;

    @Autowired
    public void setFurnitureRepository(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }

    public Optional<Furniture> findById(Long id) {
        return furnitureRepository.findById(id);
    }

    public List<Furniture> findAll() {
        return furnitureRepository.findAll();
    }

    public Furniture saveOrUpdate(Furniture furniture) {
        return furnitureRepository.save(furniture);
    }

    public void deleteById(Long id) {
        furnitureRepository.deleteById(id);
    }

    public void deleteAll() {
        furnitureRepository.deleteAll();
    }
}
