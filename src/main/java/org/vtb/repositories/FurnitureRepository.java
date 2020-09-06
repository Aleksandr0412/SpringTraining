package org.vtb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vtb.entities.Furniture;

@Repository
public interface FurnitureRepository extends JpaRepository<Furniture, Long> {
}
