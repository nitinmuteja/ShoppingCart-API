package shoppingcart;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import shoppingcart.application_name.controller.BookController;
import shoppingcart.application_name.model.Books;
import shoppingcart.application_name.model.IBookService;

import static org.mockito.Mockito.mock;

public class BookControllerTests {



    @Test
    public void get_books_should_return_books_list(){

        IBookService bookService = mock(IBookService.class);
        BookController controller = new BookController(bookService);

        Assert.assertNotNull(controller.getBooks());

    }

    @Test
    public void get_books_should_call_books_service_to_get_book_details(){


        IBookService bookService = mock(IBookService.class);
        BookController controller = new BookController(bookService);

        controller.getBooks();

        Mockito.verify(bookService, Mockito.times(1)).getAllBooks();

    }


    @Test
    public void get_book_by_id_should_return_books_details(){


        IBookService bookService = mock(IBookService.class);
        BookController controller = new BookController(bookService);

        controller.getBooksById(1);

        Mockito.verify(bookService, Mockito.times(1)).getBookById(1);

    }
}
