import controllers.ProductController;
import entities.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repositories.ProductRepository;
import services.ProductService;

@SpringBootApplication
@ComponentScan(basePackageClasses = {ProductController.class, ProductService.class, ProductRepository.class, Product.class})
@EnableJpaRepositories
@EntityScan("entities")
public class MainApp {
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

}
