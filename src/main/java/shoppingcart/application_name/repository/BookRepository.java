package shoppingcart.application_name.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingcart.application_name.model.ApplicationName;
import shoppingcart.application_name.model.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {
}
