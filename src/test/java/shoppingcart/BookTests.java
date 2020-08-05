package shoppingcart;

import org.junit.Test;
import shoppingcart.application_name.model.Books;

import static org.junit.Assert.assertEquals;

public class BookTests {

    @Test
    public void should_instantiate_book_with_id_and_title(){

        Books book = new Books(1, "book title");

        assertEquals(1, book.getId());
        assertEquals("book title", book.getTitle());
    }

    @Test
    public void should_return_author_name_given_id_and_title(){

        Books book = new Books(1, "book title");
        book.setAuthor("book author");

        assertEquals("book author", book.getAuthor());
    }

    @Test
    public void should_return_price_given_id_and_title(){

        Books book = new Books(1, "book title");
        book.setPrice(500);

        assertEquals(500, book.getPrice());
    }

    @Test
    public void should_return_rating_given_id_and_title(){

        Books book = new Books(1, "book title");
        book.setRating(3);

        assertEquals(3, book.getRating());
    }

    @Test
    public void should_return_description_given_id_and_title(){

        Books book = new Books(1, "book title");
        book.setDescription("The Da Vinci Code', 'http://books.google.com/books/content?id=ivzfRJGrdFsC&printsec=frontcover&img=1&zoom=5',348, '*INCLUDES AN EXTRACT FROM ORIGIN,THE NEW THRILLER BY DAN BROWN: OUT NOW* --------------------------------------------------------------------------------------------------- Harvard professor Robert Langdon receives an urgent late-night phone call while on business in Paris: the elderly curator of the Louvre has been brutally murdered inside the museum. Alongside the body, police have found a series of baffling codes. As Langdon and a gifted French cryptologist, Sophie Neveu, begin to sort through the bizarre riddles, they are stunned to find a trail that leads to the works of Leonardo Da Vinci - and suggests the answer to a mystery that stretches deep into the vault of history. Unless Langdon and Neveu can decipher the labyrinthine code and quickly assemble the pieces of the puzzle, a stunning historical truth will be lost forever");

        assertEquals("The Da Vinci Code', 'http://books.google.com/books/content?id=ivzfRJGrdFsC&printsec=frontcover&img=1&zoom=5',348, '*INCLUDES AN EXTRACT FROM ORIGIN,THE NEW THRILLER BY DAN BROWN: OUT NOW* --------------------------------------------------------------------------------------------------- Harvard professor Robert Langdon receives an urgent late-night phone call while on business in Paris: the elderly curator of the Louvre has been brutally murdered inside the museum. Alongside the body, police have found a series of baffling codes. As Langdon and a gifted French cryptologist, Sophie Neveu, begin to sort through the bizarre riddles, they are stunned to find a trail that leads to the works of Leonardo Da Vinci - and suggests the answer to a mystery that stretches deep into the vault of history. Unless Langdon and Neveu can decipher the labyrinthine code and quickly assemble the pieces of the puzzle, a stunning historical truth will be lost forever", book.getDescription());
    }
}
