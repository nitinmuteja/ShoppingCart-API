package shoppingcart.application_name.model;

import org.springframework.stereotype.Service;

import java.util.List;


public interface IBookService {

    List<Books> getAllBooks();

    Books getBookById(int id);
}
