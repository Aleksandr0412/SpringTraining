package org.vtb.services;

import org.vtb.entities.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vtb.repositories.DocumentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {
    private DocumentRepository documentRepository;

    @Autowired
    public void setDocumentRepository(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }


    public Optional<Document> findById(Long id) {
        return documentRepository.findById(id);
    }

    public Document saveOrUpdate(Document book) {
        return documentRepository.save(book);
    }

    public void deleteById(Long id) {
        documentRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return documentRepository.existsById(id);
    }

    public void deleteAll() {
        documentRepository.deleteAll();
    }
}
