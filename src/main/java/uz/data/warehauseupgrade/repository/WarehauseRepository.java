package uz.data.warehauseupgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.data.warehauseupgrade.entity.Warehause;

@RepositoryRestResource(path = "warehause")
public interface WarehauseRepository extends JpaRepository<Warehause, Integer> {
    boolean existsWarehauseByName(String name);

    boolean existsWarehauseById(Integer id);
}
