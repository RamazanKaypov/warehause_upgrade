package uz.data.warehauseupgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.data.warehauseupgrade.entity.Client;

@RepositoryRestResource(path = "client")
public interface ClientRepository extends JpaRepository<Client,Integer> {

    boolean existsClientByPhoneNumber(String phoneNumber);
}
