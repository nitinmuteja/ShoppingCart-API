package shoppingcart;

import org.junit.Test;

import org.mockito.Mockito;
import shoppingcart.application_name.model.Books;
import shoppingcart.application_name.model.IBookService;

import shoppingcart.application_name.repository.BookRepository;
import shoppingcart.application_name.service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTests {

    @Test
    public void should_return_all_books(){
        BookRepository bookRepository = mock(BookRepository.class);
        IBookService bookService = new BookService(bookRepository);

        List<Books> books = new ArrayList<>();
        books.add(new Books(1,"The Girl in Room 105"));
        books.add(new Books(2, "Indian Superfoods"));
        books.add(new Books(3,"Angels And Demons"));
        books.add(new Books(4,"Angels & Demons - Movie Tie-In"));
        books.add(new Books(5,"Origin"));

        Mockito.when(bookRepository.findAll()).thenReturn(books);


        books = bookService.getAllBooks();

        assertNotNull(books);
        assertEquals(5, books.size());

    }

    @Test
    public void should_return_book_for_given_id(){

        BookRepository bookRepository = mock(BookRepository.class);
        IBookService bookService = new BookService(bookRepository);

        Books books = new Books(1, "book title");
        Mockito.when(bookRepository.findById(1)).thenReturn(Optional.of(books));
        Books book =  bookService.getBookById(1);

        assertNotNull(book);

        assertEquals(1, book.getId());

    }
}
