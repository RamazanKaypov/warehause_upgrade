package uz.data.warehauseupgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.data.warehauseupgrade.entity.Input;

@RepositoryRestResource(path = "input")
public interface InputRepository extends JpaRepository<Input,Integer> {
}
