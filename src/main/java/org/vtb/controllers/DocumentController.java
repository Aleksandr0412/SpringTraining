package org.vtb.controllers;

import org.vtb.entities.Document;
import org.vtb.exceptions.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.vtb.services.DocumentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/documents")
@AllArgsConstructor
@Slf4j
public class DocumentController {
    private DocumentService documentService;

    @GetMapping
    public List<Document> getAllBooks() {
        return documentService.findAll();
    }

    @GetMapping("/{id}")
    public Document getBookById(@PathVariable Long id) {
        return documentService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Document with id: " + id + " not found"));
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Document createNewBook(@RequestBody Document document) {
        if (document.getId() != null) {
            document.setId(null);
        }
        return documentService.saveOrUpdate(document);
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    public Document modifyBook(@RequestBody Document document) {
        if (!documentService.existsById(document.getId())) {
            throw new ResourceNotFoundException("Document with id: " + document.getId() + " doesn't exists (for modification)");
        }
        return documentService.saveOrUpdate(document);
    }

    @DeleteMapping
    public void deleteAllBooks() {
        documentService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        documentService.deleteById(id);
    }

}
