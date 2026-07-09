package com.library.repository;

public class BookRepository {
    private final BookRepository bookRepository;
 //constructor
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void startService() {
        String message = "shreyal's BookService started successfully";
        System.out.println(message);
        bookRepository.findAllBooks();
    }
}