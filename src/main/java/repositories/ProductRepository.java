package repositories;

import entities.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("avc")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
