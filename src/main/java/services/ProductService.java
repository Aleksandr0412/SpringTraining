package services;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    @Qualifier("avc")
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveOrUpdate(Product product) {
        return productRepository.save(product);
    }

    public void saveOrUpdate(List<Product> products) {
        productRepository.saveAll(products);
    }

    public Product getById(long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }
}
