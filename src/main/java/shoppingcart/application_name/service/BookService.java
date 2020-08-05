package shoppingcart.application_name.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shoppingcart.application_name.model.Books;
import shoppingcart.application_name.model.IBookService;
import shoppingcart.application_name.repository.BookRepository;


import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {

    @Autowired
    private BookRepository bookRepository;

    public BookService(){

    }
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Books> getAllBooks() {

        return bookRepository.findAll();
    }

    @Override
    public Books getBookById(int id) {

        Optional<Books> books =  bookRepository.findById(id);

        return books.isPresent() ? books.get() : null;

    }
}
