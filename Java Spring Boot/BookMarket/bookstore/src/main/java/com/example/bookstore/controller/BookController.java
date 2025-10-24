package com.example.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bookstore.domain.Book;
import com.example.bookstore.service.BookService;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String requestBookList(Model model) {
        List<Book> list = bookService.getAllBookList();
        model.addAttribute("bookList", list);
        return "books";
    }
}