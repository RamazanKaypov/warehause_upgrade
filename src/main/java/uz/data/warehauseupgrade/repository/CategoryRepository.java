package uz.data.warehauseupgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.data.warehauseupgrade.entity.Category;

@RepositoryRestResource(path = "category")
public interface CategoryRepository  extends JpaRepository<Category,Integer> {
}
