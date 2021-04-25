package org.picokernel.books.resources;

import org.picokernel.books.resources.models.BookInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/books")
public interface BooksResource {
    @RequestMapping("/{bookName}")
    public BookInfo getBookByName(@PathVariable("bookName") String bookName);
}
