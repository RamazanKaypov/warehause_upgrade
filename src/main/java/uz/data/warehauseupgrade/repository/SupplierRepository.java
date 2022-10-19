package uz.data.warehauseupgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.data.warehauseupgrade.entity.Supplier;

@RepositoryRestResource(path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

    boolean existsSupplierByPhoneNumber(String phoneNumber);
}
