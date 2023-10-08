package com.example.lab1b.Controller; // Corrected package name to follow naming conventions

import com.example.lab2.Model.Books;


import com.example.lab2.Service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")

public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = "/list", params = "version=1" )
    public String getAllBooks() {

        return  bookService.getAllBooks();
    }

    @GetMapping("/getBook")
    public String getBookById(@RequestParam(required = false, name = "bookId") int id, Books books) {
        books=Books.builder()
                .id(1)
                .title("Lost")
                .isbn("123")
                .build();

        return "books";
    }

    @GetMapping("/{id}")
    public String getBookById2(@PathVariable int id, Books books) {
         books = Books.builder()
                .id(id)
                .title("Lost")
                .isbn("123")
                .build();

        return "books";
    }

    @GetMapping("/{bookId}/comments/{cid}")
    public String getBookCommentByBookIdAndCommentId(@PathVariable int bookId, @PathVariable int cid, Books books) {
       books= Books.builder()
                .id(bookId)
                .title(String.valueOf(cid))
                .isbn("123")
                .build();

        return "books";
    }

    @GetMapping("/getBookByTitle")
    public String getBookByTitle(@RequestParam(required = false, name = "bookTitle") String title, Books books) {
       books= Books.builder()
                .id(1)
                .title(title)
                .isbn("123")
                .build();

        return "books";
    }

    @GetMapping("/getBookByIsbn")
    public String getBookByIsbn(@RequestParam(required = false, name = "bookIsbn") String isbn, Books books) {
        books= Books.builder()
                .id(1)
                .title("Lost")
                .isbn(isbn)
                .build();

        return "books";
    }
}
