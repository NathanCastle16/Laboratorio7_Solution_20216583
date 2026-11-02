package pucp.lab07.repository;

import pucp.lab07.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByDocument(String document);
}
