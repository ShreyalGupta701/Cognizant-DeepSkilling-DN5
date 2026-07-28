package com.library.repository;

public class BookRepository {

    public BookRepository() {
        System.out.println("BookRepository bean created ");
    }

    public void findAllBooks() {
        System.out.println(" Fetching books list.");
    }
}
