package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String injectionType;

    // Default constructor for Setter injection
    public BookService() {
        System.out.println("BookService bean created via default constructor");
        this.injectionType = "Setter Injection";
    }

    // Parameterized constructor for Constructor injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService bean created via parameterized constructor .");
        System.out.println("BookRepository injected into BookService via constructor ");
        this.injectionType = "Constructor Injection";
    }

    // Setter method for Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository injected into BookService via setter ");
    }

    public void manageBooks() {
        System.out.println("BookService (Ex 7) managing books using: " + injectionType);
        if (bookRepository != null) {
            bookRepository.findAllBooks();
        } else {
            System.out.println("BookRepository dependency is not injected!");
        }
    }
}
