package shoppingcart;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import shoppingcart.application_name.controller.BookController;
import shoppingcart.application_name.model.Books;
import shoppingcart.application_name.model.IBookService;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@WebMvcTest(BookController.class)
public class BookControllerIntegrationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IBookService bookService;

    @Test
    public void shouldFetchBooks() throws Exception {
        mockMvc.perform(
                get("/books"))
                .andExpect(status().isOk());
    }

    @Test
    public void shouldFetchBook() throws Exception {
        mockMvc.perform(
                get("/book?id=1"))
                .andExpect(status().isOk());
    }


}
