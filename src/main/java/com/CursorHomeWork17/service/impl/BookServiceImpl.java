package com.CursorHomeWork17.service.impl;

import com.CursorHomeWork17.model.Book;
import com.CursorHomeWork17.repository.BookRepository;
import com.CursorHomeWork17.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findByIndex(Long index) {
        return bookRepository.findByIndex(index);
    }

    @Override
    public List<Book> getByOrderRateDesc() {
        return bookRepository.findAllByOrderByRateDesc();
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBookById(String id) {
        bookRepository.deleteById(id);
    }
}
