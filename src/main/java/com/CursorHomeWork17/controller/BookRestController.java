package com.CursorHomeWork17.controller;

import com.CursorHomeWork17.dto.BookDTO;
import com.CursorHomeWork17.model.Book;
import com.CursorHomeWork17.service.BookService;
import com.CursorHomeWork17.util.ObjectMapperUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookRestController {

    private final BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/getAll")
    public List<BookDTO> getAllBooks() {
        return ObjectMapperUtils.mapAll(bookService.findAll(), BookDTO.class);
    }

    @GetMapping(value = "/byBookIndex/{index}")
    public BookDTO getBookByBookIndex(@PathVariable Long index) {
        return ObjectMapperUtils.map(bookService.findByIndex(index), BookDTO.class);
    }

    @GetMapping(value = "/orderByRate")
    public List<BookDTO> getByOrderRateDesc() {
        return ObjectMapperUtils.mapAll(bookService.getByOrderRateDesc(), BookDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveBook(@RequestBody BookDTO bookDTO) {
        bookService.saveBook(ObjectMapperUtils.map(bookDTO, Book.class));
        return new ResponseEntity<>("Book added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{index}")
    public ResponseEntity<?> deleteBookByBookIndex(@PathVariable Long index) {
        bookService.deleteBookById(bookService.findByIndex(index).getId());
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }

}
