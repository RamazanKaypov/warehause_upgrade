package uz.data.warehauseupgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.data.warehauseupgrade.entity.Employer;

@RepositoryRestResource(path = "employer")
public interface EmployerRespository extends JpaRepository<Employer,Integer> {
}
