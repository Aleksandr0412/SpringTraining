package controllers;

import entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {
    @Autowired
    private ProductService ps;

    @GetMapping("/all")
    public List<Product> getAll() {
        System.out.println("\n\\n\n\n fgdgdfgdfgdfg");
        return ps.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable long id) {
        return ps.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        ps.deleteById(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product product) {
        if (product.getId() != null) {
            product.setId(null);
        }
        return ps.saveOrUpdate(product);
    }

//    @Autowired
//    public void setPs(ProductService ps) {
//        this.ps = ps;
//    }
}
