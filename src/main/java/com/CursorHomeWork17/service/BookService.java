package com.CursorHomeWork17.service;

import com.CursorHomeWork17.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findByIndex(Long index);

    List<Book> getByOrderRateDesc();

    void saveBook(Book book);

    void deleteBookById(String id);
}
