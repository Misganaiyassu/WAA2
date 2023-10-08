package com.example.assignmnet3.Service;

import org.springframework.stereotype.Service;

@Service
public interface BookService {

        String getAllBooks();

        void addBook(com.example.lab3.Model.Book book);

        void updateBook(int id, com.example.lab3.Model.Book book);

        void deleteBook(int id);

        com.example.lab3.Model.Book getBookById(Integer id);
}
