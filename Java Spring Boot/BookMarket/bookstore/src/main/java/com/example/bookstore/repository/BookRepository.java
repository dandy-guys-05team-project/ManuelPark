package com.example.bookstore.repository;

import java.util.List;

import com.example.bookstore.domain.Book;

public interface BookRepository {
    List<Book> getAllBookList();
}
