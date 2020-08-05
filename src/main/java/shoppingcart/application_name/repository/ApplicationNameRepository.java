package shoppingcart.application_name.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingcart.application_name.model.ApplicationName;

public interface ApplicationNameRepository extends JpaRepository<ApplicationName, Long> {
}
