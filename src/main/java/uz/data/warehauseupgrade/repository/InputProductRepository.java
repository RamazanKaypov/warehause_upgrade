package uz.data.warehauseupgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.data.warehauseupgrade.entity.InputProduct;

import java.util.List;

@RepositoryRestResource(path = "inputProduct")
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {

    List<InputProduct> getInputProductsByInput_Id(Integer input_id);
}
