package com.example.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.domain.Book;
import com.example.bookstore.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBookList() {
        return bookRepository.getAllBookList();
    }
}
