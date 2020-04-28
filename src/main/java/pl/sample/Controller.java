package pl.sample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private static final List<Book> listOfBooks = new ArrayList<Book>();

    static {
        listOfBooks.add(new Book("Tolkien","Hobbit","5"));
        listOfBooks.add(new Book("Tolkien","The Lord of the Ring","6"));
        listOfBooks.add(new Book("Tolkien","Silmarillion","4"));
    }

    @GetMapping("/books/all")
    @ResponseBody
    public String getAllBooks() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(listOfBooks);
    }
}