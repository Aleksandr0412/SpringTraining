package org.vtb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vtb.entities.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
}
