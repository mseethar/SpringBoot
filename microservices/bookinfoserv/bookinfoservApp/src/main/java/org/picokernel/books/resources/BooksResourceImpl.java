package org.picokernel.books.resources;

import org.picokernel.books.resources.models.BookInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class BooksResourceImpl implements BooksResource {
    private static final Map<String, BookInfo> books;
    static {
        // Prepare the books map
        BookInfo book = new BookInfo("Cast away", "1231231231231", "Felicia Feral", "Northern Lights");
        Map<String, BookInfo> booksMap = new HashMap<>();
        booksMap.put(book.getName(), book);

        // Make the books Map unmodifiable
        Collections.unmodifiableMap(booksMap);
        books = booksMap;
    }

    public BookInfo getBookByName(String bookName) {
        System.out.println("Getting book by name");
        return books.get(bookName);
    }
}
