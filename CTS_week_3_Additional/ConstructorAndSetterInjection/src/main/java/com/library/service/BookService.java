package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private final String name;

    public BookService(String name) {
        this.name = name;
        System.out.println("Constructor Injection: name = " + name);
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection: repository set");
    }

    public void addBook(String bookName) {
        System.out.println("Adding book: " + name);
        bookRepository.saveBook(bookName);
    }
}
