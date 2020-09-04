package services;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

//    @Autowired
//    public void setRepo(ProductRepository repo) {
//        this.repo = repo;
//    }

    public Product saveOrUpdate(Product product) {
        return repo.save(product);
    }

    public void saveOrUpdate(List<Product> products) {
        repo.saveAll(products);
    }

    public Product getById(long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public void deleteById(long id) {
        repo.deleteById(id);
    }
}
