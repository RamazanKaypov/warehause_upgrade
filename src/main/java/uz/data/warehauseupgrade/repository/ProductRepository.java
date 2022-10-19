package uz.data.warehauseupgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.data.warehauseupgrade.entity.Product;

@RepositoryRestResource(path = "Product")
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
