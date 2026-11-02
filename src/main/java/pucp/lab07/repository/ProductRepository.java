package pucp.lab07.repository;

import pucp.lab07.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByNameIgnoreCase(String name);
}