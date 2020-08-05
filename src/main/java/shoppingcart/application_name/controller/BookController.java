package shoppingcart.application_name.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shoppingcart.application_name.model.Books;
import shoppingcart.application_name.model.IBookService;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class BookController {

    @Autowired
    private IBookService bookService;


    public BookController(IBookService bookService){

        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public List<Books> getBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping("/book")
    public Books getBooksById(@RequestParam(value="id") int id){
        return  bookService.getBookById(id);
    }


}
