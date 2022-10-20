package com.CursorHomeWork17.repository;

import com.CursorHomeWork17.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

    Book findByIndex(Long index);

    List<Book> findAllByOrderByRateDesc();

}
