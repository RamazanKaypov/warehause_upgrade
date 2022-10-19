package uz.data.warehauseupgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.data.warehauseupgrade.entity.OutputProduc;

import java.util.List;

@RepositoryRestResource(path = "outputProduc")
public interface OutputProductRepository extends JpaRepository<OutputProduc,Integer> {

    List<OutputProduc> getOutputProducsByOutput_Id(Integer output_id);
}
