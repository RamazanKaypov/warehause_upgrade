package uz.data.warehauseupgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.data.warehauseupgrade.entity.Currency;

@RepositoryRestResource(path = "currency")
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {

    boolean existsCurrencyByName(String name);
}
