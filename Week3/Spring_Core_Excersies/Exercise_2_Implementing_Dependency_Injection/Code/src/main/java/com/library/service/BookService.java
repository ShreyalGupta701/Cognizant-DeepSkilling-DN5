package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    //Setter Method for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void startService() {
        System.out.println("shreyal's BookService is running!");
        bookRepository.startService();
    }
}